package AbstractFactory;

public class WebFactory extends EmployeeAbstractFactory{

	@Override
	Employee createEmployee() {
		// TODO Auto-generated method stub
		return new Web();
	}

}
