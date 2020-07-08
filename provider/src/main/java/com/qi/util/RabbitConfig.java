package com.qi.util;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2019/12/5.
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue rabbitQueue(){
        return new Queue("rabbit");
    }

}
