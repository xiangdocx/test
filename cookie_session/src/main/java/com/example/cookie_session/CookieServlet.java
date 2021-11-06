package com.example.cookie_session;

import util.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xiang
 * @date 2021/5/29-14:35
 */
public class CookieServlet extends BaseServlet{

    protected void updateCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = CookieUtils.findCookies("key1",req.getCookies());
        if(cookie!=null){
        cookie.setValue("newValue");
        resp.addCookie(cookie);}
    }

    protected void getCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            Cookie[] cookies = req.getCookies();
            for (Cookie cookie : cookies) {
                resp.getWriter().write("Cookie[name="+ cookie.getName()+"value="+cookie.getValue() +"] </br>");
            }
        }

        protected void createCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //创建cookie对象
        Cookie cookie = new Cookie("key1","value1");
        //通知客户端保存
        resp.addCookie(cookie);
         resp.getWriter().write("cookie创建成功");
    }
}
