package FactoryPattern;

public class EmpClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=EmployeeFactory.getEmployee("Andriod Developer");
		System.out.println(e.salary());
	}

}
