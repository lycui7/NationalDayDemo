package cn.albert.demo;

import cn.albert.domain.Person;

import java.util.*;

/**
 * @author albert.cui
 * @date 2018/9/30 22:44
 * Set集合中不包含重复元素（可去重复）
 * HashSet集合判断两个元素相等的标准是两个对象通过equals方法比较相等，并且两个对象的hashCode()方法返回值相等
 *  TreeSet类型是J2SE中唯一可实现自动排序的类型
 *  LinkedHashSet在迭代访问Set中的全部元素时，性能比HashSet好，但是插入时性能稍微逊色于HashSet
 *  Java对于eqauls方法和hashCode方法是这样规定的：
 *
 * 1、如果两个对象相同，那么它们的hashCode值一定要相同；
 *
 * 2、如果两个对象的hashCode相同，它们并不一定相同
 */
public class Demo3_set {
    public static void main(String[] args) {
        //test1();
        //test2();
        Set<Object> set3 = new TreeSet<>(new Comparator<Object>() {

            @Override
            public int compare(Object o1, Object o2) {
               return o1.toString().length() > o2.toString().length() ? 1:-1;
            }
        });
        set3.add("Albert");
        set3.add("Choosl");
        set3.add("Anne");
        set3.add("Gale");
        set3.add("Sea");
        set3.add("Sea");
        Iterator iterator = set3.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void test2() {
        Set set2 = new LinkedHashSet();
        set2.add("albert");
        set2.add("Choosl");
        set2.add("Anne");
        set2.add("Gale");
        set2.add("Sea");
        set2.add("Sea");
        Iterator iterator = set2.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void test1() {
        Set<Object> set1 =new HashSet<>();
        set1.add("albert");
        set1.add("Choosl");
        set1.add("Anne");
        set1.add("Gale");
        set1.add("Sea");
        set1.add("Sea");
        //方法一
       /* Iterator<String> iterator = set1.iterator();
       while (iterator.hasNext()) {
           String next = iterator.next();
           System.out.println(next);
       }*/
        //方法二
    /*    Iterator<String> iterator = null;
        for(iterator = set1.iterator();iterator.hasNext();) {
            System.out.println(iterator.next());
        }*/
        Person p = new Person("albert",15,'M');
        Person p1 = new Person("albert",15,'M');
        set1.add(p);
        set1.add(p1);
        Iterator<Object> iterator = null;
        for(iterator = set1.iterator();iterator.hasNext();) {
            System.out.println(iterator.next());
        }
        String a = "aab";
        String b = "aab";
        System.out.println(Objects.equals(p,p1));
    }
}
