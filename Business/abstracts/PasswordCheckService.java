package Business.abstracts;

import Entites.concretes.Customer;

public interface PasswordCheckService {
	
	boolean passwordCheck(Customer customer);

}
