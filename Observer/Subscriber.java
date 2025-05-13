package Observer;

public class Subscriber implements Observer{
	String name;
	Subscriber(String name){
		this.name=name;
	}
	@Override
	public void notified() {
		// TODO Auto-generated method stub
		System.out.println("Subscriber: "+name+" is notified...\n New Video Uploaded by Channel");
	}

}
