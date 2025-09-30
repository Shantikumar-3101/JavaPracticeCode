package JavaCodeingPractice;

public class OccuernceOfString {

	public static void main(String[] args) {
		
		String str1="Hello World Hello World World";
		
		String[] str = str1.split(" ");
		int count=0;
		
		for(int i=0;i<str.length;i++) {
			
			if(str[i].equals("World")) {
				count++;
			}
		}
  System.out.println(count);
	}

}
