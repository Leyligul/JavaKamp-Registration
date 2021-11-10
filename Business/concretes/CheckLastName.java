package Business.concretes;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

import Business.abstracts.CheckFirstNameService;
import Business.abstracts.CheckLastNameService;
import Entites.concretes.Customer;

public class CheckLastName implements CheckLastNameService {

	@Override
	public boolean checkLastName(Customer customer) {
		
		/* String regex ="[0-9a-zA-Z]{2,}";;
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(customer.getLastName());
		if(matcher.matches()==true) {
			return true;
				    	}else {
				    		return false;
	    		
	    	}*/
		
		 if(customer.getLastName().length()>=2) {
		 return true;
	       }else {
		 return false;
	     }
		
	}

	
	
		

}
