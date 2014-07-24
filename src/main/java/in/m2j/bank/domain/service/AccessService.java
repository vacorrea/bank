package in.m2j.bank.domain.service;

import in.m2j.bank.domain.model.User;

public interface AccessService extends Service {
	
	public abstract boolean isUserValid(User user);	
	/* Para utilizar o sistema o usuario devera estar logado:
	 *    a authenticacao e autorizacao deverao ser coordenadas pelo método
	 *    login. Estes outros métodos deverão ser privados
	 *    
	 *    se o retorno da invocaçao for NULL o usuario não existe ou se a exception
	 *    InvalidUserException 
	 *    
	 *    Se o retorno for um objeto user valido este devera ser outjetado em sessao
	 */
	public abstract User performLogin(User user);	
}
