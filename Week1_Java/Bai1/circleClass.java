package xdev;
import java.text.DecimalFormat;
import java.util.Scanner;
public class circleClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r;
		System.out.println("Please input radius :");
		r=sc.nextInt();
		DecimalFormat fmt=new DecimalFormat("0.##");
		double pe = Math.PI*Math.pow(r,2);
		System.out.println("Perimeter is:"+" "+ fmt.format(pe));
		double ac = 2*Math.PI*r;
		DecimalFormat fmt1=new DecimalFormat("0.##");
		System.out.println("Acreage is"+" "+ fmt1.format(ac));
	}
}
