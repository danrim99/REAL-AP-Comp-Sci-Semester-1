import java.util.Scanner; //import Statement

public class NewCalculation
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("How many boys are there? ");
		
		int boys = keyboard.nextInt();
		
		System.out.println("Okay! How many girls? ");
		
		int girls = keyboard.nextInt();
		int People = boys+girls;
		
		System.out.println("Alright. There are " + People + " people.");
		}
}