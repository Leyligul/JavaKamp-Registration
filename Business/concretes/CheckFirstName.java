package Business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Business.abstracts.CheckFirstNameService;
import Entites.concretes.Customer;

public class CheckFirstName implements CheckFirstNameService {

	@Override
	public boolean checkFirstName(Customer customer) {
		
		String regex ="[0-9a-zA-Z]{2,}";;
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(customer.getFirstName());
		if(matcher.matches()==true) {
			return true;
				    	}else {
				    		return false;
	    		
	    	}
		
	}

}
