package Singleton;
//Early Instantiation
public class Jalebi {
	private static Jalebi jalebi=new Jalebi();
	private Jalebi() {
		
	}
	public static Jalebi getJalebi() {
		return jalebi;
	}
}
