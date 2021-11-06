package com.example.cookie_session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author xiang
 * @date 2021/5/31-18:29
 */
public class SessionServlet extends BaseServlet{

    protected void gSion(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
       resp.getWriter().write("session" + session);
        boolean aNew = session.isNew();
        resp.getWriter().write("session" + aNew);

    }
}
