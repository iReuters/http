package com.example.ExamManagerOnline.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class UserAddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 调用请求对象读取请求头参数信息，得到用户的信息
        //2. 调用userdao将用户信息填充到insert命令发送到数据库服务器
        //3. 调用响应对象将处理结果以二进制形式写入到响应体
        String userName,password,sex,email;
        userName = request.getParameter("username");
        password = request.getParameter("password");
        sex = request.getParameter("sex");
        email = request.getParameter("email");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
