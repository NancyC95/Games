import java.util.Scanner;

public class NimFancierDisplay {
	public static void main(String[] args){
		int numa, numb, numc, remove;
		numa = 3;
		numb = 4;
		numc = 5;
		String pile, play1, play2, winner = "", player = "";
		String display = "*";
		String totaldisplay;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Player 1, enter your name: ");
		play1 = keyboard.next();
		System.out.println("Player 2, enter your name: ");
		play2 = keyboard.next();
		
		player = play1;
		while(numa != 0 || numb != 0 || numc != 0){
			if (player == play1){
				for (int x = 1; x <= 5 ; x++){
					if (x == 1){
						if (numa >= 5){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numb >= 5){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numc >= 5){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
					}
					if (x == 2){
						if (numa >= 4){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numb >= 4){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numc >= 4){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
					}
					if (x ==3){
						if (numa >= 3){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numb >= 3){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numc >= 3){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
					}
					if (x ==4){
						if (numa >= 2){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numb >= 2){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numc >= 2){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
					}
					if (x==5){
						if (numa >= 1){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numb >= 1){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numc >= 1){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
					}	
					System.out.println("");	
				}
				System.out.println("ABC");
		
				System.out.println(play1 + ", choose a pile: ");
				pile = keyboard.next();
				System.out.println("How many would you like to remove from " + pile);
				remove = keyboard.nextInt();
				if (player == play1 && pile.equals("A")){
					if (numa > 0 && numa >= remove && remove > 0){
						numa = numa - remove;
						player = play2;
					}
					else if (numa == 0){
						System.out.println("This pile is empty! Choose another pile: ");
						pile = keyboard.next();
					}
					else if (pile.equals("A") && (numa < remove || remove <= 0)){
						while (numa < remove || remove <= 0){
							while (numa < remove){
								System.out.println("There's not even that many in the pile. How many to remove? : ");
								remove = keyboard.nextInt();
							}
							while (remove <=0){
								System.out.println("Must remove at least 1. How many to remove?: ");
								remove = keyboard.nextInt();
							}
						}
						numa = numa - remove;
						player = play2;
					}
				}
				if (player == play1 && pile.equals("B")){
					if (numb > 0 && numb >= remove && remove > 0){
						numb = numb - remove;
						player = play2;
					}
					else if (numb == 0){
						System.out.println("This pile is empty! Choose another pile: ");
						pile = keyboard.next();
					}
					else if (pile.equals("B") && (numb < remove || remove <= 0)){
						while (numb<remove || remove <= 0){
							while (numb < remove){
								System.out.println("There's not even that many in the pile. How many to remove? : ");
								remove = keyboard.nextInt();
							}
							while (remove <=0){
								System.out.println("Must remove at least 1. How many to remove?: ");
								remove = keyboard.nextInt();
							}
						}
						numb = numb - remove;
						player = play2;
					}
				}
				if (player == play1 && pile.equals("C")){
					if (numc > 0 && numc >= remove && remove > 0){
						numc = numc - remove;
						player = play2;
					}
					else if (numc == 0){
						System.out.println("This pile is empty! Choose another pile: ");
						pile = keyboard.next();
					}
					else if (pile.equals("C") && (numc < remove || remove <= 0)){
						while (numc<remove || remove <= 0){
							while (numc < remove){
								System.out.println("There's not even that many in the pile. How many to remove? : ");
								remove = keyboard.nextInt();
							}
							while (remove <=0){
								System.out.println("Must remove at least 1. How many to remove?: ");
								remove = keyboard.nextInt();
							}
						}
						numc = numc - remove;
						player = play2;
					}
				}
			}
			if ((numa + numb + numc)== 1){
				winner = play1;
				System.out.println(play2 + ", look like there's only one counter left! You lose! " + play1 + " wins!");
			}
			if (numa == 0 && numb == 0 && numc == 0){
				winner = play2;		
			}
			//Player 2's turn! 
			if (player == play2 && (numa != 0 || numb != 0 || numc != 0)){
				for (int x = 1; x <= 5 ; x++){
					if (x == 1){
						if (numa >= 5){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numb >= 5){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numc >= 5){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
					}
					if (x == 2){
						if (numa >= 4){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numb >= 4){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numc >= 4){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
					}
					if (x ==3){
						if (numa >= 3){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numb >= 3){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numc >= 3){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
					}
					if (x ==4){
						if (numa >= 2){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numb >= 2){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numc >= 2){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
					}
					if (x==5){
						if (numa >= 1){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numb >= 1){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
						if (numc >= 1){
							System.out.print("*");
						}
						else{
							System.out.print(" ");
						}
					}	
					System.out.println("");	
				}
				System.out.println("ABC");
				
				System.out.println(play2 + ", choose a pile: ");
				pile = keyboard.next();
				System.out.println("How many would you like to remove from " + pile);
				remove = keyboard.nextInt();
				if (pile.equals("A")){
					if (numa > 0 && numa >= remove && remove > 0){
						numa = numa - remove;
						player = play1;
					}
					else if (numa == 0){
						System.out.println("This pile is empty! Choose another pile: ");
						pile = keyboard.next();
					}
					else if (pile.equals("A") && (numa < remove || remove <= 0)){
						while (numa < remove || remove <= 0){
							while (numa < remove){
								System.out.println("There's not even that many in the pile. How many to remove? : ");
								remove = keyboard.nextInt();
							}
							while (remove <=0){
								System.out.println("Must remove at least 1. How many to remove?: ");
								remove = keyboard.nextInt();
							}
						}
						numa = numa - remove;
						player = play1;
					}
				}
				if ( pile.equals("B")){
					if (numb > 0 && numb >= remove && remove > 0){
						numb = numb - remove;
						player = play1;
					}
					else if (numb == 0){
						System.out.println("This pile is empty! Choose another pile: ");
						pile = keyboard.next();
					}
					else if (pile.equals("B") && (numb < remove || remove <= 0)){
						while (numb<remove || remove <= 0){
							while (numb < remove){
								System.out.println("There's not even that many in the pile. How many to remove? : ");
								remove = keyboard.nextInt();
							}
							while (remove <=0){
								System.out.println("Must remove at least 1. How many to remove?: ");
								remove = keyboard.nextInt();
							}
						}
						numb = numb - remove;
						player = play1;
					}
				}
				if (pile.equals("C")){
					if (numc > 0 && numc >= remove && remove > 0){
						numc = numc - remove;
						player = play1;
					}
					else if (numc == 0){
						System.out.println("This pile is empty! Choose another pile: ");
						pile = keyboard.next();
					}
					else if (pile.equals("C") && (numc < remove || remove <= 0)){
						while (numc<remove || remove <= 0){
							while (numc < remove){
								System.out.println("There's not even that many in the pile. How many to remove? : ");
								remove = keyboard.nextInt();
							}
							while (remove <=0){
								System.out.println("Must remove at least 1. How many to remove?: ");
								remove = keyboard.nextInt();
							}
						}
						numc = numc - remove;
						player = play1;
					}
				}
				if ((numa + numb + numc)== 1){
					winner = play2;
					System.out.println(play1 + ", look like there's only one counter left! You lose! " + play2 + " wins!");
				}
				if (numa == 0 && numb == 0 && numc == 0){
					winner = play1;		
				}
		}
	}
		System.out.println("A: " + numa + " B: " + numb + " C: " + numc);
		System.out.println(winner + ", you are the winner!");
	
	}
}
