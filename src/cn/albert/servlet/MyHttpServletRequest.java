package cn.albert.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.Set;

/**
 * @author albert.cui
 * @date 2018/10/5 16:25
 */
public class MyHttpServletRequest extends HttpServletRequestWrapper {
    //接受传入的request
    private HttpServletRequest request;
    //定义状态位，防止重复编码解码造成乱码
    private boolean flag = true;
    public MyHttpServletRequest(HttpServletRequest request) {
        super(request);
        this.request = request;
    }

    @Override
    public Map<String, String[]> getParameterMap() {
        Map<String, String[]> parameterMap = request.getParameterMap();
        System.out.println(flag);
        if (flag) {
            Set<Map.Entry<String, String[]>> entries = parameterMap.entrySet();
            for(Map.Entry<String, String[]> map : entries) {
                String[] value = map.getValue();
                for (int i = 0; i < value.length; i++) {
                    try {
                        value[i] = new String(value[i].getBytes("iso-8859-1"),"utf-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                }
            }
            flag = false;
        }
        return parameterMap;
    }

    @Override
    public String getParameter(String name) {
        Map<String, String[]> map = getParameterMap();
        return map.get(name)[0];
    }

    @Override
    public String[] getParameterValues(String name) {
        Map<String, String[]> map = getParameterMap();
        return map.get(name);
    }
}
