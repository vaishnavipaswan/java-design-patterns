package ChainOfResponsibilty;

public abstract class LoanApprover {

	protected LoanApprover nextApprover;
	public void setNextApprover(LoanApprover nextApprover) {
		this.nextApprover=nextApprover;
	}
	public abstract void approval(int loanAmt);
}
