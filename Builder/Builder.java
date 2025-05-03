package Builder;

public interface Builder {
	public Builder setOs(String os);
	public Builder setRam(int ram);
	public Builder setScreenSize(int ss);
	public Phone getGadget();
	public Laptop getGadge();
}
