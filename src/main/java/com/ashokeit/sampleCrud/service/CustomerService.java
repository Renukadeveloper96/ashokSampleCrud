package com.ashokeit.sampleCrud.service;

import java.util.List;

import com.ashokeit.sampleCrud.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();
	public Customer findCustomerById(long id);
	public Customer saveCustomer(Customer customer);
	public Customer updateCustomers(long id,Customer customer);
	public void deleteCustomer(long id);
}
