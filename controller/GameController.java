/**Class: GameController.java  
* @author Peter Swift   
* @version 1.0    
* Course: ITEC 3860 Summer 2021   
* Written: June 21, 2021   
*    
* This class – This class executes the commands, I think. Initiates the game? 
*/
package controller;
import java.util.*;

import gameExceptions.GameException;

public class GameController {
	
	private Commands commands;
	public static final int FIRST_ROOM = 1;
	
	/** Method: Constructor for the GameController class
	 * * Instantiates the Commands object for the game 
	 * */
	public GameController(Commands commands) {
		super();
		this.commands = commands;
	}
	
	/** Method: displayFirstRoom
	 * * Retrieves the Dring for the first room
	 * * @return the first room display String  */
	public String displayFirstRoom() throws GameException{
		return null;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public String executeCommand​(String cmd) throws GameException{
		return null;
	}
	
	/** Method: printMap
	 * * Handles the print map command from Adventure Calls map 
	 * * to get a String representation of the current map
	 * * @return to get a String representation of the current map  */
	public String printMap() throws GameException{
		return RoomDB.getInstance().getMap();;
	}
	

}
