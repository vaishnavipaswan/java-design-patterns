package Adapter;

public class Adapter implements AppleCharger{
	private AndriodCharger charger;
	
	public Adapter(AndriodCharger charger){
		this.charger=charger;
	}
	@Override
	public void chargeIphone() {
		// TODO Auto-generated method stub
		System.out.println("Charging with Adapter...");
		charger.chargeAndriodPhone();
	}

}
