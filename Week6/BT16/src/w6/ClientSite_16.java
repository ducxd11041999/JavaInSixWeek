package w6;

import java.io.*;
import java.net.*;
class ClientSite_16
{
	public static void main(String[] args) throws Exception
	{
		Socket server=new Socket("127.0.0.1",8080);//có thể đổi IP hoặc Port
		System.out.println("Client kết nối đến cổng 8080 của Server...");
		PrintWriter pw=new PrintWriter(server.getOutputStream());
		BufferedReader br=new BufferedReader(new 									InputStreamReader(server.getInputStream()));
		String st;
	//Nhập chuỗi bất kỳ từ bàn phím
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Nhap so nguyen bat ky : ");
		st = in.readLine();

		//Gửi chuỗi đã nhập từ bàn phím đến Máy Chủ
		pw.write(st);
		pw.write("\n");
		pw.flush();	
		//Nhận lại chuỗi được gửi trả về từ Máy Chủ và in lên màn hình
		int count = Integer.parseInt(br.readLine());
		System.out.println("Tong tu 1 den " + st + " la: "+ count);
		//Kết thúc chương trình
		pw.close();
		br.close();
		server.close();
	}
}