


import Adapters.GoogleKayitManager;
import Business.abstracts.CheckFirstNameService;
import Business.abstracts.CheckLastNameService;
import Business.concretes.CheckFirstName;
import Business.concretes.CheckLastName;
import Business.concretes.CustomerManager;
import Business.concretes.DogrulamaManager;
import Business.concretes.EmailAktifEtmeManager;
import Business.concretes.MailCheck;
import Business.concretes.PasswordCheck;
import Entites.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer("Deniz","Kk","dh7@gmail.com","111111");
		/*MailCheck mailCheck=new MailCheck();
		mailCheck.checkMail(customer);
		
		PasswordCheck passwordCheck=new PasswordCheck();
		passwordCheck.passwordCheck(customer);
		DogrulamaManager dogrulama=new DogrulamaManager();
		EmailAktifEtmeManager aktifet=new EmailAktifEtmeManager();
		GoogleKayitManager google=new GoogleKayitManager();
		CheckFirstName checkname=new CheckFirstName();
		CheckLastName checkname2=new CheckLastName();*/
		
	
		CustomerManager customerManager=new CustomerManager(new MailCheck(),new PasswordCheck(),new DogrulamaManager(),new EmailAktifEtmeManager(),new GoogleKayitManager(),new CheckFirstName(), new CheckLastName());
		customerManager.save(customer);
		//customerManager.saveG(customer);
		//customerManager.LoginIn(customer);
	}

}
