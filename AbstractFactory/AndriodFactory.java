package AbstractFactory;

public class AndriodFactory extends EmployeeAbstractFactory{

	@Override
	Employee createEmployee() {
		// TODO Auto-generated method stub
		return new Andriod();
	}

}
