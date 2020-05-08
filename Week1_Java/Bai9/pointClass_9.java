package point_9;
import java.util.Scanner;
import java.text.DecimalFormat;
public class pointClass_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x1,x2,y1,y2;
		double distance;
		System.out.println("Nhập x1:");
		x1=sc.nextInt();
		System.out.println("Nhập x2:");
		x2=sc.nextInt();
		System.out.println("Nhậ­p y1:");
		y1=sc.nextInt();
		System.out.println("Nhập y2:");
		y2=sc.nextInt();
		distance= Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2));
		DecimalFormat fmt=new DecimalFormat("0.##");
		System.out.println("Tọa độ 2 điểm là :"+ fmt.format(distance));
	}

}
