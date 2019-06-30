package com.carl.springmvc.controller;

import com.carl.springmvc.constant.LoginConstants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @Description 登录Controller
 * @Author carl.he
 * @Date 2019/6/25 11:54
 * @Version 1.0
 **/
@Controller
public class LoginController {

    /**
     * @Author carl.he
     * @Description 登出
     * @Date 2019/6/25 14:56
     * @param
     * @return {@link String}
     **/
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        //注销
        subject.logout();
        return "redirect:/login.jsp";
    }

    /**
     * 登陆
     *
     * @param map 存储用户名和密码的map
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public ModelAndView login(@RequestBody Map<String,String> map) {
        // 从SecurityUtils里边创建一个 subject
        Subject user = SecurityUtils.getSubject();
        // 在认证提交前准备 token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken(map.get("username"), map.get("password"));
        // 执行认证登陆
        user.login(token);
        user.getSession().setTimeout(LoginConstants.SESSION_VALID_TIME_IN_SEC);
        //根据权限，指定返回数据
        if ("carl".equals(map.get("username")) && "123456".equals(map.get("password"))) {
            return new ModelAndView("redirect:/", "errorMsg", "");
        }else {
            token.clear();
            return new ModelAndView("/login.jsp", "errorMsg", "用户名或密码不正确!");
        }
    }
}
