package com.zhuwenshen.testdate.util;

import com.zhuwenshen.testdate.model.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhuwenshen
 * @date 2018-09-14 16:57
 */
@Component
public class UserHolder {
    public static ConcurrentHashMap<String, User> allUser = new ConcurrentHashMap<String, User>();

    @PostConstruct
    public void init(){
        User user = new User("laojinjin","123456");
        save(user);
    }

    public static void save(User user){
        allUser.put(user.getName(),user);
    }

    public static User get(String name){
        return allUser.get(name);
    }

    public static boolean check(String name, String password){
        User u = allUser.get(name);
        if(u == null){
            return false;
        }

        if(u.getPassword()!=null&&u.getPassword().equals(password)){
            return true;
        }

        return true;
    }
}
