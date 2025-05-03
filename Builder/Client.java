package Builder;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p=new Phone();
		PhoneBuilder p1=new PhoneBuilder();
		p=p1.setOs("Windows").setRam(7).setScreenSize(18).getGadget();
		System.out.println(p);
		Laptop l=new Laptop("Android",8,18);
		System.out.println(l);
	}

}
