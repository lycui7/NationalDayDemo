package cn.albert.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author albert.cui
 * @date 2018/10/1 21:42
 */
@Getter
@Setter
public class Dog {
    private String dogName;
    private Integer dogAge;
    public void sayHello() {
        System.out.println("I am a Dog");
    }
}
