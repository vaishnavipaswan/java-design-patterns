package Composite;

public class Leaf implements Component{

	String name;
	int price;
	Leaf(String name,int price){
		this.name=name;
		this.price=price;
	}
	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println(name+" : "+price);
	}
	
}
