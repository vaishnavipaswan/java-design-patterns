package Decorator;

public class ExtraCheese extends ToppingDecorator{
	BasePizza p;
	ExtraCheese(BasePizza p){
		this.p=p;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.p.cost()+10;
	}

}
