package com.atguigu.gmall.pms.config;

import com.alibaba.fastjson.JSON;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import springfox.documentation.spring.web.json.Json;

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
    public void listener(@Payload String message, Message messageInfo,@Header(AmqpHeaders.DELIVERY_TAG) long deliveryTag, Channel channel) throws IOException {
        log.info(message);
        log.info("message info ={}", JSON.toJSONString(messageInfo));

        //multiple 一次性ack 所有位置在deliverytag之前的消息。
//        channel.basicAck(deliveryTag,false);

        //消费失败就拒绝ack
//        channel.basicNack(deliveryTag,false,true);
//        channel.basicAck(deliveryTag,false);



        // multiple 批量拒绝，还有一个单个拒绝的方法 reject xxx  requeue 重新进入队列。还是在队头，马上又发
        //
//        channel.basicNack(deliveryTag,false,true);

        //如果设置不重新入队，直接就丢弃消息了。。
//        channel.basicNack(deliveryTag,false,false);

        //如果消费失败了，但是选择了重新入队的话，又是在队头可能造成死循环。
        // 这个时候可以选择先确认消息。然后在发送这个消息在消息队列里面去。
    }
}
