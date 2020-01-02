package com.feri.car.msg.service;

import com.feri.car.common.vo.R;
import com.feri.car.msg.entity.Message;

import java.util.List;

public interface MessageService {
    R save(Message message);

    R queryAll(String token);

    R queryById(int id);


}
