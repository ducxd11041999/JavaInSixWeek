package finalScore_12;
import java.util.Scanner;
public class finalScore {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float score;
		System.out.println("Please input final score :");
		score = sc.nextFloat();
		if (score <= 4)
			System.out.println("Y");
		else if (score <= 6 )
			System.out.println("TB");
		else if (score <= 8 )
			System.out.println("K");
		else
			System.out.println("G");
	}
}