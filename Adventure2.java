import java.util.Scanner;
public class Adventure2 {
	public static void main(String[] args){
		int room = 1 ;
		String choice = "";
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Adventure Part 2!");
		
		while (room > 0){
			if (room == 1){
				System.out.println("You start at the front door of a cottage you found in the woods. Would you like to go \"upstairs\" or \"basement\"?");
				choice = keyboard.next();
				if (choice.equals("upstairs")){
					room=2;
				}
				if (choice.equals("basement")){
					room = 3;
				}
			}
			if (room == 2){
				System.out.println("You walk upstairs & end up in a large living room. Would you like to examine the \"bookcase\" or into the \"bedroom\" or \"back\"?");
				choice = keyboard.nextLine();
				if (choice.equals("bookcase")){
					room = 4;
				}
				if (choice.equals("bedroom")){
					room = 5;
				}
				if (choice.equals("back")){
					room = 1;
				}
			}
			if (room == 3){
				System.out.println("You walk downstairs & end up in the basement. Would you like to go to the \"kitchen\" or \"bathroom\" or \"back\"?" );
				choice = keyboard.next();
				if (choice.equals("kitchen")){
					room = 6;
				}
				if (choice.equals("bathroom")){
					room = 7;
				}
				if (choice.equals("back")){
					room = 1;
				}
			}
			if (room == 4){
				System.out.println("You examine the dusty bookcase. Hmm... it's just filled with manga... what a weab. You can only go \"back\".");
				choice = keyboard.next();
				if (choice.equals("back")){
					room = 2;
				}
			}
			if (room == 5){
				System.out.println("You enter the bedroom. What a fluffy bed! You decide to take a quick nap... zzz");
				room = 0;
			}
			else if (room == 6){
				System.out.println("Mmm... smells like porridge! You decide to help yourself to a small bowl...");
				room = -1;
			}
			if (room == 7){
				System.out.println("You enter the bathroom. There sure is alot of hair in the sink... gross. You can only go \"back\".");
				choice = keyboard.next();
				if (choice.equals("back")){
					room = 3;
				}
			}	
		}

			if (room == -1){ 
				System.out.println("WAIT THIS HAS WALNUTS IN IT! YOU'RE ALLERGIC TO WALNUTS!...You have died. Game over.");
			}
			if (room == 0){
				System.out.println("Well that was a nice nap! Time to get out before whoever lives here comes back... You quickly exit and head home.");
			}

	}
}