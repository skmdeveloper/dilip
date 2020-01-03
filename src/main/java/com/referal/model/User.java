package com.referal.model;

import java.util.List;
import java.util.Map;

public class User {
	private  Integer balance;
	private Integer id;
	private List<Integer> referId;
	private Map<Integer,Integer> referalstatus;
	
	
	
	
	public Map<Integer, Integer> getReferalstatus() {
		return referalstatus;
	}
	public void setReferalstatus(Map<Integer, Integer> referalstatus) {
		this.referalstatus = referalstatus;
	}
	public Integer getBalance() {
		return balance;
	}
	public User setBalance(Integer balance) {
		this.balance = balance;
		return this;
	}
	public Integer getId() {
		return id;
	}
	public User setId(Integer id) {
		this.id = id;
		return this;
	}
	public List<Integer> getReferId() {
		return referId;
	}
	public User setReferId(List<Integer> referId) {
		this.referId = referId;
		return this;
	}
	
	
	
	
	
	

}
