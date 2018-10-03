package cn.albert.demo;

import java.util.*;

/**
 * Created by albert.cui on 2018/9/30
 * 1. HashMap与Hashtable的效率大体相同，它们的实现机制几乎一样，HashMap线程不安全，Hashtable线程安全，所以HashMap快一点。
 *
 * 2. TreeMap中所有的key-value对处于有序状态，所以TreeMap比HashMap，Hashtable要慢（尤其是插入、删除），因为TreeMap底层采用红黑树来管理key-value对。
 *
 * 3. LinkedHashMap使用链表维护键值对，所以比HahMap慢一点。
 * key不能重复
 * TreeMap有固定顺序
 * Hashtable既不支持Null key也不支持Null value
 * HashMap中，null可以作为键，这样的键只有一个；可以有一个或多个键所对应的值为null
 */
public class Demo2_map {
    public static void main(String[] args) {
    /*
    Map的三种遍历方式
     */
        Map<String, Object> map1 = new HashMap<>(10);
        map1.put("albert", "崔璐瑶");
        map1.put("choosl", "刘派");
        map1.put("Anne", "甘飞飞");
        map1.put("Rachel", "孙玉秀");
        map1.put("Gale", "马学成");
        map1.put(null,"aaa");
        map1.put(null,"www");
        map1.put("Gale","www");
        Set<String> strings = map1.keySet();
        for (String string : strings) {
            System.out.println("key: " + string + " , " + "value: " + map1.get(string));
        }
      /*  Set<Map.Entry<String, Object>> entries = map1.entrySet();
        for (Map.Entry<String, Object> entry : entries) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }*/
      /*  Collection<Object> values = map1.values();
        for (Object value : values) {
            System.out.println(value);

        }*/
    }

}
