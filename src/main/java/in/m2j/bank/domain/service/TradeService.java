package in.m2j.bank.domain.service;

import in.m2j.bank.domain.model.Stock;
import in.m2j.bank.domain.model.TradeOperation;

public interface TradeService extends Service {
	public abstract void performTradeOperation(TradeOperation operation);
	public abstract Stock getStockById(Long id);
	public abstract void registerStock(Stock stock);
	public abstract void getOperationById(Long id);
}
