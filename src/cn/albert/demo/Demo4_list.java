package cn.albert.demo;

import cn.albert.domain.Person;

import java.util.*;

/**
 * @author albert.cui
 * @date 2018/10/1 13:24
 * 1.ListIterator接口在Iterator的基础上增加了反向迭代
 *
 */
public class Demo4_list {
    public static void main(String[] args) {
        //test1();
        //new ArrayList<>();//基于数组实现的，是一个数组队列。可以动态的增加容量
       // new LinkedList<>();//基于链表实现的，是一个双向循环列表
       // new Vector<>();//基于数组实现的，是一个矢量队列，是线程安全的
       // new Stack<>();//基于数组实现的，是栈，它继承自Vector，特性是FILO（先进后出）
        List list1 = new Stack();
        list1.add("albert");
        list1.add("Choosl");
        list1.add(8088);
        list1.add(new Person("san",12,'F'));
        list1.add(true);
        ListIterator listIterator = null;
        for(listIterator = list1.listIterator(); listIterator.hasNext();) {
            System.out.println(listIterator.next());

        }
        for(; listIterator.hasPrevious();) {
            System.out.println(listIterator.previous());

        }
       /*  Iterator<Object> iterator = null;
        for(iterator = list1.iterator() ;  iterator.hasNext();) {
            System.out.println(iterator.next());
        }*/
    }

    private static void test1() {
        List<Object> list1 = new ArrayList();
        list1.add("albert");
        list1.add("Choosl");
        list1.add(8088);
        list1.add(new Person("san",12,'F'));
        list1.add(true);
       /* for (Object o : list1) {
            System.out.println(o);

        }*/
        /*for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }*/
       /* Iterator<Object> iterator = null;
        for(iterator = list1.iterator() ;  iterator.hasNext();) {
            System.out.println(iterator.next());
        }*/
    }
}
