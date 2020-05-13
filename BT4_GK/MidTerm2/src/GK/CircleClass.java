package GK;

import java.text.DecimalFormat;
public class CircleClass implements ActionShapes {
	float r;
	String name = "Hinh Tron";
	public String getName()
	{
		return name;
	}
	void setData(int R)
	{
		r = R;
	}
	public CircleClass() {
		// TODO Auto-generated constructor stub
		r = 0;
	}
	public CircleClass(int x) {
		// TODO Auto-generated constructor stub
		r = x;
	}
	@Override
	public void Area() {
		// TODO Auto-generated method stub
		DecimalFormat fmt=new DecimalFormat("0.##");
		double pe = Math.PI*Math.pow(r,2);
		System.out.print("Dien tich hinh tron la : "+ fmt.format(pe));
	}

	@Override
	public void Perimeter() {
		// TODO Auto-generated method stub
		double ac = 2*Math.PI*r;
		DecimalFormat fmt1=new DecimalFormat("0.##");
		System.out.print("Chu vi hinh tron la :"+" "+ fmt1.format(ac));
	}
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("R = "+ r);
	}
}