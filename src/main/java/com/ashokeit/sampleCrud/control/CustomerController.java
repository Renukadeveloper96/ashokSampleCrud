package com.ashokeit.sampleCrud.control;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokeit.sampleCrud.entity.Customer;
import com.ashokeit.sampleCrud.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	Logger logger=LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	public CustomerService customerService;
	
	@GetMapping(value="/getAll")
	public List<Customer>getCustomers(){
		logger.info("Requesting getAll from CustomerController");
		return customerService.getCustomers();
	}
	
	@GetMapping("/{id}")
	public Customer findCustomerById(@PathVariable("id") long id) {
		logger.info("Requesting getCustomerById from CustomerController");
		return customerService.findCustomerById(id);
	}
	
	@PostMapping(value="/createCustomer")
	public Customer saveCustomers(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	
	@PutMapping(value="/updateCustomer/{id}")
	public Customer updateCustomer(@PathVariable long id,@RequestBody Customer customer) {
		return customerService.updateCustomers(id, customer);
	}
	
	@DeleteMapping("/deleteCustomer/{id}")
	public void deleteCusomer(@PathVariable long id) {
		logger.info("Deleting by id is executed");
		customerService.deleteCustomer(id);
	}
	
}
