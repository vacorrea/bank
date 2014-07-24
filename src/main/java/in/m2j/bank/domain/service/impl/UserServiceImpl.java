package in.m2j.bank.domain.service.impl;

import in.m2j.bank.domain.model.User;
import in.m2j.bank.domain.service.UserService;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;
import javax.inject.Named;

@Named
@Stateless
public class UserServiceImpl implements UserService {
	
	private Map<Long, User> userMap = new HashMap<Long, User>();
		
	@Override
	public void performUserRegister(User user) throws IllegalArgumentException {		
		userMap.put(user.getId(), user);
		
	}
	@Override
	public User findUserById(Integer id) {
		User user = userMap.get(id);		
		return user;
	}
}
