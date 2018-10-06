package cn.albert.spring;

import cn.albert.dao.IAnimalDao;
import cn.albert.service.IUserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author albert.cui
 * @date 2018/10/6 13:56
 */
public class Bean1 {
    public static void main(String[] args) {
        String path = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
       /* IUserDao userDao = (IUserDao) applicationContext.getBean("userDaoImpl");
        userDao.sayHello("Hellos");*/
        IAnimalDao animalDao = (IAnimalDao) applicationContext.getBean("animalDaoImpl");
        ((ClassPathXmlApplicationContext) applicationContext).close();
        String message = animalDao.showMyName("崔璐瑶");
        System.out.println(message);
    }
}
