import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
public class ChooseAnAdventure {
	public static void main(String[] args)throws IOException {
		String choiceM, choiceK, choiceC, choiceF, choiceU, choiceBath, choiceBed;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to Nancy's Mini Horror Adventure :)");
		System.out.println("You enter an old mansion at the end of your block, looking for that stray cat you've been feeding for the past week. \nWould you like to walk into the \"kitchen\" or head \"upstairs\"?");
		choiceM = keyboard.next();
		
		if (choiceM.equals("kitchen")){
			System.out.println("You see a dusty countertop and some rusty pots and pans sitting on an old stove. \nTo the left, you see one cabinet with its handle still attached. To the right you see an old refrigerator. \nWould you like to open the \"cabinet\" or the \"refrigerator\"?");
			choiceK = keyboard.next();
			if (choiceK.equals("cabinet")){
				System.out.println("Bleh, now your hands all dusty! \nInside the cabinet, the only things of interest to you is an envelope and something shiny in the back that catches your eye. \nDo you grab the \"envelope\" or \"rummage\" for that mysterious item?");
				choiceC = keyboard.next();
				if (choiceC.equals("envelope")){
					System.out.println("You carefully open the envelope. \nInside are a bunch of old photographs of the family that probably used to live here. \nAs you continue flipping, you realize that with each passing photo, the room was getting colder and colder. \nYou quickly stop flipping, put down the photos, and bolt out of the house.");
				}
				if (choiceC.equals("rummage")){
					System.out.println("You begin to rummage through the cabinet. \nJust when you're about to reach the item, you startle a spider living inside the cabinet. \nIt bites you and go into anaphylactic shock due to its venom...");
				}
			}
			if (choiceK.equals("refrigerator")){
				System.out.println("Ugh that smell is awful! \nDo you \"close\" the fridge or check the \"freezer\"?");
				choiceF = keyboard.next();
				if (choiceF.equals("close")){
					System.out.println("Phew! Now you totally reek! \nYou decide to go home and take a shower and maybe look for that cat another day...");
				}
				if (choiceF.equals("freezer")){
					System.out.println("Really? You thought the cat would be HERE?");
				}
			}
		}
		if (choiceM.equals("upstairs")){
			System.out.println("There are two doors. \nOne leads to the \"bathroom\" and the other to a \"bedroom\". Which one do you choose?");
			choiceU = keyboard.next();
			if (choiceU.equals("bathroom")){
				System.out.println("You're met with stale air as you step into the bathroom. \nDo you examine the \"mirror\" or pull back the \"shower\" curtains?");
				choiceBath = keyboard.next();
				if (choiceBath.equals("mirror")){
					System.out.println("You approach the mirror. \nAs you lean closer to carefully examine it, it shatters in your face! \nYou scream in pain and run out of the bathroom, only to trip down the stairs and break your neck...");
				}
				if (choiceBath.equals("shower")){
					System.out.println("The moment you pull back the curtains, a small, dark figure jumps out at you! \nIt's the cat! Hooray!");
					String path = "/D:/Java Workspace/Fun/Pics/PICSPLS/acat2.jpg"; 
			        File file = new File(path);
			        BufferedImage image = ImageIO.read(file);
			        
			        JLabel label = new JLabel(new ImageIcon(image));
			        JFrame f = new JFrame();
			        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			        f.getContentPane().add(label);
			        f.pack();
			        f.setLocation(200,200); 
			        f.setSize(550,400);
			        f.setVisible(true); 
				}
			}
			if (choiceU.equals("bedroom")){
				System.out.println("You use a flashlight since the room is completely dark. \nThe only two places a cat could be hiding here is the \"closet\" or under the \"bed\". Which do you check?");
				choiceBed = keyboard.next();
				if (choiceBed.equals("closet")){
					System.out.println("You open the closet door... and see nothing but old clothes. \nRight when you're about to close it, something pushes you in and locks the door! \n You kick the door and scream for help for hours... does anyone even know you're here?");
				}
				if (choiceBed.equals("bed")){
					System.out.println("You decide it's too dirty down there for you to want to crawl in... \nSo you simply decide to feel around instead. \nRight when you're about to withdraw your hand, something grabs you and pulls you under as you scream for help and claw at the floorboards...");
				}
			}
		}
	}
}


