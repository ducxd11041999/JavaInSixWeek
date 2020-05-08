package w6;

import java.io.*;
import java.net.*;
class ServerSite_22
{
	public static void main(String[] args) throws Exception
	{
		try (ServerSocket server = new ServerSocket(8080)) {
			System.out.println("Server chờ kết nối ở cổng 8080....");

			Socket client=server.accept();
			System.out.println("Kết Nối Thành Công.");
			PrintWriter pw=new PrintWriter(client.getOutputStream());
			BufferedReader br=new BufferedReader(new 									InputStreamReader(client.getInputStream()));
			String st="";

			//Nhận chuỗi bất kỳ được gửi từ bàn phím
			st=br.readLine();
			
			//Tiến hành thay thế chuỗi, hàm thay thế được viết bên dưới
			st=ChuHoaDau(st);

			//Gửi trả lại chuỗi sau khi đã thay thế về cho Máy Khách
			pw.write(st);
			pw.write("\n");
			pw.flush();

			//Kết thúc chương trình
			br.close();
			pw.close();
				client.close();
		}
	}
	public static String ChuHoaDau(String st)
	{
		if (st.charAt(0)!=' ')
		{
			st = st.substring(0,1).toUpperCase().concat(st.substring(1));
		}
		for (int i=0;i<st.length() ;i++ )
			if (st.charAt(i)==' ')
			{
				int vt = i+1;
				String st1 = st.substring(0,vt);
				String st2 = st.substring(vt,vt+1).toUpperCase();
				String st3 = st.substring(vt+1);
				st = st1.concat(st2.concat(st3));
			}
		return st;
	}

}
