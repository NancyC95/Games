import java.util.Random;
import java.util.Scanner;
public class ThreeCardMonte {
	public static void main(String[] args){
		int guess;
	
		Random r = new Random();
		int x = 1 + r.nextInt(3);
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("O\tO\tO");
		System.out.println("1\t2\t3");
		
		System.out.println("One ball. Three cups. Pick the cup you think it's under!");
		guess = keyboard.nextInt();
		
		if (guess == x){
			System.out.println("You go it!");
			if (x == 1)
				System.out.println(".\tO\tO");
			if (x == 2)
				System.out.println("O\t.\tO");
			if (x == 3)
				System.out.println("O\tO\t.");
		}
		if (guess != x){
			System.out.println("It's under cup " + x + ". Try again next time!");
			if (x == 1)
				System.out.println(".\tO\tO");
			if (x == 2)
				System.out.println("O\t.\tO");
			if (x == 3)
				System.out.println("O\tO\t.");
		}
			
	
	
	
	}
}
