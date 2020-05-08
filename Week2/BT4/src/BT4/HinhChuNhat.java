package BT4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HinhChuNhat implements HinhActions {

	double w = 0, h = 0;
	String name = "Hinh CN";
	public String getName()
	{
		return name;
	}
	void setData(int W, int H)
	{
		w = W;
		h = H;
	}
	public void inputInfo()
	{
		System.out.print("Nhap chieu rong hcn : ");
		Scanner sc = new Scanner(System.in);
		w = sc.nextDouble();
		System.out.print("Nhap chieu dai hcn : ");
		h = sc.nextDouble();
	}
	public HinhChuNhat() {
		// TODO Auto-generated constructor stub
		w = 0;
		h = 0;
	}
	public HinhChuNhat(int W, int H) {
		// TODO Auto-generated constructor stub
		w = W;
		h = H;
	}
	@Override
	public void DienTich() {
		// TODO Auto-generated method stub
		double pe = w*h;
		DecimalFormat fmt=new DecimalFormat("0.##");
		System.out.print("Dien tich HCN la : " + fmt.format(pe));
	}

	@Override
	public void ChuVi() {
		// TODO Auto-generated method stub
		double ac = (w+h)*2;
		DecimalFormat fmt=new DecimalFormat("0.##");
		System.out.print("Chu vi HCN la : " + fmt.format(ac));
	}

}
