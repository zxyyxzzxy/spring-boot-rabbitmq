package com.zxy.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }

    @Bean
    public Queue zxyQueue() {
        return new Queue("zxy");
    }

    @Bean
    public Queue objectQueue() {
        return new Queue("object");
    }


}
