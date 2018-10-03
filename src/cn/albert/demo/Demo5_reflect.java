package cn.albert.demo;

import cn.albert.domain.Person;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author albert.cui
 * @date 2018/10/1 15:05
 * Java反射机制(创建Class对象的三种方式)
 * 1.Class class1 = p1.getClass() p1为字节码对象创建的实例对象，class1为字节码对象
 * 2.  Class class3 = Person.class
 * 3. class4 = Class.forName("cn.itcast.Person");
 * 反射机制的相关类
 * java.lang.Class<T>
 * java.lang.reflect.Constructor<T>
 * java.lang.reflect.Field
 * java.lang.reflect.Method
 * java.lang.reflect.Modifier
 */
public class Demo5_reflect {
    public static void main(String[] args) {
       /* Person p = new Person();
        System.out.println(p.getClass() == Person.class);*/
        //test1();
        try {
            Class<Person> aClass = (Class<Person>) Class.forName("cn.albert.domain.Person");
            Person person = aClass.newInstance();
           /* Method[] declaredMethods = aClass.getDeclaredMethods();
            for (Method declaredMethod : declaredMethods) {
                declaredMethod.invoke(person,"ablert");
            }*/
           aClass.getMethod("setName", String.class).invoke(person,"aaabbb");
            System.out.println(person);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }


    private static void test1() {
        try {
            Class aClass = Class.forName("cn.albert.domain.Person");
            System.out.println(aClass.getCanonicalName());
            System.out.println(aClass.getName());
            Constructor constructor = aClass.getConstructor(String.class, Integer.class, Character.class);
            Person o = (Person) constructor.newInstance("shit", 14, 'M');
            //Person o = (Person)aClass.newInstance();
            //o.setName("aaa");
            System.out.println(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
