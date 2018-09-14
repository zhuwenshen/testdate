package com.zhuwenshen.testdate.controller;

import com.zhuwenshen.testdate.model.JsonResult;
import com.zhuwenshen.testdate.model.User;
import com.zhuwenshen.testdate.util.UserHolder;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


/**
 * @author zhuwenshen
 * @date 2018-09-14 16:42
 */
@Controller
@Slf4j
public class LoginController {

    @GetMapping("/")
    public String gotoLogin(){
        return "login";
    }

    @PostMapping("login")
    @ResponseBody
    public JsonResult login(User user, HttpSession session){
        log.info(user.toString());
        if(StringUtils.isEmpty(user.getName())){
            return JsonResult.fail("用户名不能为空");
        }

        if(StringUtils.isEmpty(user.getPassword())){
            return JsonResult.fail("密码不能为空");
        }

        if(UserHolder.check(user.getName(),user.getPassword())){
            session.setAttribute("user", user);
            return JsonResult.ok("登录成功");
        }

        return JsonResult.fail("用户名不存在或者密码错误");
    }
}
