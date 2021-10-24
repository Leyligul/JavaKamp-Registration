package Business.concretes;



import Adapters.GoogleKayitManager;
import Adapters.GooleKayitService;
import Business.abstracts.CheckFirstNameService;
import Business.abstracts.CheckLastNameService;
import Business.abstracts.DogrulamaService;
import Business.abstracts.EmailAktifEkmeService;
import Business.abstracts.MailCheckService;
import Business.abstracts.PasswordCheckService;
import Entites.abstracts.CustomerService;
import Entites.concretes.Customer;

public class CustomerManager implements CustomerService{
	
	private MailCheckService mailCheck;
	private PasswordCheckService passwordCheck;
	private DogrulamaService dogrulama;
	private EmailAktifEkmeService aktifet;
	private GooleKayitService google;
	private CheckFirstNameService checkname;
	private CheckLastNameService checkname2;
	

	

	public CustomerManager(MailCheckService mailCheck, PasswordCheckService passwordCheck, DogrulamaService dogrulama,
			EmailAktifEkmeService aktifet,GooleKayitService google,CheckFirstNameService checkname,CheckLastNameService checkname2) {
		super();
		this.mailCheck = mailCheck;
		this.passwordCheck = passwordCheck;
		this.dogrulama = dogrulama;
		this.aktifet = aktifet;
		this.google=google;
		this.checkname=checkname;
	   
		this.checkname2=checkname2;
		
	}

	
    


	@Override
	public void save(Customer customer) {
		if (mailCheck.checkMail(customer)==true && passwordCheck.passwordCheck(customer)==true && checkname2.checkLastName(customer)==true) {
			dogrulama.dogrula(customer);
			if (aktifet.aktifEt(customer)==true) {
				System.out.println("Emailiniz aktif edildi. " +customer.getEmail());
				System.out.println("Sisteme kayýt edildiniz. " + customer.getFirstName());
			}else {
				System.out.println("Kayýt iþleminin tamamlanmasý için lütfen emailinizi doðrulayýnýz. ");
			}
		}
		else {
			System.out.println("Lütfen bilgilerinizi kontrol ediniz: " 
					+ "\n"+ "-> Ad ve soyad en az iki, parola en az 6 haneli olmalýdýr."
					+"\n "+ "-> Eposta alaný eposta formunda olmalýdýr.");
		}
	
		
	}
	



	@Override
	public void delete(Customer customer) {
		System.out.println("Hesabýnýz silindi.");
		
	}

	@Override
	public void upDate(Customer customer) {
		if (mailCheck.checkMail(customer)==true && passwordCheck.passwordCheck(customer)==true ) {
			System.out.println("Bilgileriniz güncellendi. " + customer.getFirstName());
		}
		else {
			System.out.println(" Geçersiz email ya da þifre girdiniz. Lütfen bilgilerinizi kontrol ediniz. Þifrenin en az 6 haneli olmasýna dikkat ediniz.");
		}
	
		
	}
	
	public void saveG(Customer customer) {
		google.saveG("Google hesabý ile giriþ yapýldý " + customer.getEmail());
		
	}



	@Override
	public void LoginIn(Customer customer) {
		if (mailCheck.checkMail(customer)==true && passwordCheck.passwordCheck(customer)==true ) {
			System.out.println("Giriþ yapýldý. " + customer.getFirstName());
		}else {
			System.out.println("Bilgilerinizi kontrol ediniz. Email ve parolanýn eksiz olmasýna dikkat ediniz. ");
		}
		
	}
	



}
