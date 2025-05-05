package Composite;

import java.util.ArrayList;

public class Composite implements Component{
	String name;
	int price;
	public Composite(String name) {
		this.name=name;
	}
	ArrayList<Component> c=new ArrayList<>();
	void add(Component comp) {
		c.add(comp);
	}
	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		for(Component comp : c) {
		comp.showPrice();
		}
	}

}
