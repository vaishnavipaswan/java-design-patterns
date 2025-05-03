package ChainOfResponsibilty;

public class President extends LoanApprover{

	@Override
	public void approval(int loanAmt) {
		// TODO Auto-generated method stub
		if(loanAmt>10000) {
			System.out.println("Approved by President...");
		}
		else if(nextApprover!=null) {
			nextApprover.approval(loanAmt);
		}
		else {
			System.out.println("Loan is not approved...");
		}
	}

}
