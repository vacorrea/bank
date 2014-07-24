package in.m2j.bank.domain.service;

import in.m2j.bank.domain.model.User;

public interface UserService extends Service {
	
	public abstract void performUserRegister(User user) throws IllegalArgumentException;
	public abstract User findUserById(Integer id);
}