package ChainOfResponsibilty;

public class CEO extends LoanApprover{

	@Override
	public void approval(int loanAmt) {
		// TODO Auto-generated method stub
		if(loanAmt<8000) {
			System.out.println("Approved by CEO...");
		}
		else if(nextApprover!=null) {
			nextApprover.approval(loanAmt);
		}
		else {
			System.out.println("Loan not approved...");
		}
	}

}
