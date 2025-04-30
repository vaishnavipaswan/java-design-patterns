package Adapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AppleCharger c=new ChargerXYZ();
		Iphone p=new Iphone(c);
		p.chargeIphone();
		System.out.println("===============================");
		Adapter a=new Adapter(new DKCharger());
		a.chargeIphone();
		
	}

}
