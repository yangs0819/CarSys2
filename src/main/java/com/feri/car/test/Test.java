package com.feri.car.test;

import com.feri.car.util.JwtUtil;

import java.util.Base64;

public class Test {
    @org.junit.Test
    public void Base64(){
        String a = "abc";
        //编码
        String b = Base64.getEncoder().encodeToString(a.getBytes());
        System.out.println("base64"+b);
        //解码
        System.out.println(new String(Base64.getDecoder().decode(b)));
    }


    @org.junit.Test
    public void JWTtest(){
        String a = "admin";
        String s = JwtUtil.createJWT(1+"",30,a);
        System.out.println(s);

    }
}
