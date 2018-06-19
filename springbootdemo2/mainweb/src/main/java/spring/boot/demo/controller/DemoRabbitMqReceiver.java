package spring.boot.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息队列接收类 
 */  
@Component
@RabbitListener(queues = "test-quen")
public class DemoRabbitMqReceiver {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());


    @RabbitHandler
    public void process(String content) {
        System.out.println("Receiver : " + content);
        logger.info("rabbitmq-Test : " + content);
    }



  
}  