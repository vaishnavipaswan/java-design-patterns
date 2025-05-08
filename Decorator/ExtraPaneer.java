package Decorator;

public class ExtraPaneer extends ToppingDecorator{
	BasePizza p;
	ExtraPaneer(BasePizza p){
		this.p=p;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.p.cost()+30;
	}

}
