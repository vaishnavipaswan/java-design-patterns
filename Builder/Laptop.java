package Builder;

public class Laptop {

	private String os;
	private int ram;
	private int screensize;
	public Laptop() {
		
	}
	public Laptop(String os,int ram,int screensize) {
		this.os=os;
		this.ram=ram;
		this.screensize=screensize;
	}
	public Laptop setOs(String os) {
		this.os=os;
		return this;
	}
	public Laptop setRam(int ram) {
		this.ram=ram;
		return this;
	}
	public Laptop setScreenSize(int screensize) {
		this.screensize=screensize;
		return this;
	}
	public String toString() {
		return "Laptop with Os:"+os+"Ram:"+ram+"Screen Size:"+screensize;
	}
}
