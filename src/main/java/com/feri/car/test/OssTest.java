package com.feri.car.test;

import com.feri.car.util.AliOssUtil;
import org.junit.Test;

public class OssTest {
    @Test
    public void test(){
        String upload = AliOssUtil.upload("hello", "{msg:'天亮了'}");
        System.out.println(upload);
    }
}
