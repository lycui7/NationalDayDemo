package cn.albert.demo;

import cn.albert.domain.Animal;
import cn.albert.domain.Cat;
import cn.albert.domain.Dog;
import cn.albert.domain.Person;

import java.util.Objects;

/**
 * @author albert.cui
 * @date 2018/10/1 21:22
 */
public class Demo6_type extends Animal<Person> {
    public Demo6_type() {
    }

    public static void main(String[] args) {
        Animal animal = new Demo6_type();
        Object model = animal.getModel();
        System.out.println(model.toString());

    }
}
