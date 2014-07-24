package in.m2j.bank.domain.service;

import in.m2j.bank.domain.model.Account;
import in.m2j.bank.domain.model.AccountOperation;

public interface AccountService extends Service {
	
	public abstract boolean registerNewAccount(Account account);
	public abstract boolean performDebitOperation(AccountOperation operation);
	public abstract boolean performAccountTransferOperation(AccountOperation operation);
}