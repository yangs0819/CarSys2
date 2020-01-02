package com.feri.car.msg.dao;


import com.feri.car.msg.entity.Message;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageMapper {


    int insert(Message record);

    List<Message> selectAll(int uid);

    Message selectById(int id);


}