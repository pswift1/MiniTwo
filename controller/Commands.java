/**Class: Commands.java   
* @author Peter Swift   
* @version 1.0    
* Course: ITEC 3860 Summer 2021   
* Written: June 21, 2021   
*    
* This class – this class interprets and executes the commands
*/
package controller;
import java.util.*;

import gameExceptions.GameException;

public class Commands {
	
	protected static final List<Character> VALID_DIRECTIONS = Arrays.asList('N', 'S', 'E', 'W', 'U', 'D');
	protected static final List<Character> ITEM_COMMANDS = Arrays.asList('I', 'G', 'R');
	public static final int EXIT_COMMAND = 0;
	private Player player;
	
	/** Method:  Constructor for the Commands class 
	 * * Instantiates a new player object for tracking inventory in the game 
	 * */
	Commands(){
		player = new Player();
	}
	
	/** Method: validateCommand
	 * * Returns an int that tells what type of command. 1 for item 
	 * * commands (G, R, I) 2 for movement (N, S, E, W, U, D) 3 for 
	 * * Look (L) 4 for Backpack (B) EXIT_COMMAND for exit (X) 
	 * * Throws an exception for an invalid command
	 * * @param cmdLine - String containing the command entered by the user
	 * * @return int - the integer for the command received  */
	private int validateCommand​(String cmdLine) throws GameException{
		return 1;
	}
	
	/** Method: executeCommand
	 * * returns the String to be displayed to the user based on the user's 
	 * * command Calls the correct command method or returns the String 
	 * * for the command entered. throws an exception for an invalid command
	 * * @param cmd - String that contains the command entered by the user
	 * * @return String - the response to the command  */
	protected String executeCommand​(String cmd) throws GameException{
		return null;
	}
	
	/** Method: move
	 * * returns the String for the new Room the user is entering 
	 * * Calls Room validDirection to ensure that the direction is valid 
	 * * for this room. If the direction is valid, Updates the room to be
	 * * visited by updating the room Updates the current Room in student.student.view.Adventure
	 * * If the direction is not valid, throws an exception for an invalid direction
	 * * @param cmdRoom - String that contains the command entered by the user
	 * * @return String - the new room the user is moving to  */
	private String move​(String cmdRoom) throws GameException{
		return null;
	}
	
	/** Method: itemCommand
	 * * returns the String for the Item based on the user's command 
	 * * Calls different methods to handle the Item interactions throws 
	 * * an exception for an invalid command or action, For example,
	 * * item not in the room and the user tries to pick it up
	 * * @param cmd - String that contains the command entered by the user
	 * * @return the response to the user's command  */
	private String itemCommand​(String cmd) throws GameException{
		return null;
	}
	
	/** Method: get
	 * * returns the String for the item to be added to the Player's inventory 
	 * * Updates the room to remove the item from the room Updates Player to 
	 * * add item to the backpack throws an exception if the item is not in the room
	 * * @param cmd - String that contains the command entered by the user
	 * * @param room - the room the item is being removed from
	 * * @return String - item has been added to inventory  */
	private String get​(String cmd, Room room) throws GameException{
		return null;
	}
	
	/** Method: remove
	 * * returns the String for dropping the item Updates the room to add the item to the room 
	 * * Updates the Player by removing the item from the backpack throws an exception for if Item is not in the inventory
	 * * @param cmd - String that contains the command entered by the user
	 * * @param room - the current Room from student.student.view.Adventure
	 * * @return String - the Item has been dropped  */
	private String remove​(String cmd, Room room) throws GameException{
		return null;
	}
	
	/** Method: lookItem
	 * * returns the String of the item or an "I don't see " the item message
	 * * @param cmd - String that contains the command entered by the user 
	 * * @param room - the current Room from student.student.view.Adventure
	 * * @return String - the String for the look command  */
	private String lookItem​(String cmd, Room room) throws GameException{
		return null;
	}

}
