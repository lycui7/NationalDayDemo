package cn.albert.service.impl;

import cn.albert.service.IUserDao;

/**
 * @author albert.cui
 * @date 2018/10/1 22:22
 */
public class IUserDaoImpl implements IUserDao {
    @Override
    public void sayHello(String name) {
        System.out.println("my name is "+name);
    }
}
