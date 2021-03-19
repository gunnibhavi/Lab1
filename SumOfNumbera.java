/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to calculate sum of first n natural numbers
 
 */
import java.util.Scanner;

public class SumOfNumbera {

private static int n;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println(i);
		}
		calculateSum(n);
		

	}
	
	public static void calculateSum( int n) {
		int sum=0;
		for(int i=0;i<n;i++)
		{
			int j=i;
			if(j%3==0 || j%5==0)
			{
				sum=sum+j;
			}
			
		}
	System.out.println("sum of first n natural numbers which are divisible by 3 or 5 is:"+sum);
	}
	

}
