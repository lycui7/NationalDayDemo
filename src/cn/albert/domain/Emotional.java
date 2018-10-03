package cn.albert.domain;

import lombok.Getter;

/**
 * @author albert.cui
 * @date 2018/10/2 15:00
 */
@Getter
public enum Emotional {
   /*
   secrecy:保密
    */
    SECRECY(1,"保密"),SINGLE(2,"单身"),MARRIED(3,"已婚"),DIVORCE(4,"离异");
    private int code;
    private String value;
    private Emotional(int code,String value) {
        this.code = code;
        this.value = value;
    }

    @Override
    public String toString() {
        return code+" "+value;
    }
}
