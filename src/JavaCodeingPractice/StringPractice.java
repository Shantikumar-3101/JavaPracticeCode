package JavaCodeingPractice;

public class StringPractice {

	public static void main(String[] args) {

		String str= "Testing";
		String str1 ="Testing";
		//System.out.println(str);
		
		String strwithobject= new String("Stringobject");
		String strwithobject1= new String("Stringobject");
		
		System.out.println(strwithobject==strwithobject1);
		System.out.println(strwithobject.equals(strwithobject1));
		
		
		//System.out.println(strwithobject);
		
		//System.out.println(str==str1);
		//System.out.println(str.equals(str1));
		
		String mainstring = "testing";
		String modified = mainstring.concat("automate");
		System.out.println(modified);
		System.out.println(mainstring);
		
		

		
	}

}
