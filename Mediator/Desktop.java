package Mediator;

public class Desktop implements Collegue{

	Mediator m;
	public Desktop(Mediator m) {
		this.m=m;
	}
	@Override
	public void sendMsg(String msg) {
		// TODO Auto-generated method stub
		m.sendMsg(msg,this);
	}

	@Override
	public void receiveMsg(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Desktop: "+msg);
	}

}
