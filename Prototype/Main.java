package Prototype;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetworkConnection n1=new NetworkConnection();
		n1.setIp("192.168.1.1");
		n1.loadData();
		System.out.println(n1);
		NetworkConnection n2=new NetworkConnection();
		System.out.println(n2);

	}

}
