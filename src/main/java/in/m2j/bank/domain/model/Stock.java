package in.m2j.bank.domain.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Stock extends ProjectEntity {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double value;
	private Date date;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
