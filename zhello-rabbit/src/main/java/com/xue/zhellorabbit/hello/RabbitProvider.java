package com.xue.zhellorabbit.hello;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class RabbitProvider {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String msg = "Hello "+ new Date();
        System.out.println("Provider:"+msg);
        amqpTemplate.convertAndSend("helloRabbit",msg);

    }
}
