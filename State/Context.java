package State;

public class Context {
	State s;
	Context(){
		this.s=new Ringer();
	}
	public void setState(State state) {
		s=state;
	}
	State getState(State state) {
		return state;
	}
	public void work(Context c) {
		System.out.println("Working according to Context...");
		s.work(this);
	}
}
