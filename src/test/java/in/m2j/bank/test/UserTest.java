package in.m2j.bank.test;

import in.m2j.bank.domain.model.User;
import in.m2j.bank.domain.service.UserService;
import in.m2j.bank.domain.service.impl.UserServiceImpl;

import org.junit.Assert;
import org.testng.annotations.Test;

public class UserTest {
  
	private User user = new User();
	
	private UserService userService = new UserServiceImpl();
	
//	@Test
//	public void createUserTest() {
//		user.setId(1L);
//		user.setName("vitor");
//		user.setPassword("vcorrea123");
//		userService.performUserRegister(user);
//	}
	@Test
	public void findValidUserTest() {
		User user = userService.findUserById(1);
		Assert.assertNotNull(user);
	}
	@Test
	public void findInvalidUserTest() {
		User user = userService.findUserById(2);
		Assert.assertNull(user);
	}
}
