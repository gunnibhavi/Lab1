/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to find the difference between sum of squares and square of sum of first n natural numbers
 Date: 03/18/2021
 */
import java.util.Scanner;

public class Difference {
	private static int n;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println(i);
		}
		calculateDifference(n);
	}
	public static void calculateDifference(int n) {
		int sumSq=0;
		int sum=0;
		for(int i=0;i<n;i++) {
			int j=i;
			sumSq=sumSq+j*j;
			sum=sum+j;
			
			
		}
		int sqSum=sum*sum;
		
		int difference=sumSq-sqSum;
		System.out.println("difference between sum of square and square of sums of first n natural numbers is: "+difference);
		
	}

}
