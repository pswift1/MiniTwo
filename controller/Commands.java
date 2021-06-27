/**Class: Commands.java   
* @author Peter Swift   
* @version 1.0    
* Course: ITEC 3860 Summer 2021   
* Written: June 21, 2021   
*    
* This class interprets and executes the commands
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
	public Commands(){
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
		int returnCommand = 0;
		char cmdChar = cmdLine.toUpperCase().charAt(0);
		
		
		if( cmdChar == 'I' || cmdChar == 'G' || cmdChar == 'R') {
			  
			returnCommand = 1;
		}
		else if(cmdChar == 'N' || cmdChar == 'S' ||
			cmdChar == 'E' || cmdChar == 'W' ||
			cmdChar == 'U' || cmdChar == 'D') {
		    
			returnCommand = 2;
		}
		else if(cmdChar == 'L' )  {
			    
			returnCommand = 3;
		}
		else if(cmdChar == 'B' || cmdLine.equalsIgnoreCase("backpack"))  {
				    
			returnCommand = 4;
		}
		else if(cmdChar == 'X' || cmdLine.equalsIgnoreCase("exit"))  {
				    
			returnCommand = EXIT_COMMAND;
		}
		
		else {
		    System.out.println("Acceptable Item Commands: I (inspect), G (get), R (remove)");
		    System.out.println("Acceptable Item Commands: N (North), S (South), E (East), W (West), U (Up), D (Down)");
		    System.out.println("Other Acceptable Commands: L (look), B (backpack), X (exit game)");
		    throw new GameException("\nInvalid command. Please use only the above.");
		}
		return returnCommand;
	}
	
	/** Method: executeCommand
	 * * returns the String to be displayed to the user based on the user's 
	 * * command Calls the correct command method or returns the String 
	 * * for the command entered. throws an exception for an invalid command
	 * * @param cmd - String that contains the command entered by the user
	 * * @return String - the response to the command  */
	protected String executeCommand​(String cmd) throws GameException{
		
		String output = null;
		int validated = validateCommand​(cmd);
		
		if (validated == 1 || validated == 4) {
			output = itemCommand​(cmd);
		}else if (validated == 2) {
			output = move​(cmd);
		}else if (validated == 3) {
			output = player.printInventory();
		}else if (validated == 0) {
			output = "Exiting game.";
		}else {
			output = "Please input a valid command.";
		}
			
		return output;
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
		String nextRoom = null;
		
		char first = cmdRoom.toUpperCase().charAt(0);
		int curRoomNo = player.getCurRoom();
			
		Room roomObj = new Room().retrieveByID(curRoomNo);
			
		int nextRmNo = roomObj.validDirection(first); 
			
		    roomObj.setVisited(true);
		    roomObj.updateRoom();
		    nextRoom = new Room().retrieveByID(nextRmNo).toString();
		    player.setCurRoom​(nextRmNo);
			
		return nextRoom;
	}
	
	/** Method: itemCommand
	 * * returns the String for the Item based on the user's command 
	 * * Calls different methods to handle the Item interactions throws 
	 * * an exception for an invalid command or action, For example,
	 * * item not in the room and the user tries to pick it up
	 * * @param cmd - String that contains the command entered by the user
	 * * @return the response to the user's command  */
	private String itemCommand​(String cmd) throws GameException{
		String output = null;
		
		int roomNum = player.getCurRoom();
		Room thisRoom = new Room().retrieveByID(roomNum);
		
		char commandChar = cmd.toUpperCase().charAt(0);
		
		if(commandChar == 'L') {
		    output = thisRoom.display();
		}
		else {
		
		    String[] temp = cmd.split(" ");
		
		    if(temp.length < 2) {
			throw new GameException("You must include the item");
		    }	
		}
		
			
		if(commandChar == 'G') {
		    output = get​(cmd, thisRoom);
		}
		else if(commandChar == 'R') {
		    output = remove​(cmd, thisRoom);
		}
		else if(commandChar == 'I') {
		   output = lookItem​(cmd, thisRoom);
		}
		
		return output;
	}
	
	/** Method: get
	 * * returns the String for the item to be added to the Player's inventory 
	 * * Updates the room to remove the item from the room Updates Player to 
	 * * add item to the backpack throws an exception if the item is not in the room
	 * * @param cmd - String that contains the command entered by the user
	 * * @param room - the room the item is being removed from
	 * * @return String - item has been added to inventory  */
	private String get​(String cmd, Room room) throws GameException{
		String itemAdded = null;
		
		String[] temp = cmd.split(" ");
		String itemName = temp[1];
				
		ArrayList<Item> roomItems = room.getRoomItems();		
		
		for(Item it : roomItems) {
		    if(it.getItemName().equalsIgnoreCase(itemName)){  
				
			itemAdded = it.toString() + " added to inventory";
			player.addItem​(it);  
			room.removeItem(it); 		
		    }
		    else {
			itemAdded = "This item isn't found here.";
		    }
		}
		
		return itemAdded;
	}
	
	/** Method: remove
	 * * returns the String for dropping the item Updates the room to add the item to the room 
	 * * Updates the Player by removing the item from the backpack throws an exception for if Item is not in the inventory
	 * * @param cmd - String that contains the command entered by the user
	 * * @param room - the current Room from student.student.view.Adventure
	 * * @return String - the Item has been dropped  */
	private String remove​(String cmd, Room room) throws GameException{
		String itemRemoved = null;
		
		String[] temp = cmd.split(" ");
		String itemName = temp[1];
		
		ArrayList<Item> playerInventory = player.getInventory();		
		
		for(Item it : playerInventory) {
		    if(it.getItemName().equalsIgnoreCase(itemName)){  
				
			itemRemoved = it.toString() +" removed from your inventory.";
			player.removeItem​(it);  
			room.dropItem(it); 
		    }
		    else {
			itemRemoved = "You don't have this item.";
				
		    }
		}
		return itemRemoved;  
	}
	
	/** Method: lookItem
	 * * returns the String of the item or an "I don't see " the item message
	 * * @param cmd - String that contains the command entered by the user 
	 * * @param room - the current Room from student.student.view.Adventure
	 * * @return String - the String for the look command  */
	private String lookItem​(String cmd, Room room) throws GameException{
		String look = null;
		
		String[] temp = cmd.split(" ");
		String itemName = temp[1];
			
		ArrayList<Item> roomItems = room.getRoomItems();
		for(Item it : roomItems) {
			
		    if(it.getItemName().equalsIgnoreCase(itemName)){
			look = "Inspecting item - " + itemName + " - " + it.display();
		    }
		    else {
			look = "I don't see " + itemName;
		    }
		} 
		return look;
	}

}
