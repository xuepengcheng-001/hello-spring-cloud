package com.xue.zhellorabbit.hello;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "helloRabbit")
public class RabbitConsumer {

    @RabbitHandler
    public void process(String msg){
        System.out.println("Consumer:"+msg);
    }
}
