package ChainOfResponsibilty;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoanApprover m=new Manager();
		LoanApprover p=new President();
		LoanApprover c=new CEO();
		m.setNextApprover(c);
		c.setNextApprover(p);
		m.approval(10);
		m.approval(5000);
		m.approval(100000);
	}

}
