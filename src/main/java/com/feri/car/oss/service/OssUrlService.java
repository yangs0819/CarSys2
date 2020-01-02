package com.feri.car.oss.service;

import com.feri.car.common.vo.R;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

public interface OssUrlService {
    //上传
    R upload(MultipartFile file);
    //查询所有信息
    R queryAll();
    //查询oss对象信息
    R queryOssAll();
    //删除
    R delete(String objname);
}
