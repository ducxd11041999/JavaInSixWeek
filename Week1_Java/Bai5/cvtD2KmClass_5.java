package xdev;
import java.text.DecimalFormat;
import java.util.Scanner;
public class cvtD2KmClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float mile;
		System.out.println("Nhập số dặm:"+ " ");
		mile=sc.nextFloat();
		DecimalFormat fmt=new DecimalFormat("0.##");
		System.out.println("Số Kilometers là " + " " + fmt.format( mile*1.60935)+ "Km");
	}
} 
