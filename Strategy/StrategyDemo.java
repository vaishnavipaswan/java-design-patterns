package Strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TravelStrategy t=new TravelStrategy();
		t.setStrategy(new BusTravel());
		t.executeTravel();
		System.out.println("====================");
		t.setStrategy(new TrainTravel());
		t.executeTravel();
	}

}
