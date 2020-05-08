package w6;

import java.io.*;
import java.net.*;
class ServerSite_6
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
			
			int count = DemTuTrongChuoiKhongChuanHoa(st);

			//Gửi trả lại chuỗi sau khi đã thay thế về cho Máy Khách
			pw.write(String.valueOf(count));
			pw.write("\n");
			pw.flush();

			//Kết thúc chương trình
			br.close();
			pw.close();
				client.close();
		}
	}
	public static int DemTuTrongChuoiKhongChuanHoa(String st)
	{
	int dem;
		if (st.charAt(0)!=' ')
			dem = 1;
		else
			dem = 0;
		for (int i=0;i<st.length();i++ )
		{
			if (st.charAt(i)==' ' && st.charAt(i+1)!=' ')
			{
				dem++;
			}
		}
		return dem;
	}


}

