package cvtS2HM_8;
import java.util.Scanner;
public class cvtS2HM_8Class {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Tổng số giây :"+" ");
		int a;
		a=sc.nextInt();
		System.out.println((a/3600)+" "+"Giờ"+" "+(a%3600)/60+" "+"phút"+(a%60)+" "+"Giây");
		}
}
