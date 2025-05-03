package Builder;

public class Phone {
	private String os;
	private int ram;
	private int screensize;
	public Phone() {
		
	}
	public Phone(String os,int ram,int screensize) {
		this.os=os;
		this.ram=ram;
		this.screensize=screensize;
	}
	public Phone setOs(String s) {
		this.os=s;
		return this;
	}
	public Phone setRam(int r) {
		this.ram=r;
		return this;
	}
	public Phone setScreenSize(int ss) {
		this.screensize=ss;
		return this;
	}
	public String toString(){
		return "Phone with os:"+os+"ram:"+ram+"screen size:"+screensize;
	}
}
