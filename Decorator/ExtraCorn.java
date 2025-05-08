package Decorator;

public class ExtraCorn extends ToppingDecorator{
	BasePizza p;
	ExtraCorn(BasePizza p){
		this.p=p;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.p.cost()+20;
	}
	
}
