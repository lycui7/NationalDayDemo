package cn.albert.demo;

import javax.security.auth.callback.UnsupportedCallbackException;

/**
 * Exception的相关复习
 *  Java里面异常分为两大类:checkedexception(检查异常)和unchecked
 *  exception(未检查异常)，对于未检查异常也叫RuntimeException(运行时异常),
 *  对于运行时异常，java编译器不要求你一定要把它捕获或者一定要继续抛出，
 *  但是对checkedexception(检查异常)要求你必须要在方法里面或者捕获或者继续抛出。
 *  除了RuntimeException为非检查异常,其它都是检查异常
 */
public class Demo1_exception {
    public static void main(String[] args) {
        Demo1_exception demo1 = new Demo1_exception();
        //double result = demo1.devide(1.5, 0);//浮点数除以0结果显示为Infinity
        //int result = demo1.devide(5,0);//整形数除以0报错ArithmeticException
      /*  try {
            int result = demo1.devide(5,0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(new ArithmeticException("除数不可以为0!!!").getMessage());
        }*/
     /*   try {
            int result = demo1.devide(5,0);
            System.out.println(result);
        } catch (ArithmeticException e) {
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }*/
       /* int result = demo1.devide1(8, 0);
        System.out.println(result);*/
    }
    private double devide(double a , double b) {
        return a/b;
    }
    private int devide(int a, int b) {
        if(b == 0) {
            throw  new ArithmeticException("you can not / by zero!!!");
        }
        return a/b;
    }
     int devide1(int a, int b) throws UnsupportedCallbackException {
        return a/b;
    }
}
