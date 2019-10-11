package com.showorth.ws.example;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService
public class AccountService {
	
	private static Account account = new Account();
	
	public Account getAccountBalance() {
		account.currentBalance = 500;
		account.limitReached = false;
		account.status = "Active";
		return account;
	}

	public Account depositAmount(int amount) {
		account.currentBalance += amount;
		return account;
	}
	
	public void setLimitReached() {
		account.limitReached = true;
	}

	public Account withdrawAmount(int amount) {
		if (account.limitReached) {
			account.status = "Limit Reached";
			return account;
		}
		account.currentBalance -= amount;
		return account;
	}
	
}
