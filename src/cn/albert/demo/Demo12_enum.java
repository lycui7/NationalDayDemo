package cn.albert.demo;

import cn.albert.domain.Emotional;

/**
 * @author albert.cui
 * @date 2018/10/2 15:08
 * 枚举类的构造方法只能为private,外部无法创建对象
 * 枚举值会调用构造方法
 * toString()返回枚举值的名称，可以自己重写DIY
 * name()返回枚举实例的名称，枚举值
 */
public class Demo12_enum {
    public static void main(String[] args) {
        System.out.println(Emotional.DIVORCE.getValue());
        System.out.println(Emotional.DIVORCE.getCode());
        System.out.println("--------------------");
        Emotional[] values = Emotional.values();
        for (Emotional value : values) {
            System.out.println(value);
        }
        System.out.println("-----------------");
        System.out.println(Emotional.DIVORCE.toString());
        System.out.println(Emotional.DIVORCE.name());
        int result = Emotional.DIVORCE.compareTo(Emotional.MARRIED);
        System.out.println(result);
        Emotional married = Emotional.valueOf("MARRIED");
        System.out.println(married);
    }
}
