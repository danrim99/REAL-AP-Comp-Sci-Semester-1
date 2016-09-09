import java.util.Scanner; //import Statement

public class RudeAI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("Hi, my name is RudeAI. I'd like to ask you a few questions. What is your name? ");
		
		String name = keyboard.next();
		
		System.out.println("Wow! " + name + " is a trash name! How old are you?");
		
		String age = keyboard.next();
		
		System.out.println("Ew! " + age + " is such a gross age! What do you do for fun?");
		
		String fun = keyboard.next();
		
		System.out.println("What? " + fun + " is for NERDs! What kind of music do you like? ");
		
		String music = keyboard.next();
		
		System.out.println("Dude " + music + " sucks. Listen to jazz instead. How many siblings do you have? ");
		
		String siblings = keyboard.next();
		
		System.out.println("Haha " + siblings + "?. Your parents should have given up after one. What do you want to be when you grow up? ");
		
		String be = keyboard.next();

		System.out.println("You want to be a " + be + "? You're too dumb to be that.");
		}
}