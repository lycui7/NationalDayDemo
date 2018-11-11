package cn.albert.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * 项目遇到并发修改异常，温习一遍
 * @author albert.cui
 * @date 2018/11/11 22:33
 */
public class Demo_ConcurrentModify {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("ghi");
        list.add("def");
        list.add("ghi");
        list.add("ghi");
        list.add("mno");
        list.add("ghi");
        list.add("mno");
        list.add("ghi");
        System.out.println(list.hashCode());
        System.out.println(list.toString());
        System.out.println("----------------");
        //增强for循环底层用的是迭代器
        /*for (Object o : list) {
            if("ghi".equals(o)) {
             list.remove(o);
            }
        }*/
        /*for (int i = 0; i < list.size(); i++) {
            if("ghi".equals(list.get(i))) {
                list.remove(i);
                i--;
            }
        }*/
        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()) {
            if("ghi".equals(listIterator.next())) {
                listIterator.remove();
                listIterator.add("ihg");
            }
        }
        System.out.println(list);
    }
}
