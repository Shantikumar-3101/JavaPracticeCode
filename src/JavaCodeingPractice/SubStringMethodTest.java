package JavaCodeingPractice;

public class SubStringMethodTest {
	
	
	public static boolean isStringcontains(String s, String sub) {
		
		return s.contains(sub);
		
	}

	public static void main(String[] args) {
		
		String s="Hellow World";
		String Sub ="world";
		
		System.out.println(isStringcontains(s ,Sub));

	}

}
