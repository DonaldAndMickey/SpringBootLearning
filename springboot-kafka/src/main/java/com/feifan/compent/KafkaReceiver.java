package com.feifan.compent;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.Optional;

/**
 * @author Donald
 * @create 2020-03-08 23:14
 */
//@Component
public class KafkaReceiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaReceiver.class);

    @KafkaListener(topics = {"hello"})
    public void kafkaLister(ConsumerRecord<?,?> record){
        if (Optional.ofNullable(record.value()).isPresent()){
            Object value = record.value();
            System.err.println( "---"+value );
        }

    }
}
