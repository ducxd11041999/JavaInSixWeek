package xdev;
import java.util.Scanner;
public class calClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Viết chương trình nhập vào 2 số nguyên sau đó tính các giá trị của các tổng, hiệu, thương, tích của 2 số nguyên đó."
		);
		int a,b;
		System.out.println("Vui lòng Nhập Số a:"+" ");
		a=sc.nextInt();
		System.out.println("Vui lòng Nhập Số b:"+" ");
		b=sc.nextInt();
		System.out.println("Tổng là:"+" "+(a+b));
		System.out.println("Hiệu là:"+" "+(a-b));
		System.out.println("Thương là:"+" "+((float)a/b));
		System.out.println("Tích là:"+" "+ (a*b));
	}
}
