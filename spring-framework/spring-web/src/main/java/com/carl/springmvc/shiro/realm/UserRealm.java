package com.carl.springmvc.shiro.realm;

import com.carl.springmvc.constant.LoginConstants;
import com.carl.springmvc.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description 自定义realm 进行登录验证
 * @Author carl.he
 * @Date 2019/6/25 10:38
 * @Version 1.0
 **/
public class UserRealm extends AuthorizingRealm {
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        Subject subject = SecurityUtils.getSubject();
        AuthorizationInfo cacheInfo = (AuthorizationInfo) subject.getSession().getAttribute(LoginConstants.AUTHORIZATION_INFO_KEY);
        if(this.isCachingEnabled()&&cacheInfo!=null){
            return cacheInfo;
        }
        String account = (String) super.getAvailablePrincipal(principals);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        User user = new User();
        user.setName(account);
        user.setPassword("123456");
        Set<String> roleSet = new HashSet<>();
        roleSet.add("系统操作管理员");
        info.setRoles(roleSet);
        if(subject.getSession().getAttribute(LoginConstants.LOGIN_STATE_KEY) == null){
            subject.getSession().setAttribute(LoginConstants.LOGIN_STATE_KEY, user);
        }

        subject.getSession().setAttribute(LoginConstants.AUTHORIZATION_INFO_KEY,info);
        System.out.println(principals);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("————身份认证方法————");
        UsernamePasswordToken userToken = (UsernamePasswordToken) token;
        //从数据库获取对应用户名密码的用户
        String userName = userToken.getUsername();
        String password = new String((char[]) token.getCredentials());
        if (!"carl".equals(userName)) {
            throw new AccountException("用户名不正确");
        } else if (!"123456".equals(password)) {
            throw new AccountException("密码不正确");
        }
        return new SimpleAuthenticationInfo(token.getPrincipal(), password, getName());
    }
}
