package org.ass.passwordlocker.service;

import org.ass.passwordlocker.entity.User;

public interface UserService {
	String saveUser(User user);
	String update(User user);
	User UserLogin(String email,String password);
	String deleteUser(int id);
}
