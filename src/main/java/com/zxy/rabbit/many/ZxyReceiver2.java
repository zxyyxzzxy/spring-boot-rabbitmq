package com.zxy.rabbit.many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "zxy")
public class ZxyReceiver2 {

    @RabbitHandler
    public void process(String zxy) {
        System.out.println("Receiver 2: " + zxy);
    }

}
