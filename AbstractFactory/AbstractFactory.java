package AbstractFactory;

public class AbstractFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= EmployeeFactory.getEmployee(new AndriodFactory());
		System.out.println(e1.name());
		Employee e2=EmployeeFactory.getEmployee(new WebFactory());
		System.out.println(e2.name());
		Employee e3=EmployeeFactory.getEmployee(new ManagerFactory());
		System.out.println(e3.name());
	}
}
