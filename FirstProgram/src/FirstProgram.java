import java.util.Scanner;

public class FirstProgram {
	public static void main(String[] args)
	{
			System.out.println("Vipul Kondam");
			System.out.println("I will add the two numbers for you.");
			System.out.println("Enter two whole numbers on a line:");
			
			int n1,n2;
			
			Scanner keyboard = new Scanner(System.in);
			
			n1 = keyboard.nextInt();
			n2 = keyboard.nextInt();
				
			System.out.println("The sum of those two numbers is:");
			System.out.println(n1+n2);
		
	}

}
