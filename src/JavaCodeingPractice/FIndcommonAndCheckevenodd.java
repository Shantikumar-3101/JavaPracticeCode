package JavaCodeingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIndcommonAndCheckevenodd {

	public static void main(String[] args) {
 
	List<Integer> list1 = Arrays.asList(1,2,3,4,5);
	List<Integer> list2 = Arrays.asList(3,4,5,6,7);
	
	List<Integer> common = new ArrayList<>(list1);
	
	common.retainAll(list2);
	int sum=0;
	
	System.out.println(common);
	for( Integer num : common) {
		sum+=num;
	}
	
	System.out.println(sum);
	
	if(sum%2==0) {
		
		System.out.println("Its even");
	} else {
		System.out.println("odd");
	}
		
	}

}
