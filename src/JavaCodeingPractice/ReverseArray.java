package JavaCodeingPractice;

public class ReverseArray {
	
	public static void reversearray(int[] arr) {
		
		int left = 0, right = arr.length-1;
		
		while(left<right) {
			
			int temp = arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
			
		}
	}
	
	public static void main(String[] args) {
		
		int [] arr1 = {2,5,3,1,4};
		reversearray(arr1);
		for(int i =0;i < arr1.length;i++)
		System.out.print( arr1[i] + " ");
		
	}

}
