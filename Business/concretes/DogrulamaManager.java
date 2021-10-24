package Business.concretes;

import Business.abstracts.DogrulamaService;
import Entites.concretes.Customer;

public class DogrulamaManager implements DogrulamaService{

	@Override
	public void dogrula(Customer customer) {
		
		System.out.println( "Doðrulama için mail gönderildi") ;
	}

}
