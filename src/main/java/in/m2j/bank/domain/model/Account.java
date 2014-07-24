package in.m2j.bank.domain.model;

public class Account extends ProjectEntity {
	private static final long serialVersionUID = 1L;
	
	private User user;
	
	private Double limit;
	private Double ammount;
	
	public Account() {	}
	
	public void performDebit(Double value) {
		ammount = ammount - value;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Double getLimit() {
		return limit;
	}
	public void setLimit(Double limit) {
		this.limit = limit;
	}
	public Double getAmmount() {
		return ammount;
	}
	public void setAmmount(Double ammount) {
		this.ammount = ammount;
	}	
}
