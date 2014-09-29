package footballer;
import java.util.Scanner;

public class Calculate {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Input the number of touchdowns: ");
		double TD = input.nextInt();
		
		System.out.println("Input the number of Yards: ");
		double Yards = input.nextInt();

		System.out.println("Input the number of interceptions: ");
		double INT = input.nextInt();
		
		System.out.println("Input the number of completions: ");
		double Comp = input.nextInt();
		
		System.out.println("Input the number of attempts: ");
		double ATT = input.nextInt();
		
		
		double a = ((Comp / ATT) - 0.3) * 5;
		if (a < 0){
			a = 0;
		}
		if (a > 2.375){
			a = 2.375;
		}
		
		double b = ((Yards / ATT) - 3) * .25;
		if (b < 0){
			b = 0;
		}
		if (b > 2.375){
			b = 2.375;
		}
		
		double c = ((TD / ATT) * 20);
		if (c < 0){
			c = 0;
		}
		if (c > 2.375){
			c = 2.375;
		}
		
		double d = 2.375 - ((INT / ATT) * 25);
		if (d < 0){
			d = 0;
		}
		if (d > 2.375){
			d = 2.375;
		}
		
		double PR = ((a + b + c + d) / 6) * 100;
		
		System.out.println("This player's Passer Rating is:" + PR);
		
	}
	

}
