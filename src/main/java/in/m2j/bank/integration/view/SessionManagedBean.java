package in.m2j.bank.integration.view;

import javax.annotation.ManagedBean;

@ManagedBean(value="bean")
public class SessionManagedBean {
	
	private String key;
	private String value;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
