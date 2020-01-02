package com.feri.car.util;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

/**
 * @program: CarSys
 * @description:
 * @author: Feri
 * @create: 2019-12-11 11:41
 */
public class AliSmsUtil {

    /**
     * 发送短信验证码 有效期10分钟
     * @param code 验证码 6位*/
    public static void sendSmsCode(int code,String phone){
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4Fqy6DuiSFVtxXqdoSme", "0GhFuhG6nBz6yqEuyu35r3oQADIQDR");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", "万锋教育");
        request.putQueryParameter("TemplateCode", "SMS_180049841");
        request.putQueryParameter("TemplateParam", "{\"code\":\""+code+"\"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }

}
