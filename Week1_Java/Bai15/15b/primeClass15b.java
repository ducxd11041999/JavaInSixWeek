package xdev;

import java.util.Scanner;

public class primeClass15b {
	
	static void printPrime(int n) 
	{ 
	    for (int i = 2; i <= n; i++) 
	    { 
	        if (isPrime(i)) 
	            System.out.print(i + " "); 
	    } 
	}
	static boolean isPrime(int n) 
	{ 
	    if (n <= 1) 
	        return false; 
	    if (n <= 3) 
	        return true; 
	  
	    if (n % 2 == 0 ||  
	        n % 3 == 0) 
	        return false; 
	  
	    for (int i = 5; 
	             i * i <= n; i = i + 6) 
	        if (n % i == 0 || 
	            n % (i + 2) == 0) 
	            return false; 
	  
	    return true; 
	} 
	public static void main(String[] args) {
		int n; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number :");
		n =sc.nextInt();
		System.out.println("Prime less than "+ " " + n); 
	    printPrime(n);		

	}

}
