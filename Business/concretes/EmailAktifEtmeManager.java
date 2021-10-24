package Business.concretes;

import Business.abstracts.EmailAktifEkmeService;
import Entites.concretes.Customer;

public class EmailAktifEtmeManager implements EmailAktifEkmeService{

	@Override
	public boolean aktifEt(Customer customer) {
	
		return true;
		
	}

	
	

}
