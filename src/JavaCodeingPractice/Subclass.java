package JavaCodeingPractice;

public class Subclass extends PolymorphismProg {
	
	@Override
	public void add() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		PolymorphismProg p= new PolymorphismProg();
		p.add();
				
		
		Subclass s= new Subclass();
		s.add();

	}

}
