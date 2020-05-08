package xdev;

import java.util.Scanner;

public class Prime15c {

	static boolean isPrime(int n) 
	{ 
	    // Corner cases 
	    if (n <= 1) 
	        return false; 
	    if (n <= 3) 
	        return true; 
	    if (n % 2 == 0 ||  
	        n % 3 == 0) 
	        return false; 
	    int i = 5;
	   do
	    {
	    	 if (n % i == 0 || 
	 	            n % (i + 2) == 0) 
	 	            return false; 
	    	i+=6;
	    } while(i*i<=n);
	    return true; 
	} 
	static void printPrime(int n) 
	{ 
		int i = 2;
		do
		{
			if (isPrime(i)) 
	            System.out.print(i + " "); 
			i++;
		}while(i <= n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number :");
		n =sc.nextInt();
		System.out.println("Prime less than "+ " " + n); 
	    printPrime(n);
	}

}
