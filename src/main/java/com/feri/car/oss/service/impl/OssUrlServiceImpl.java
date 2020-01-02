package com.feri.car.oss.service.impl;

import com.feri.car.common.vo.R;
import com.feri.car.oss.dao.OssUrlDao;
import com.feri.car.oss.entity.OssUrl;
import com.feri.car.oss.service.OssUrlService;
import com.feri.car.util.AliOssUtil;
import com.feri.car.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.UUID;
@Service
public class OssUrlServiceImpl implements OssUrlService {
    @Autowired
    private OssUrlDao urlDao;
    @Override
    public R upload(MultipartFile file) {
        //校验文件是否为空
        if (!file.isEmpty()){
            //2获取上传的文件名
            String fn = file.getOriginalFilename();
            fn = rename(fn);
            try {
                Date date = DateUtil.addYear(3);
                //                //上传到oss服务器
                String u = AliOssUtil.upload(fn, file.getBytes(),date);
                OssUrl ossUrl = new OssUrl();
                ossUrl.setUrl(u);
                ossUrl.setObjname(fn);
                ossUrl.setEndtime(date);
                 urlDao.insert(ossUrl);

                 return R.Ok(ossUrl);

            }catch (Exception e){
                    e.printStackTrace();
            }

        }
        return R.fail();
    }

    @Override
    public R queryAll() {
        return R.Ok(urlDao.selectAll());
    }

    @Override
    public R queryOssAll() {
        return R.Ok(AliOssUtil.list());
    }

    @Override
    public R delete(String  objname) {
        if (AliOssUtil.del(objname)){
            urlDao.delete(objname);
            return R.Ok();
        }else {
            return R.fail();
        }
    }

    //截取文件名 重命名
    private String rename(String fn){
        if (fn.length() > 40){
            fn = fn.substring(fn.length() - 40);
        }
        return UUID.randomUUID().toString()+"_"+fn;
    }


}
