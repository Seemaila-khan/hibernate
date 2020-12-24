package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_customer")
public class Customer {
	
	@Id
	@SequenceGenerator(name="seq_customer",initialValue= 100, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_customer")
	private int customerId;
	private String customerCity;
	private String customerName;
	private int customerAge;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerCity=" + customerCity + ", customerName="
				+ customerName + ", customerAge=" + customerAge + "]";
	}
	
}
