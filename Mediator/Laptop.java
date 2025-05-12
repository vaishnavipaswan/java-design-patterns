package Mediator;

public class Laptop implements Collegue {

	Mediator m;
	public Laptop(Mediator m) {
		this.m=m;
	}
	@Override
	public void sendMsg(String msg) {
		// TODO Auto-generated method stub
		m.sendMsg(msg, this);
	}

	@Override
	public void receiveMsg(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Laptop: "+msg);
	}

}
