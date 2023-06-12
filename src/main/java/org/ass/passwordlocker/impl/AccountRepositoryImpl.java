package org.ass.passwordlocker.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.ass.passwordlocker.entity.Account;
import org.ass.passwordlocker.entity.User;
import org.ass.passwordlocker.repository.AccountsRepository;
import org.ass.passwordlocker.util.AccountEntityManagerFactoryUtil;
import org.ass.passwordlocker.util.ValidUser;

public class AccountRepositoryImpl implements AccountsRepository {
private User user;
private EntityManager manager=AccountEntityManagerFactoryUtil.
getFactory().createEntityManager();
{
	user=new ValidUser().getUser();
	
}

	@Override
	
	public String saveAccount(Account account) {
   account.setUserId(user.getId());
  
	   EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(account);
		transaction.commit();
		return "data saved successfully";
	}
	@Override
	public String updateAccount(Account account) {
         EntityTransaction transaction = manager.getTransaction();
         transaction.begin();
         manager.merge(account);
         transaction.commit();
	return "Data is Updated";
	}

	@Override
	public String deleteAccount(int id) {
		  Account account = manager.find(Account.class,id);
		  if(account!=null) {
			  EntityTransaction transaction = manager.getTransaction();
				 transaction.begin();
				 manager.remove(account); 
				 transaction.commit();
				 
					return "Data Removed Successfully";
			  
		  }else {
			  return "no data found to delete ";
		  }
	}

	@Override
	public List<Account> getAllAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAccountByAccountName(String name) {
		String sql="from Account a where a.accountName=?1 and a.userId=?2";
		Query query = manager.createQuery(sql);
		query.setParameter(1,name);
		query.setParameter(2, user.getId());
		List list = query.getResultList();
		
		
		return list;
	}

}
