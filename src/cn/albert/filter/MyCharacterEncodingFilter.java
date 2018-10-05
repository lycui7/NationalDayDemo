package cn.albert.filter;

import cn.albert.servlet.MyHttpServletRequest;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author albert.cui
 * @date 2018/10/5 16:22
 */
public class MyCharacterEncodingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //通过过滤器的初始化可以拿到应用上下文
        //ServletContext servletContext = filterConfig.getServletContext();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("编码过滤器开始工作...");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        if("POST".equals(request.getMethod())) {
            request.setCharacterEncoding("UTF-8");
        } else if("GET".equals(request.getMethod())) {
            request = new MyHttpServletRequest(request);
        }
        HttpServletResponse response = (HttpServletResponse) servletResponse;
       response.setContentType("text/html; charset=utf-8");
        filterChain.doFilter(request,response);
        System.out.println("编码过滤器结束工作...");
    }

    @Override
    public void destroy() {

    }
}
