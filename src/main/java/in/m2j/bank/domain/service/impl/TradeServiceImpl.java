package in.m2j.bank.domain.service.impl;

import in.m2j.bank.domain.model.DayTradeRepository;
import in.m2j.bank.domain.model.Stock;
import in.m2j.bank.domain.model.TradeOperation;
import in.m2j.bank.domain.service.TradeService;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.inject.Named;

@Named
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class TradeServiceImpl implements TradeService {
	
	private DayTradeRepository dayTradeRepository;
	
	/* Objetivo: efetuaro registro de compra e venda
	 * 		de uma acao.
	 * 
	 *    A operação deve:
	 *     1. Verificar se a conta do comprador tem saldo > que a compra. Não havendo lançar exception e rollback da transação
	 *     2. Enviar mensagem para a fila de mensagens de conta para debitar o valor da compra
	 *     3. Verificar se a lista de acoes para compra existem e a quantidade são disponiveis
	 *     4. Registrar compra em dayTradeRepository da referida acao
	 *     * enviar mensagem de credito para a fila da conta cliente 
	 *     
	 *     Exemplo de comunicação publish subscribe de filas. Agente de monitoramento e varios dashboards. O agente não precisa enviar para cada dash...
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void performTradeOperation(TradeOperation operation) {
		operation.isAccountAmmountGreaterThanStockValue();
		dayTradeRepository.isStockAvailable(operation.getStockList());
		dayTradeRepository.removeFromAvailable(operation.getStockList());
		dayTradeRepository.registerOperation(operation);
	}
	@Override
	public Stock getStockById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerStock(Stock stock) {
		// TODO Auto-generated method stub

	}
	@Override
	public void getOperationById(Long id) {
		// TODO Auto-generated method stub

	}
}
