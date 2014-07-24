package in.m2j.bank.domain.service.impl;

import in.m2j.bank.domain.model.Account;
import in.m2j.bank.domain.model.AccountOperation;
import in.m2j.bank.domain.service.AccountService;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Named;

@Named
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class AccountServiceImpl implements AccountService {
	
	private List<Account> accountList = new ArrayList<Account>();
	
	@Override
	public boolean registerNewAccount(Account account) {
		if(accountList.add(account) == false)
			return false;
		return true;
	}
	@Override
	public boolean performDebitOperation(AccountOperation operation) {
		Account account = getAccountById(operation.getDestinationAccountId()); 
		if(account != null) {
			account.performDebit(operation.getAmmountValue());
			return true;
		}
		return false;
	}
	private Account getAccountById(Integer id) {
		for (Account account : accountList) 
			if(account.getId().equals(id))
				return account;
		return null;
	}
	@Override
	public boolean performAccountTransferOperation(AccountOperation operation) {
		// TODO Auto-generated method stub
		return false;
	}
}
