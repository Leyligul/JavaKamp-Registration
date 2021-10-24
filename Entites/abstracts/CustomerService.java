package Entites.abstracts;

import Entites.concretes.Customer;

public interface CustomerService {
	
	void save(Customer customer);
	
	void delete(Customer customer);
	void upDate(Customer customer);
	void LoginIn(Customer customer);

}
