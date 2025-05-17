package Proxy;

public class RealObjectProxy implements RealObject{
	RealObject ROI=null;
	public void doSomething() {
		if(ROI==null) {
			 ROI=new RealObjectImpl();
		}
		System.out.println("Delegating work on Real Object...");
		ROI.doSomething();
		ROI=null;
	}
}
