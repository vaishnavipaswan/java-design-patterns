package Composite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component mouse=new Leaf("Mouse",500);
		Component keyboard=new Leaf("Keyboard",5000);
		Component hd=new Leaf("HDD",3000);
		Component ram=new Leaf("Ram",8000);
		Component cpu=new Leaf("CPU",10000);
		Composite ph=new Composite("peripherals");
		Composite mb=new Composite("MB");
        Composite cab=new Composite("Cabinet");
        Composite computer=new Composite("Computer");
        ph.add(mouse);
        ph.add(keyboard);
        mb.add(ram);
        mb.add(cpu);
        cab.add(mb);
        cab.add(hd);
        computer.add(ph);
        computer.add(cab);
        computer.showPrice();
	}

}
