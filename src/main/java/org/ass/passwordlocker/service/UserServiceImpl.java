package org.ass.passwordlocker.service;

import org.ass.passwordlocker.entity.User;
import org.ass.passwordlocker.impl.UserRepositoryImpl;
import org.ass.passwordlocker.repository.UserRepository;
import org.ass.passwordlocker.util.ValidUser;


public class UserServiceImpl implements UserService{
	private UserRepository repository;
	{
		repository=new UserRepositoryImpl() ;
	}
	@Override
	public String saveUser(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}
	@Override
	public String update(User user) {
		// TODO Auto-generated method stub
		return repository.update(user);
	}
	@Override
	public User UserLogin(String email, String password) {
		User user=repository.UserLogin(email, password);
		if(user!=null) {
			new ValidUser().setUser(user);
		}
		return null;
	
	}
	@Override
	public String deleteUser(int id) {
		// TODO Auto-generated method stub
		return repository.deleteUser(id);
	}
	
	
	
	

	
	
}
