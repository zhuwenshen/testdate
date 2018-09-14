package com.zhuwenshen.testdate.model;


import lombok.*;
import lombok.experimental.Accessors;

/**
 * @author zhuwenshen
 * @date 2018-09-14 16:09
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ToString
public class User {
    private String name;
    private String password;
}
