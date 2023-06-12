package org.ass.passwordlocker.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.ass.passwordlocker.entity.User;
import org.ass.passwordlocker.service.UserServiceImpl;

@WebServlet("/saveUser")
public class SaveUser extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
User user = new User();
user.setName(req.getParameter("name"));
user.setGender(req.getParameter("gender"));
user.setEmail(req.getParameter("email"));
user.setPhnNum(req.getParameter("phn"));
user.setPassword(req.getParameter("password"));
user.setDob(Date.valueOf(req.getParameter("dob")));
System.out.println(user);
UserServiceImpl service = new UserServiceImpl();
 String message=service.saveUser(user);
HttpSession session = req.getSession();
session.setAttribute("saveMessage", message);
resp.sendRedirect("userLogin.jsp");

}
}
