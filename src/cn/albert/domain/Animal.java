package cn.albert.domain;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author albert.cui
 * @date 2018/10/1 21:22
 */
public class Animal<T> {
    private T model;

    public T getModel() {
        return model;
    }
    public Animal() {
        ParameterizedType genericSuperclass = (ParameterizedType) this.getClass().getGenericSuperclass();
        Type[] actualTypeArguments = genericSuperclass.getActualTypeArguments();
        Class<T> clazz = (Class<T>) actualTypeArguments[0];
        try {
            model = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
