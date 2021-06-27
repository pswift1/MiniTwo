/**Class: Adventure.java   
* @author Peter Swift 
* I would like to acknowledge the contributions of 
* Oleg Bazylnikov and DC Nguyen. I was able to collaborate with DC
* to make some of this possible, but Oleg took time to tutor me to fix
* errors in several methods that were cascading into one another.  
* @version 1.0    
* Course: ITEC 3860 Summer 2021   
* Written: June 21, 2021   
*    
* This class – actually plays the game. This is the main method that will build and run the game
*/
package view;
import java.io.FileNotFoundException;
import java.util.*;

import controller.Commands;
import controller.GameController;
import controller.Item;
import controller.Room;
import gameExceptions.GameException;
import model.ItemDB;
import model.RoomDB;
public class Adventure {
	
	private GameController gc;
	private Scanner input;
	
	
	/** Method: Adventure Constructor
	 * * Creates an instance of the GameController class
	 * * 
	 */
	public Adventure() {
		
		gc = new GameController(new Commands());
		
	}
	
	
	/** Method: getCommand
	 * Prompts the user for their input and returns this to playGame
	 * * @return String - the command that you wish to pass to playGame()  */
	private String getCommand() {
		
		System.out.println("What will you do?");
		String command = input.nextLine();
			
		return command;
	}
	/** Method: playGame
	 * * This method runs most of the logic of the game,
	 * * but requires the main method to create the instance of it
	 * * this method is what interacts with commands.  */
	private void playGame() {
		
		System.out.println(" **Welcome to MiniGame 2, please read the instructions carefully.**");
		System.out.println(" **Navigate with cardinal directions North, South, East, West, Up, and Down**");
		System.out.println(" **You can also abbreviate and just type the first letter (N, S, E, W, U, D)** ");
		System.out.println(" **Type G (get), I (inspect), R (remove) to interact with items.**");
		System.out.println(" **Type L (look) or B (backpack) to access these functions**");
		System.out.println(" **Type x or exit at any time to quit**");
		System.out.println(" **Thank you for playing!**");
		    
		    
		    try {
			System.out.println(gc.displayFirstRoom());
		    } catch (GameException ge) {
			System.out.println(ge.getMessage());
		    }
		   
		    boolean loop = true;
		    do {
		     try {
			 		
			String cmd = getCommand();
			char cmdChar = cmd.toUpperCase().charAt(0);
			
			if(cmdChar == 'X' || cmd.equalsIgnoreCase("exit")) {
			    System.out.println("Exiting game.");
			    loop = false;
			    break;
			}
			else if(cmdChar == 'N' || cmdChar == 'S' || cmdChar == 'E' || cmdChar == 'W' ||
				cmdChar == 'U' || cmdChar == 'D' || cmdChar == 'I' || cmdChar == 'G' ||
				cmdChar == 'L' || cmdChar == 'B' || cmdChar == 'R') {
			
				System.out.println(gc.executeCommand​(cmd));
				loop = true;
		     }
		     else {
			 System.out.println("This command is invalid. Try again.");
			 loop = true;
		     }
			
		    } catch (GameException e) {
			
			System.out.println(e.getMessage());
		    }
		    }while(loop);
		
	}
	/** Method: main
	 * * This is the main method that processes the actual game
	 * * */
	public static void main(String[] args) {
		
		Adventure adv = new Adventure();
		adv.input = new Scanner(System.in);
				
		
		try {
		    RoomDB.getInstance().readRooms();
		    ItemDB.getInstance().readItems();
		   
		 
		   
		    Item item1 = ItemDB.getInstance().getItem​(1);
		    Item item2 = ItemDB.getInstance().getItem​(2);
		    Item item3 = ItemDB.getInstance().getItem​(3);
		    
		    Room room = new Room();
		    room.retrieveByID(1).dropItem(item1);
		    room.retrieveByID(3).dropItem(item2);
		    room.retrieveByID(5).dropItem(item3);
		   		    
		} catch (GameException e) {
		   
		    System.out.println(e.getMessage());
		} 
		
		adv.playGame();
		adv.input.close();
		
	}

}
