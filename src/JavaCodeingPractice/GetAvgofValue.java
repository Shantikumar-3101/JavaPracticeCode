package JavaCodeingPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GetAvgofValue {

	public static void main(String[] args) {

		Map<String, Integer> student = new HashMap<>();
		student.put("Bob", 95);
		student.put("Alice", 75);
		student.put("Charle", 80);
		student.put("Sam", 90);
		
		System.out.println(student);
		
		int sum=0;
		for(int num:student.values()) {
			sum+=num;
		}
		System.out.println(sum);
		int avg=0;
		avg=sum/student.size();
		System.out.println(avg);
		
		
		for(Map.Entry<String, Integer> value : student.entrySet()) {
//			
//           // Entry<String, Integer> value1 = null;
//		Integer value2 += value.getValue();
////		System.out.println(value2);
           
		}
	
		
	}

}
