package BT4;

import java.util.Scanner;
import java.text.DecimalFormat;
public class HinhEclipse implements HinhActions {

	double a, b , r1 ,r2;
	String name = "Hinh Elipse";
	public String getName()
	{
		return name;
	}
	void setData(int A, int B, int R1, int R2)
	{
		a = A;
		b = B;
		r1 = R1;
		r2 = R2;
	}
	public void inputInfo()
	{
		System.out.print("Nhap ban truc be  : ");
		Scanner sc = new Scanner(System.in);
		b = sc.nextDouble();
		System.out.print("Nhap ban truc lon : ");
		a = sc.nextDouble();
		
		System.out.print("Nhap r1 : ");
		r1 = sc.nextDouble();
		System.out.print("Nhap r2 : ");
		r2 = sc.nextDouble();
	}
	public HinhEclipse() {
		// TODO Auto-generated constructor stub
		a =0;
		b=0;
		r1 = 0;
		r2 =0;
	}
	public HinhEclipse(int A, int B, int R1, int R2 ) {
		// TODO Auto-generated constructor stub
		a = A;
		b = B;
		r1 = R1;
		r2 = R2;
	}
	@Override
	public void DienTich() { 
		// TODO Auto-generated method stub
		double pe = a*b*3.14;
		DecimalFormat fmt=new DecimalFormat("0.##");
		System.out.print("Dien tich Elipse  la : " + fmt.format(pe));
	}

	@Override
	public void ChuVi() {
		double ac = 2*Math.PI*Math.sqrt(Math.pow(r1, 2)+ Math.pow(r2, 2) /2);
		DecimalFormat fmt1=new DecimalFormat("0.##");
		System.out.print("Chu vi Elipse la :"+" "+ fmt1.format(ac));
	}

}