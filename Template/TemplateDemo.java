package Template;

public class TemplateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker p=new Postman();
		p.works();
		System.out.println("===========================================");
		Worker g=new Gardener();
		g.works();
	}

}
