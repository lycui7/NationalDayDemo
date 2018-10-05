package cn.albert.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author albert.cui
 * @date 2018/10/5 14:42
 */
public class FirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username = request.getParameter("username");
        username = new String(username.getBytes("iso-8859-1"),"utf-8");
       // response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        session.setAttribute("handsome","崔璐瑶啊");
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
      request.getRequestDispatcher("servlet/second.jsp").forward(request,response);
        //out.println(username+",牛逼");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
