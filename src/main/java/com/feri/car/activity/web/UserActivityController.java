package com.feri.car.activity.web;

import com.feri.car.activity.entity.UserActivity;
import com.feri.car.activity.service.UserActivityService;
import com.feri.car.common.vo.R;
import com.feri.car.config.SystemConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api(value = "实现用户活动的相关操作",tags = "实现用户活动的相关操作")
@RestController
public class UserActivityController {

    @Autowired
    private UserActivityService activityService;
    @ApiOperation(value = "实现用户活动报名",notes = "实现用户活动报名")
    @PostMapping("/api/useractivity/save.do")
    public R save(@RequestBody UserActivity activity){
        return activityService.save(activity);
    }

    @ApiOperation(value = "实现用户查询所有未失效活动",notes = "实现用户查询所有未失效活动")
    @GetMapping("/api/useractivity/all.do")
    public R list(HttpServletRequest request){
        return activityService.queryById(request.getHeader(SystemConfig.TOKEN_USER));
    }
}
