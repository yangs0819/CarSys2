package com.feri.car.activity.service.impl;

import com.feri.car.activity.dao.UserActivityMapper;
import com.feri.car.activity.entity.UserActivity;
import com.feri.car.activity.service.UserActivityService;
import com.feri.car.common.vo.R;
import com.feri.car.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserActivityServiceImpl implements UserActivityService {
    @Autowired
    private UserActivityMapper activityMapper;
    @Override
    public R save(UserActivity us) {
        if (activityMapper.insert(us) > 0){
            return R.Ok();
        }else {
            return R.fail();
        }
    }

    @Override
    public R queryById(String token) {
        int uid = Integer.parseInt(JwtUtil.parseJWT(token));
        return R.Ok(activityMapper.selectById(uid));
    }
}
