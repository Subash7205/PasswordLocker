package org.ass.passwordlocker.repository;

import java.util.List;

import org.ass.passwordlocker.entity.Account;

public interface AccountsRepository {
	String saveAccount(Account account);
	String updateAccount(Account account);
	String deleteAccount(int id);
	List<Account> getAllAccount();
	List<Account> getAccountByAccountName(String name);
	
}
