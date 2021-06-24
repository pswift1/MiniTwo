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
	
	public GameController(Commands commands) {
		super();
		this.commands = commands;
	}
	
	public String displayFirstRoom() throws GameException{
		return null;
	}
	public String executeCommand​(String cmd) throws GameException{
		return null;
	}
	public String printMap() throws GameException{
		return RoomDB.getInstance().getMap();;
	}
	

}
