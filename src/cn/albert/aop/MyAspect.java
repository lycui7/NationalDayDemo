package cn.albert.aop;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author albert.cui
 * @date 2018/10/6 21:10
 * Spring AOP实现代理
 */
@Component(value = "myAspect")
public class MyAspect implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("代理对象执行方法前....");
        //手动执行目标方法
        Object object = methodInvocation.proceed();
        System.out.println("代理对象执行方法后...");
        return object;
    }
}
