/**Class: Adventure.java   
* @author Peter Swift   
* @version 1.0    
* Course: ITEC 3860 Summer 2021   
* Written: June 21, 2021   
*    
* This class – actually plays the game. This is the main method that will build and run the game
*/
package view;
import java.io.FileNotFoundException;
import java.util.*;
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
		
		gc = new GameController(null);
		
	}
	
	
	/** Method: getCommand
	 * Prompts the user for their input and returns this to playGame
	 * * Note: This algorithm is from Press et al., Numerical Recipes
	 * * in C, 2nd ed., Cambridge University Press, 1992
	 * * @param day day of the date to be converted
	 * * @param month month of the date to be converted
	 * * @param year year of the date to be converted
	 * * @return the Julian day number that begins at noon of the* given calendar date.  */
	private String getCommand() {
		
		System.out.println("What will you do?");
		String command = input.nextLine();
			
		return command;
	}
	/** Method: playGame
	 * Convert calendar date into Julian day.
	 * * Note: This algorithm is from Press et al., Numerical Recipes
	 * * in C, 2nd ed., Cambridge University Press, 1992
	 * * @param day day of the date to be converted
	 * * @param month month of the date to be converted
	 * * @param year year of the date to be converted
	 * * @return the Julian day number that begins at noon of the* given calendar date.  */
	private void playGame() {
		
		System.out.println(" **Welcome to MiniGame 2, please read the instructions carefully.**");
		System.out.println(" **Navigate with cardinal directions North, South, East, West, Up, and Down**");
		System.out.println(" **You can also abbreviate and just type the first letter (N, S, E, W, U, D)** ");
		System.out.println(" **Type x at any time to quit**");
		System.out.println(" **Thank you for playing!**\n");
		    
		    //Load the first room
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
			
			if(cmdChar == 'X') {
			    System.out.println("Exiting game.");
			    loop = false;
			    break;
			}
			else if(cmdChar == 'N' || cmdChar == 'S' ||
				cmdChar == 'E' || cmdChar == 'W' ||
				cmdChar == 'U' || cmdChar == 'D' ||
				cmdChar == 'I' || cmdChar == 'G' ||
				cmdChar == 'L' || cmdChar == 'B' || cmdChar == 'R') {
			
				System.out.println(gc.executeCommand​(cmd));
				loop = true;
		     }
		     else {
			 System.out.println("That's not a right command. Try again.");
			 loop = true;
		     }
			
		    } catch (GameException e) {
			
			System.out.println(e.getMessage());
		    }
		    }while(loop);
		
	}
	/** Method: main
	 * * This is the main method that processes the actual game
	 * * Note: This algorithm is from Press et al., Numerical Recipes
	 * * in C, 2nd ed., Cambridge University Press, 1992
	 * * @param day day of the date to be converted
	 * * @param month month of the date to be converted
	 * * @param year year of the date to be converted
	 * * @return the Julian day number that begins at noon of the* given calendar date.  */
	static void main(String[] args) {
		
		Adventure adv = new Adventure();
		adv.input = new Scanner(System.in);
				
		//Import Rooms and Items from text files
		try {
		    RoomDB.getInstance().readRooms();
		    ItemDB.getInstance().readItems();
		   
		    /**
		     * Load items into predetermined rooms
		     * This is not a good way to load items by hard-coding
		     * But this is the only way I can come up at the moment
		     * Please let me know a better way to do this
		     */
		   
		    Item item1 = ItemDB.getInstance().getItem​(1);
		    Item item2 = ItemDB.getInstance().getItem​(2);
		    Item item3 = ItemDB.getInstance().getItem​(3);
		    
		    Room room = new Room();
		    room.retrieveByID(3).dropItem(item1);
		    room.retrieveByID(4).dropItem(item2);
		    room.retrieveByID(6).dropItem(item3);
		   		    
		} catch (GameException e) {
		   
		    System.out.println(e.getMessage());
		} 
		
		
		/**GameController gc = new GameController();
		try {
		    System.out.println(gc.printMap());
		} catch (GameException e) {
		    
		    e.printStackTrace();
		}**/
		
		adv.playGame();
		
		
		
		adv.input.close();
		
	}

}
