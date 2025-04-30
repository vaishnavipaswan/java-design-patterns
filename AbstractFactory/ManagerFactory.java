package AbstractFactory;

public class ManagerFactory extends EmployeeAbstractFactory{

	@Override
	Employee createEmployee() {
		// TODO Auto-generated method stub
		return new Manager();
	}
	
}
