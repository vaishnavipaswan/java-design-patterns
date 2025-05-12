package Mediator;

public class MediatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcreteMediator m=new ConcreteMediator();
		Desktop d=new Desktop(m);
		Laptop l=new Laptop(m);
		m.addCollegue(d);
		m.addCollegue(l);
		d.sendMsg("HI!");
		l.sendMsg("HELLO!");
	}

}
