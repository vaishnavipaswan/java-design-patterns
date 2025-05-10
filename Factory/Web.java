package FactoryPattern;

public class Web implements Employee{

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		System.out.println("Web Developer's Salary: ");
		return 40000;
	}

}
