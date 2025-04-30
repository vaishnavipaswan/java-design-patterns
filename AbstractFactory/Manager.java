package AbstractFactory;

public class Manager implements Employee{

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		System.out.print("Salary of Manager: ");
		return 100000;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		System.out.print("I am ");
		return "Manager";
	}

}
