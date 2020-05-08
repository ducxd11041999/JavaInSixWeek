package xdev;
import java.util.Scanner;
public class cvtHM2S_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int gio,phut,giay,a;
		System.out.println("Nhập số giờ:");
		gio=sc.nextInt();
		System.out.println("Nhập số phút:");
		phut=sc.nextInt();
		System.out.println("Nhập số giây:");
		giay=sc.nextInt();
		a=(gio*3600)+(phut*60)+(giay);
		System.out.println("Tổng số giây là:" + " " +a);
	}

}
