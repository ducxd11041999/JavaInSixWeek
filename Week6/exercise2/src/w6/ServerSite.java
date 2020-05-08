package w6;

import java.io.*;
import java.net.*;

class ServerSite 
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

			//Nhận chuỗi bất kỳ được gửi từ Client
			st=br.readLine();
			
			//Tiến hành thay thế chuỗi, hàm thay thế được viết bên dưới
			int dem = DemKT(st);

			//Gửi trả lại chuỗi sau khi đã thay thế về cho Máy Khách
			pw.write(String.valueOf(dem));	
			//pw.write(st);
			pw.write("\n");
			pw.flush();

			//Kết thúc chương trình
			br.close();
			pw.close();
				client.close();
		}
	}
	public static int DemKT(String st)
	{
		int dem = 0;
		char kt='A';
		for (int i=0;i<st.length();i++)
			if (kt==st.charAt(i))
				dem++;
		return dem;
	}
}


