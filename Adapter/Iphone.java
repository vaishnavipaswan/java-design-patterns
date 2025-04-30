package Adapter;

public class Iphone {
 
	private AppleCharger charger;
	public Iphone(AppleCharger charger) {
		this.charger=charger;
	}
	void chargeIphone() {
		charger.chargeIphone();
	}
}
