package Adapter;

public class Andriod {
	private AndriodCharger charger;
	public Andriod( AndriodCharger charger) {
		this.charger=charger;
	}
	void chargeAndriodphone() {
		  charger.chargeAndriodPhone();
	}
}
