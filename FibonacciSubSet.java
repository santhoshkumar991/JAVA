import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FibonacciDemo {
	
	public static void countSubSequence(int arr[],int n)
	{
		Set<Integer> subSet = new HashSet<Integer>();
		int i;
		int j;
		for(i=0;i<n-1;i++) {
			for(j=i+1;j<n;j++) {
				
			
			int sum=arr[i]+arr[j];
			int check = Arrays.binarySearch(arr, sum);
			if(check<0) {
				continue;
			}
			else {
				subSet.add(arr[i]);
				subSet.add(arr[j]);
				subSet.add(arr[check]);
				i=check-1;
				break;
			}
		}
		}
		System.out.println(subSet.size());
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int [n];
		int i;
		for(i=0;i<n;i++)
			arr[i]=s.nextInt();
		countSubSequence(arr,n);
	}
}

/*
count the largest subset array which has only fibonacci numbers
input
6
3 4 5 6 7 8 
output
3

explanation

In this array we have 3 fibonacci numbers
3 5 8
3+5=8
*/
