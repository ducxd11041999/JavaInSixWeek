package xdev;
import java.text.DecimalFormat;
import java.util.Scanner;
public class cvtF2C_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập vào số độ F:");
		double f, H=9.0/5.0;
		System.out.println("F:");
		f=sc.nextDouble();
		DecimalFormat fmt=new DecimalFormat("0.##");
		System.out.println("F---> C:"+ " " + fmt.format((f-32)/H)+"'C");
	}
}
