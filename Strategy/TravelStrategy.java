package Strategy;

public class TravelStrategy {

	private Travel strategy;
	void setStrategy(Travel strategy) {
		this.strategy=strategy;
		}
	void executeTravel() {
		strategy.travel();
	}
	
}
