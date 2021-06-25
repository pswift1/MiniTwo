/**Class: Player.java  
* @author Peter Swift   
* @version 1.0    
* Course: ITEC 3860 Summer 2021   
* Written: June 21, 2021   
*    
* This class – defines the player's inventory and location, and allows interaction with items
*/
package controller;
import java.util.*;
public class Player {
	
	private ArrayList<Item> inventory;
	private int curRoom;
	
	/** Method: Constructor for the GameController class
	 * * Instantiates the Commands object for the game 
	 * */
	protected Player() {
		 
		inventory = new ArrayList<>();
		 curRoom = 1;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	protected void addItem​(Item it) {
		inventory.add(it);
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	protected void removeItem​(Item it) {
		inventory.remove(it);
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	protected String printInventory() {
		return null;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public int getCurRoom() {
		return curRoom;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public void setCurRoom​(int current) {
		curRoom = current;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	protected ArrayList<Item> getInventory(){
		return inventory;
	}
	

}
