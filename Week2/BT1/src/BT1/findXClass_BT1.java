package BT1;
import java.util.Scanner;
public class findXClass_BT1 {
	
	public static void findX(int x , int[] arr)
	{
	    boolean flag = false;
		for(int i = 0; i<arr.length; i++)
		{
			if (arr[i] == x)
			{
				System.out.print(x + " have in array at position "+ (i+1));
				flag = true;
			}
		}
		if(!flag)
		{
			System.out.print("Not found "+ x +" in array");
		}
	}
	public static void printArray(int[] array) {
		  for (int i = 0; i < array.length; i++) {
		    System.out.print(array[i] + " ");
		  }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please input number of Array : ");
		int N = sc.nextInt();
		int myList[] = new int [N]; 
		for (int i = 0; i < N; i++) {
			System.out.print("Please input element " + i + " : " );
	         myList[i] = sc.nextInt();
		}
		System.out.print("Please input number you want to find  : ");
		int X = sc.nextInt();
		findX(X, myList);
	}

}
