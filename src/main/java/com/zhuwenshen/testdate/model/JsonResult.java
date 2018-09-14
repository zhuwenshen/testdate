package com.zhuwenshen.testdate.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static javafx.scene.input.KeyCode.J;

/**
 * @author zhuwenshen
 * @date 2018-09-14 16:48
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JsonResult {
    private Boolean status;
    private String msg;
    //private Integer code;
    private Object data;

    public static JsonResult ok() {
        return new JsonResult(true, "", null);
    }

    public static JsonResult ok(String msg) {
        return new JsonResult(true, msg, null);
    }

    public static JsonResult ok(String msg, Object data) {
        return new JsonResult(true, msg, data);
    }

    public static JsonResult fail() {
        return new JsonResult(false, "", null);
    }

    public static JsonResult fail(String msg) {
        return new JsonResult(false, msg, null);
    }

    public static JsonResult fail(String msg, Object data) {
        return new JsonResult(false, msg, data);
    }

}
