package Decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasePizza p=new ExtraPaneer(new ExtraCheese(new Margherita()));
		System.out.println(p.cost());
	}

}
