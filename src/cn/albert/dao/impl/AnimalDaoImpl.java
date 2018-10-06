package cn.albert.dao.impl;

import cn.albert.dao.IAnimalDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Collections;
import java.util.List;

/**
 * @author albert.cui
 * @date 2018/10/6 14:23
 */
public class AnimalDaoImpl implements IAnimalDao {
    @Value("${file.name}")
    private String fileName;
    private List<String > list;
    public AnimalDaoImpl( List<String> list) {
        this.list = list;
        System.out.println("bean 实例化...");
    }

    @Override
    public String showMyName(String name) {
        String s = list.toString();
        StringBuilder sb = new StringBuilder(s);
        return sb.append(name).append(fileName).toString();
    }
    @PostConstruct
    public void init() {
        System.out.println("bean初始化...");
    }
    @PreDestroy
    public  void distroy() {
        System.out.println("bean 销毁...");
    }
}
