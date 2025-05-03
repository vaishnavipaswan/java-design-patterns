package Builder;

public class PhoneBuilder implements Builder{
	Phone ph=new Phone();

	@Override
	public Builder setOs(String os) {
		// TODO Auto-generated method stub
		this.ph.setOs(os);
		return this;
	}

	@Override
	public Builder setRam(int ram) {
		// TODO Auto-generated method stub
		this.ph.setRam(ram);
		return this;
	}

	@Override
	public Builder setScreenSize(int ss) {
		// TODO Auto-generated method stub
		this.ph.setScreenSize(ss);
		return this;
	}

	@Override
	public Phone getGadget() {
		// TODO Auto-generated method stub
		return this.ph;
	}

	@Override
	public Laptop getGadge() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
