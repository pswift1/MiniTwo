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
	
	protected static final List<Character> VALID_DIRECTIONS = null;
	protected static final List<Character> ITEM_COMMANDS = null;
	public static final int EXIT_COMMAND = 0;
	private Player player;
	
	Commands(){
		
	}
	
	private int validateCommand​(String cmdLine) throws GameException{
		return 1;
	}
	protected String executeCommand​(String cmd) throws GameException{
		return null;
	}
	private String move​(String cmdRoom) throws GameException{
		return null;
	}
	private String itemCommand​(String cmd) throws GameException{
		return null;
	}
	private String get​(String cmd, Room room) throws GameException{
		return null;
	}
	private String remove​(String cmd, Room room) throws GameException{
		return null;
	}
	private String lookItem​(String cmd, Room room) throws GameException{
		return null;
	}

}
