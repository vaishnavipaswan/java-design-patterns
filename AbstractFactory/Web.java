package AbstractFactory;

public class Web implements Employee{

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		System.out.print("Salary of Web Developer: ");
		return 40000;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		System.out.print("I am ");
		return "Web Developer";
	}

}
