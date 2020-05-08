package BT4;
import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Random;
public class BT4Class {

	private static final BT4Class RandomArray = null;
	public BT4Class() {
	}
	public static ArrayList<Integer> generate(int number) {

		//Khai bao thanh phan trung gian
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		int count=0;
		int value;
		boolean flag;
		while(count<number) {
			flag = false;
			value = (int)(Math.random()*9);//Gia su cac gia tri nam trong khoang tu 1 den 100
			for(int i=0; i<tmp.size(); i++){
					if(((Integer)tmp.get(i)).intValue()==value){
							flag = true;
									break;
						}
				}
			if(!flag){
				tmp.add(value);
				count++;
			}
		}
		return tmp;
	}
	public static void main(String[] args) {
		HinhActions h[] = new HinhActions[9];
		ArrayList<Integer> arrInt = BT4Class.generate(9);
		//System.out.print(arrInt);
		int countCir=0 , countRec=0;
		for(int i=0; i<9;i++)
		{
			int index = arrInt.get(i);
			if(countRec < 3)
			{
				h[index] = new HinhChuNhat(index, index+5);
				countRec++;
			}
			else if(countCir < 3)
			{
				h[index] = new HinhTron(index+1);
				countRec++;
				countCir++;
			}
			else
			{
				h[index] = new HinhEclipse(index+1, index+2, index+2, index + 3);
			}
				
		}
	
		///output of Hinh
		
		for (int i =0 ; i< h.length;i++)
		{
			System.out.print(i+1 +" "+h[i].getName()+"\n");
			h[i].ChuVi();
			System.out.print("\n");
			h[i].DienTich();
			System.out.print("\n");
		}
	}

}