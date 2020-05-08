package BT3;
import java.lang.String;
import java.io.*;
public class handleStringClass_BT3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			System.out.println("\n *** Nhap chuoi 1:");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String str = in.readLine(); 
			System.out.println("\n *** Nhap chuoi 2:");
			BufferedReader in2 = new BufferedReader(new InputStreamReader(System.in));
			String str2 = in2.readLine();
			int strcmp = str.compareTo(str2);
			if(strcmp==0)
			{
				System.out.println("Equal");
			}else if (strcmp < 0)
			{
				System.out.println("String 1 longer string 2");
			}
			else
			{
				System.out.println("String 2 longer string 1");
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		
	
	}

}
