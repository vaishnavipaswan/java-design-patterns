package State;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Context c=new Context();
		c.work(c);
		c.setState(new Vibrator());
		c.work(c);
		
	}

}
