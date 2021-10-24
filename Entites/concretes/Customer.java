package Entites.concretes;

import Entites.abstracts.CustomerService;

public class Customer implements CustomerService {
	
     private String firstName;
     private String lastName;
     private String email;
     private String password;
     
     

	public Customer(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}



	public String getFirstName() {
		return FirstName;
	}



	public void setFirstName(String firstName) {
		FirstName = firstName;
	}



	public String getLastName() {
		return LastName;
	}



	public void setLastName(String lastName) {
		LastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void upDate(Customer customer) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void LoginIn(Customer customer) {
		// TODO Auto-generated method stub
		
	}







	

}
