package org.ass.passwordlocker.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.ass.passwordlocker.entity.User;
import org.ass.passwordlocker.service.UserServiceImpl;

@WebServlet("/userLogin")
public class UserLogin extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	UserServiceImpl service = new UserServiceImpl();
	User user = service.UserLogin(email, password);
	HttpSession session = req.getSession();
	session.setAttribute("loggedUser", user);
	resp.sendRedirect("userMenu.jsp");
	
	
	
}
}
