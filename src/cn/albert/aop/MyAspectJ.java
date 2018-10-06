package cn.albert.aop;

/**
 * @author albert.cui
 * @date 2018/10/6 21:55
 */


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 基于AspectJ实现代理
 */
@Component(value = "myAspectJ")
@Aspect
public class MyAspectJ {
    /*
    声明公共切入点
     */
    @Pointcut("execution(* cn.albert.dao..*.*(..))")
    public void myPointcut() {}
    @Before(value = "myPointcut()")
    public void myBefore(JoinPoint joinpoint) {
        System.out.println("前置通知："+joinpoint.getSignature().getName());
    }
    @AfterReturning(value="myPointcut()" ,returning="ret")
    public void myAfterReturning(JoinPoint joinPoint,Object ret){
        System.out.println("后置通知 ： " + joinPoint.getSignature().getName() + " , -->" + ret);
    }
    @Around(value = "myPointcut()")
    public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("aspectJ代理对象执行目标方法前"+joinPoint.getSignature().getName());
        //手动执行目标方法
        Object obj = joinPoint.proceed();
        System.out.println("aspectJ代理对象执行目标方法后"+joinPoint.getSignature().getName());
        return obj;
    }


}
