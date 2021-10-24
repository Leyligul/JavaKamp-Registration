package Business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Business.abstracts.PasswordCheckService;
import Entites.concretes.Customer;

public class PasswordCheck implements PasswordCheckService {

	@Override
	public boolean passwordCheck(Customer customer) {
		
	if(customer.getPassword().length()>=6 ) {
	
	    return true;
		
	} else {
		return false;
	}
		
	}
	
	


}
