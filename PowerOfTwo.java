import java.util.Scanner;

/**
 * Nmae:Girija Unnibhavi
 * Discription: compilation of java program to find whether the entered number is power of 2 or not
 * Date: 03/18/2021
 */
public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		System.out.println(checkNumber(n));
	}

	public static boolean checkNumber(int n) {
		if(n==0)
		return false;
		while(n!=1)
		{
			if(n%2!=0)
				return false;
			n=n/2;
		}
		return true;
		
	}
	
	}


