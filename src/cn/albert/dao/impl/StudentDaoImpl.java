package cn.albert.dao.impl;

import cn.albert.dao.IStudentDao;
import org.springframework.stereotype.Repository;

/**
 * @author albert.cui
 * @date 2018/10/6 21:18
 */
@Repository(value = "studentDao")
public class StudentDaoImpl implements IStudentDao {
    @Override
    public String getName() {
        System.out.println("getName()方法执行...");
        return "崔爸爸我是你儿子";
    }
}
