package BT2;

import java.util.Scanner;

public class inverseArrayClass_BT2 {

	public static void inversePrintArray(int[] array) {
		  for (int i = array.length - 1; i >= 0; i--) {
		    System.out.print(array[i] + " ");
		  }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int myList[] = new int [10]; 
		for (int i = 0; i < 10; i++) {
			System.out.print("Please input element " + i + " : " );
	         myList[i] = sc.nextInt();
		}
		inversePrintArray(myList);
	}

}
