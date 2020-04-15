package com.feifan.compent;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

/**
 * @author Donald
 * @create 2020-03-08 22:58
 */
@Component
public class KafakaProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafakaProducer.class);

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    private Gson gson = new GsonBuilder().create();

    public void send(){
        for (int i = 0; i < 5; i++) {
            Message message = new Message();
            message.setId(System.currentTimeMillis());
            message.setMsg(UUID.randomUUID().toString()+""+i);
            message.setSendTime(new Date());
            kafkaTemplate.send("hello",gson.toJson(message));
        }

    }


}
