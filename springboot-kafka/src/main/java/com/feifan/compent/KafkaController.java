package com.feifan.compent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Donald
 * @create 2020-03-08 23:19
 */
@Controller
@RequestMapping("kafka")
public class KafkaController {

    @Autowired
    private KafakaProducer producer;

    @GetMapping("kafka")
    @ResponseBody
    public String testKa(){
        producer.send();
        return "OK";
    }
}
