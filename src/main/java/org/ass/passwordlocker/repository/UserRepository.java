package org.ass.passwordlocker.repository;

import org.ass.passwordlocker.entity.User;

public interface UserRepository {
String save(User user);
String update(User user);
User UserLogin(String email,String password);
String deleteUser(int id);
}
