package Builder;

public class LaptopBuilder implements Builder {

	Laptop lap=new Laptop();

	@Override
	public Builder setOs(String os) {
		// TODO Auto-generated method stub
		this.lap.setOs(os);
		return this;
	}

	@Override
	public Builder setRam(int ram) {
		// TODO Auto-generated method stub
		this.lap.setRam(ram);
		return this;
	}

	@Override
	public PhoneBuilder setScreenSize(int ss) {
		// TODO Auto-generated method stub
		this.lap.setScreenSize(ss);
		return null;
	}

	@Override
	public Laptop getGadge() {
		// TODO Auto-generated method stub
		return this.lap;
	}
	
	
	@Override
	public Phone getGadget() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
