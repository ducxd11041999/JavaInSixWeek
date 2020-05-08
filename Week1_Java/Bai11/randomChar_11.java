package xdev;
import java.util.Random;
public class randomChar_11 {

	static String getAlphaNumericString(int n) 
    { 
  
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz";  
        StringBuilder sb = new StringBuilder(n); 
        for (int i = 0; i < n; i++) {  
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
          
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random(); 
		int n = rd.nextInt(20)+ 1;
        // Get and display the alphanumeric string 
        System.out.println(randomChar_11 
                               .getAlphaNumericString(n)); 

		
	}

}
