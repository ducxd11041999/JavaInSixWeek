package w6;

import java.io.*;
import java.net.*;
class ClientSite_2
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
		System.out.print("Nhap chuoi bat ky : ");
		st = in.readLine();
		st = ChuanHoa(st);
		//Gửi chuỗi đã nhập từ bàn phím đến Máy Chủ
		pw.write(st);
		pw.write("\n");
		pw.flush();	
		//Nhận lại chuỗi được gửi trả về từ Máy Chủ và in lên màn hình
		int count = Integer.parseInt(br.readLine());
		System.out.println("So tu dem duoc tu server : " + count);
		//Kết thúc chương trình
		pw.close();
		br.close();
		server.close();
	}
	public static String ChuanHoa(String st)
	{
		st=st.trim();
		while (st.indexOf("  ")>=0)
		{
		   st=st.replaceAll("  "," ");
		}
		st = st.toLowerCase();
		String[] ARR=st.split(" ");
		for (int i = 0; i < ARR.length; i++) 
		ARR[i]=ARR[i].substring(0, 1).toUpperCase().concat(ARR[i].substring(1));
		st="";
		for (int i = 0; i < ARR.length-1; i++) 
			st=st.concat(ARR[i])+" ";
		st=st.concat(ARR[ARR.length-1]);
		return st;
	}

}