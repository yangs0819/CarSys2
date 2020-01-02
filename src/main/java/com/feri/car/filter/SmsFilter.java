package com.feri.car.filter;
import com.alibaba.fastjson.JSON;
import com.feri.car.common.vo.R;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class SmsFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //实现短信发送的频率校验
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        //1校验当前请求是不是发送短信
        if (request.getRequestURI().endsWith("/sms/sendcode.do")){
            //2,频率校验

            boolean r = false;

            if (r){
                filterChain.doFilter(servletRequest,servletResponse);
            }else {
                HttpServletResponse response = (HttpServletResponse)servletResponse;
                response.getWriter().println(JSON.toJSONString(R.fail("已达上线")));
            }

            filterChain.doFilter(servletRequest,servletResponse);

        }
    }
}
