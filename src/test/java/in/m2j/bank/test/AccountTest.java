package in.m2j.bank.test;

import in.m2j.bank.domain.model.Account;
import in.m2j.bank.domain.service.AccountService;
import in.m2j.bank.domain.service.impl.AccountServiceImpl;

public class AccountTest {
	
	private AccountService accountService = new AccountServiceImpl();	
	private Account account = new Account();
		
//	@Test
//	public void createAccountTest() {		
//		account.setId(1L);
//		account.setLimit(new Double(1000));
//		account.setUser(getFakeUser());
//		account.setAmmount(new Double(10000));
//		Assert.assertTrue(accountService.registerNewAccount(account));		
//	}
//	@Test
//	public void debitAccountTest() {		
//		AccountOperation operation = new AccountOperation();
//		operation.setAmmountValue(new Double(1000));
//		operation.setDestinationAccountId(account.getId());
//		accountService.performDebitOperation(operation);
//		Assert.assertEquals(new Double(9000), account.getAmmount());		
//	}
//	
//	private User getFakeUser() {
//		User user = new User();
//		user.setId(1L);
//		user.setName("vitor");
//		user.setPassword("vcorrea123");
//		return user;
//	}
}
