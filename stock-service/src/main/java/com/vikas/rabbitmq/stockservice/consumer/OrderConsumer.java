package com.vikas.rabbitmq.stockservice.consumer;

import com.vikas.rabbitmq.basedomains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @RabbitListener(queues = "${rabbitmq.queue.order.name}")
    public void consumeJson(OrderEvent orderEvent) {
        LOGGER.info(String.format("Order event received in Stock service --> %s", orderEvent.toString()));
    }
}
