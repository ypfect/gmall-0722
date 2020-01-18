package com.atguigu.gmall.pms.config;

import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;


/**
 * @Description
 * @Author stanley.yu
 * @Date 2020/1/17 18:15
 */
@Component
@Slf4j
public class Rconfig {
    /**
     * ignoreDeclarationExceptions 忽略声明异常，可能多个项目都需要绑定。声明，就会异常
     * @param skuId
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "gmall-search-queue", durable = "true"),
            exchange = @Exchange(value = "GMALL-PMS-EXCHANGE", type = ExchangeTypes.TOPIC, ignoreDeclarationExceptions = "true"),
            key = {"item.insert", "item.update","item.test"}
    ))
    public void listener(@Payload String message, @Header(AmqpHeaders.DELIVERY_TAG) long deliveryTag, Channel channel) throws IOException {
        log.info(message);
        System.out.println(deliveryTag);
        channel.basicAck(deliveryTag,false);
    }
}
