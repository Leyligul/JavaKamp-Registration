package Business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Business.abstracts.MailCheckService;
import Entites.concretes.Customer;

public class MailCheck implements MailCheckService{
	


	@Override
	public boolean checkMail(Customer customer) {
//"^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		String regex = "^[a-z0-9](\\.?[a-z0-9]){1,}@g(oogle)?mail\\.com$";
		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(customer.getEmail());
	    
	    	if(matcher.matches()==true ) {
	    		
	    	   return true;
	    	}else {
	    		
	    		return false;
	    	}
	    
	}
		
		
	}
