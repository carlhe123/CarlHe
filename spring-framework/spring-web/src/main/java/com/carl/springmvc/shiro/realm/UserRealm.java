package com.carl.springmvc.shiro.realm;

import com.carl.springmvc.beans.Permission;
import com.carl.springmvc.beans.Role;
import com.carl.springmvc.constant.LoginConstants;
import com.carl.springmvc.beans.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;

import java.util.Collection;
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
        System.out.println("===执行授权===");

        Subject subject = SecurityUtils.getSubject();
        User user = (User)subject.getPrincipal();
        if(user != null){
            SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
            // 角色与权限字符串集合
            Collection<String> rolesCollection = new HashSet<>();
            Collection<String> premissionCollection = new HashSet<>();
            // 读取并赋值用户角色与权限
            Set<Role> roles = user.getRoles();
            for(Role role : roles){
                rolesCollection.add(role.getName());
                Set<Permission> permissions = role.getPermissions();
                for (Permission permission : permissions){
                    premissionCollection.add(permission.getUrl());
                }
                info.addStringPermissions(premissionCollection);
            }
            info.addRoles(rolesCollection);
            return info;
        }
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("===执行认证===");

        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken)token;
        User bean = new User();
        bean.setUsername("carl");
        bean.setPassword("123456");
//                userService.findByName(token.getUsername());

        if(bean == null){
            throw new UnknownAccountException();
        }

        ByteSource credentialsSalt = ByteSource.Util.bytes(bean.getUsername());

        return new SimpleAuthenticationInfo(bean, bean.getPassword(),
                credentialsSalt, getName());
    }
}
