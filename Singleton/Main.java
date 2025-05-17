package Singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samosa s1=Samosa.getSamosa();
		System.out.println(s1.hashCode());
		Samosa s2=Samosa.getSamosa();
		System.out.println(s2.hashCode());
		Jalebi j1=Jalebi.getJalebi();
		System.out.println(j1.hashCode());
		Jalebi j2=Jalebi.getJalebi();
		System.out.println(j2.hashCode());

	}

}
