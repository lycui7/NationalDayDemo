import cn.albert.dao.IStudentDao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author albert.cui
 * @date 2018/10/7 10:03
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Junit_Spring {
    @Autowired
    private IStudentDao studentDao;
    @Test
    public void test1() {
        studentDao.getName();
    }
}
