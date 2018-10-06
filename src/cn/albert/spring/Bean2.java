package cn.albert.spring;

/**
 * @author albert.cui
 * @date 2018/10/6 21:27
 */

import cn.albert.dao.IStudentDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * 测试Spring AOP生成代理对象
 */
public class Bean2 {
    public static void main(String[] args) {
        String path = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
        //XmlBeanFactory applicationContext = new XmlBeanFactory(new ClassPathResource(path));
        IStudentDao studentDao  = (IStudentDao) applicationContext.getBean("studentDao");
        String name = studentDao.getName();
        System.out.println(name.substring(0,3));
    }
}
