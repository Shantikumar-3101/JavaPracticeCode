package JavaCodeingPractice;

public class FindMissingnumber {
	
	public static int findmissinnum(int arr[],int n) {
		
		int expected = n * (n+1)/2;
		int actual = 0;
		
		for(int num : arr) {
			
			actual+=num;
			
		}
		
		return expected - actual;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,4,5};
		int n=5;
		System.out.println(findmissinnum(arr, n));
		
	}

}
