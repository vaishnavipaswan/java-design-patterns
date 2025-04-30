package AbstractFactory;

public class Andriod implements Employee{

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		System.out.print("Salary of Andriod Developer");
		return 50000;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		System.out.print("I am ");
		return "Andriod Developer";
	}
	
}
