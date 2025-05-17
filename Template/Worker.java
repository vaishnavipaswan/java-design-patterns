package Template;

public abstract class Worker {
	void wakeUp() {
		System.out.println("Waking Up...");
	}
	void breakfast() {
		System.out.println("Having Breakfast...");
	}
	void goToWork() {
		System.out.println("Going to Work...");
	}
	abstract void work();
	void returnHome() {
		System.out.println("Returning Home...");
	}
	void dinner() {
		System.out.println("Having Dinner...");
	}
	void goingToSleep() {
		System.out.println("Going to Sleep...");
	}
	final void works() {
		wakeUp();
		breakfast();
		goToWork();
		work();
		returnHome();
		dinner();
		goingToSleep();
		}
}
