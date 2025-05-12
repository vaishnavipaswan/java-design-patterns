package Mediator;

import java.util.ArrayList;

public class ConcreteMediator implements Mediator{

	ArrayList<Collegue> collegues=new ArrayList<>();
	@Override
	public void addCollegue(Collegue c) {
		// TODO Auto-generated method stub
		collegues.add(c);
	}

	@Override
	public void sendMsg(String s,Collegue c) {
		// TODO Auto-generated method stub
		for(Collegue col: collegues) {
			if(col!= c) {
				c.receiveMsg(s);
			}
		}
	}

}
