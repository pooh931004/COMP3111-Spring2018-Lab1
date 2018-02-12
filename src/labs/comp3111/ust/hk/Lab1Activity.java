package labs.comp3111.ust.hk;

public class Lab1Activity{
	
	public static void main(String[] args_) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		//write your code here..
		for (int i=0; i<10; i++) {
			sum=sum+arr[i];
		}
		
		int min;
		int max;
		
		
		
		System.out.println(String.format("Sum of the numbers is %d",sum));
		findMin(arr);
		findMax(arr);
	}
	
	static void findMin(int x[]) {
		int min=1;
		
		for (int i=0; i<10; i++) {
			if (min>x[i])
				min=x[i];
			else
				continue;
		}
		System.out.print("Min = "+min+"; ");
	}
	
	static void findMax(int x[]) {
		int max=1;
		
		for (int i=0; i<10; i++) {
			if (max<x[i])
				max=x[i];
			else
				continue;
		}
		System.out.println("Max = "+max);
	}
}
