package Prototype;

public class NetworkConnection implements Clonnable{
	private String ip;
	private String data;
	public void setIp(String ip) {
		this.ip=ip;
	}
	public void setData(String data) {
		this.data=data;
	}
	public String getIp(String ip) {
		return ip;
	}
	public String getData(String data) {
		return data;
	}
	public String toString() {
		return"ip: "+ip+" data: "+data;
	}
	public void loadData() {
		this.data= "Very Important Data";
	}
	protected Object Clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
