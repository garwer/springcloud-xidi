package com.garwer.product.amq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageListener {
   // @RabbitListener(queues = "linjw")
    //自动创建
   @RabbitListener(queuesToDeclare = @Queue("linjw"))
    public void process(String msg) {
        log.info("msg{}" + msg);
    }
}
