package FactoryPattern;

public class EmployeeFactory {

	public static Employee getEmployee(String emp) {
		
		if(emp.trim().equalsIgnoreCase("Andriod Developer")) {
			return new Andriod();
		}
		else if(emp.trim().equalsIgnoreCase("Web Developer")) {
			return new Web();
		}
		else 
			return null;
	}
}
