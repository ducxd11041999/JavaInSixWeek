package xdev;
import java.text.DecimalFormat;
import java.util.Scanner;
public class rectangleClass {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int height = 0, weight = 0;
		System.out.println("Please input height :");
		height = sc.nextInt();
		System.out.println("Please input weight :");
		weight = sc.nextInt();
		DecimalFormat fmt = new DecimalFormat("0.##");
		double pe = (weight + height)*2;
		System.out.println("Perimeter is:"+" "+ fmt.format(pe));
		double ac = weight*height;
		DecimalFormat fmt1=new DecimalFormat("0.##");
		System.out.println("Acreage is"+" "+ fmt1.format(ac));

	}

}
