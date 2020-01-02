package com.feri.car.msg.web;

import com.feri.car.common.vo.R;
import com.feri.car.config.SystemConfig;
import com.feri.car.msg.entity.Message;
import com.feri.car.msg.service.MessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api(value = "实现消息的相关操作",tags = "实现消息的相关操作")
@RestController
public class MessageController {
    @Autowired
    private MessageService messageService;

    @ApiOperation(value = "实现消息的发送",notes = "实现消息的发送")
    @GetMapping("/api/message/sendMessage.do")
    public R send(@RequestBody Message message){
        return messageService.save(message);
    }

    //查询消息列表
    @ApiOperation(value = "实现查询消息列表",notes = "实现查询消息列表")
    @GetMapping("/api/message/queryMessage.do")
    public R queryMessage(HttpServletRequest request){
        return R.Ok(messageService.queryAll(request.getHeader(SystemConfig.TOKEN_USER)));
    }

    //查询消息详情
    @ApiOperation(value = "实现消息详情查询",notes = "实现消息详情查询")
    @GetMapping("/api/message/selectById.do")
    public R selectById(int id){
        return R.Ok(messageService.queryById(id));
    }

}
