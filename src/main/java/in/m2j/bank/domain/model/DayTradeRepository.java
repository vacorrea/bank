package in.m2j.bank.domain.model;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class DayTradeRepository {
	
	private Set<TradeOperation> dayTradeSet = new HashSet<TradeOperation>();	
	private Set<Stock> availableStocks = new HashSet<Stock>();	
	private Set<Stock> selledStocks = new HashSet<Stock>();
	
	public void removeFromAvailable(List<Stock> stockList) {
		availableStocks.removeAll(stockList);		
	}
	public void registerOperation(TradeOperation operation) {
		operation.setDate(new Date());
		dayTradeSet.add(operation);		
	}
	public boolean isStockAvailable(List<Stock> stockList) {
		for (Stock stock : stockList)  
			if(availableStocks.contains(stock) == false) 
				throw new IllegalArgumentException("stock not available");	
		return true;
		
	}
	public Set<TradeOperation> getDayTradeSet() {
		return dayTradeSet;
	}
	public void setDayTradeSet(Set<TradeOperation> dayTradeSet) {
		this.dayTradeSet = dayTradeSet;
	}
	public Set<Stock> getAvailableStocks() {
		return availableStocks;
	}
	public void setAvailableStocks(Set<Stock> availableStocks) {
		this.availableStocks = availableStocks;
	}
	public Set<Stock> getSelledStocks() {
		return selledStocks;
	}
	public void setSelledStocks(Set<Stock> selledStocks) {
		this.selledStocks = selledStocks;
	}
}
