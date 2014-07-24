package in.m2j.bank.domain.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TradeOperation extends ProjectEntity {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Account account;
	private List<Stock> stockList = new ArrayList<Stock>();
	private Date date;
	
	public boolean isAccountAmmountGreaterThanStockValue() {
		Double acc = new Double(0);
		for (Stock stock : stockList)			
			acc += stock.getValue();
		if(account.getAmmount() < acc)
			throw new IllegalArgumentException("operation value less than account ammount");
		return true;
	}	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}	
	public List<Stock> getStockList() {
		return stockList;
	}
}
