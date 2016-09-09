import java.util.Scanner; //import Statement

public class BMI_Calculator
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("How tall are you in inches? ");
		
		double tall = keyboard.nextDouble();
		
		System.out.println("Okay! How much do you weigh in pounds? ");
		
		double weigh = keyboard.nextDouble();
		double BMI = weigh*weigh/tall*tall;
		
		System.out.println("Alright. Your BMI is " + BMI);
		}
}