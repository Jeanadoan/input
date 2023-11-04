package inputcalculation;
import java.util.Scanner;

public class InputSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Scanner input= new Scanner (System.in);
		
	//	System.out.println ("Enter two numbers: ");
		
	//	Float one = input.nextFloat ();
		
	//	System.out.print ("+");
		
	//	Float two = input.nextFloat ();
		
	//	System.out.print("= ");
	//	System.out.println (one + two);
	
		Scanner input= new Scanner (System.in);
	System.out.println ("How tall are you?: ");
	int height =input.nextInt();
	
		
		if (height == 150) { //true or false?
			System.out.println ("you can go");
			
		}
		
		else {
		System.out.println ("you cant go");
	
		}
	
	}
}
