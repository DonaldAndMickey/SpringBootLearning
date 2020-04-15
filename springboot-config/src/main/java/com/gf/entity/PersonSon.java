package com.gf.entity;

import org.springframework.stereotype.Component;

/**
 * @author Donald
 * @create 2020-04-04 22:16
 */
@Component(value = "son")
public class PersonSon  extends Person{

    private String sonName;

    public String getSonName() {
        return sonName;
    }

    public void setSonName(String sonName) {
        this.sonName = sonName;
    }
}
