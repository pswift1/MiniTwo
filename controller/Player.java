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
	
	/** Method: Constructor for the Player class
	 * * Instantiates the inventory ArrayList and sets 
	 * * the current room to 1 (the starting room)
	 * */
	protected Player() {
		 
		inventory = new ArrayList<>();
		 curRoom = 1;
	}
	
	/** Method: addItem
	 * * Adds an item to the player's inventory
	 * * @param it - - the Item to add to the inventory */
	protected void addItem​(Item it) {
		inventory.add(it);
	}
	
	/** Method: removeItem
	 * * Removes an item from the player's inventory
	 * * @param it - the item to be removed from the inventory */
	protected void removeItem​(Item it) {
		inventory.remove(it);
	}
	
	/** Method: printInventory
	 * * Returns the String of all items in the player's inventory
	 * * @return String - the String of the player's inventory  */
	protected String printInventory() {
		return null;
	}
	
	/** Method: getCurRoom
	 * * getter for the ID of the room the Player is currently in
	 * * @return the id of the current room  */
	public int getCurRoom() {
		return curRoom;
	}
	
	/** Method: setCurRoom
	 * * setter for the ID of the room the Player is currently in
	 * * @param current - the id of the current room  */
	public void setCurRoom​(int current) {
		curRoom = current;
	}
	
	/** Method: getInventory
	 * * gets the Item ArrayList the makes up the player's inventory
	 * * @return the ArrayList of the current Items in the player's inventory  */
	protected ArrayList<Item> getInventory(){
		return inventory;
	}
	

}
