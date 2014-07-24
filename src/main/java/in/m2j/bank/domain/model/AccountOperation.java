package in.m2j.bank.domain.model;


public class AccountOperation {
	private OperationType operationType;
	private Double ammountValue;
	private Integer destinationAccountId;
	
	public OperationType getOperationType() {
		return operationType;
	}
	public void setOperationType(OperationType operationType) {
		this.operationType = operationType;
	}
	public Double getAmmountValue() {
		return ammountValue;
	}
	public void setAmmountValue(Double ammountValue) {
		this.ammountValue = ammountValue;
	}
	public Integer getDestinationAccountId() {
		return destinationAccountId;
	}
	public void setDestinationAccountId(Integer destinationAccountId) {
		this.destinationAccountId = destinationAccountId;
	}	
}
