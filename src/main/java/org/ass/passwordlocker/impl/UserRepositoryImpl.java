package org.ass.passwordlocker.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.ass.passwordlocker.entity.User;
import org.ass.passwordlocker.repository.UserRepository;
import org.ass.passwordlocker.util.UserEntityManagerFactoryutil;

public class UserRepositoryImpl implements UserRepository{
	private EntityManager manager=UserEntityManagerFactoryutil.
            getFactory().createEntityManager();

	@Override
	public String save(User user) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(user);
		transaction.commit();
		return "Data Saved";
	}

	@Override
	public String update(User user) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(user);
		transaction.commit();
		return "Data is updated";
	}

	@Override
	public User UserLogin(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(int id) {
		  User user = manager.find(User.class,id);
		  if(user!=null) {
			  EntityTransaction transaction = manager.getTransaction();
				 transaction.begin();
				 manager.remove(user); 
				 transaction.commit();
				 
					return "Data Removed Successfully";
			  
		  }else {
			  return "no data found to delete ";
	
	}

}

	
}
