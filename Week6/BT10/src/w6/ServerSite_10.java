package w6;

import java.io.*;
import java.net.*;
class ServerSite_10
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
			
			int count = DemKT_Hoa(st);

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
	public static int DemKT_Hoa(String str) {
	    int soKyTuInHoa = 0, soKyTuInThuong = 0, soChuSo = 0;
	 
	    // đếm và in ra số lần xuất hiện của ký tự đó trong chuỗi
	    // duyệt từ đầu đến cuối chuỗi
	    // nếu có ký tự nào tại vị trí i bằng với ký tự ch thì tăng biến count lên 1
	    for (int i = 0; i < str.length(); i++) {
	        // hàm isUpperCase() là hàm dùng để kiểm tra ký tự tại vị trí i
	        // có phải là ký tự in hoa hay không.
	        if (Character.isUpperCase(str.charAt(i))) {
	            soKyTuInHoa++;
	        } 
	             
	        // hàm isLowerCase() là hàm dùng để kiểm tra ký tự tại vị trí i
	        // có phải là ký tự in thường hay không.
	        if (Character.isLowerCase(str.charAt(i))) {
	            soKyTuInThuong++;
	        } 
	             
	        // hàm isDigit() là hàm dùng để kiểm tra ký tự tại vị trí i
	        // có phải là số hay không.
	        if (Character.isDigit(str.charAt(i))) {
	            soChuSo++;
	        }
	    }
	         
	 return soKyTuInHoa;
	}


}

