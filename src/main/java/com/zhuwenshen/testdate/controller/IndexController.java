package com.zhuwenshen.testdate.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhuwenshen
 * @date 2018-09-14 15:53
 */
@Controller
@Slf4j
public class IndexController {

    @GetMapping("/index")
    public String index(Model model){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String tihsTime = simpleDateFormat.format(new Date());
        model.addAttribute("tihsTime", tihsTime);
        log.info("现在时间是"+tihsTime);
        return "index";
    }
}
