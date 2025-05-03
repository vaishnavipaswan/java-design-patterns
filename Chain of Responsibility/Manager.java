package ChainOfResponsibilty;

public class Manager extends LoanApprover{

	@Override
	public void approval(int loanAmt) {
		// TODO Auto-generated method stub
		if(loanAmt<1000) {
			System.out.println("Approved by Manager...");
		}
		else if(nextApprover!=null) {
			nextApprover.approval(loanAmt);
		}
		else {
			System.out.println("Loan not approved...");
		}
	}

}
