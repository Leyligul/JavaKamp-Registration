package Adapters;

import Entites.concretes.Customer;
import Google.GoogleKayit;

public class GoogleKayitManager implements GooleKayitService {

	@Override
	public void saveG(String message) {
		GoogleKayit google=new GoogleKayit();
		google.googleKayit(message);
		
	}

}
