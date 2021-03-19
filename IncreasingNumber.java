import java.util.Scanner;

/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to find whether the entered number is increasing number or not
 * Date: 03/18/2021
 */
public class IncreasingNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		 
		 System.out.println(checkNumber(n));

	}
	public static boolean checkNumber(int n) {
		
		int temp=n%10;
		n=n/10;
		
		while(n>0)
		{
			if(temp<n%10) {
				return false;
				}
			else if(temp==n%10) {
				return false;
			}
		temp=n%10;
		n=n/10;
			
		}
		
		return true;
		
		
		
	}
}


