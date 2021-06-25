/**Class: Room   
* @author Peter Swift   
* @version 1.0    
* Course: ITEC 3860 Summer 2021   
* Written: June 24, 2021   
*    
* This class – builds an Room object
*/

package controller;
import java.util.*;

import gameExceptions.GameException;
import model.ItemDB;
import model.RoomDB;


public class Room {
	
	private int roomID;
	private String name;
	private String description;
	private ArrayList<Exit> exits;
	private ArrayList<Integer> items;
	private boolean visited;
	private ItemDB idb;
	private RoomDB rdb;
	
	/** Method: Constructor for the GameController class
	 * * Instantiates the Commands object for the game 
	 * */
	public Room() {
		exits = new ArrayList<>();
		items = new ArrayList<>();
	}
	
	/** Method: Constructor for the GameController class
	 * * Instantiates the Commands object for the game 
	 * */
	public Room(int id) throws GameException{
		this.roomID = id;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public String display() throws GameException {
		return this.name;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	private String buildDescription() {
		return this.description;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	private String buildItems() throws GameException{
		return items.toString();
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public void removeItem(Item item) throws GameException{
		//remove item and calls UpdateRoom to save the changes
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public void dropItem(Item item) throws GameException {
		//remove item from inventory and updateRoom
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public void updateRoom() throws GameException {
		
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	private String displayExits() {
		return exits.toString();
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public Room retrieveByID(int roomNum) throws GameException {
		return this;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public int validDirection (char cmd) throws GameException {
		return roomID;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public ArrayList<Item> getRoomItems() throws GameException {
		return new ArrayList<Item>();
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public int getRoomID() {
		return this.roomID;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public void setRoomID(int roomID) {
		this.roomID =roomID;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public String getName() {
		return this.name;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public void setName(String name) throws GameException{
		this.name = name;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public String getDescription() {
		return this.description;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public void setDescription(String description) throws GameException{
		this.description = description;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public ArrayList<Exit> getExits(){
		return this.exits;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public void setExits(ArrayList<Exit> exits) {
		this.exits =exits;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public boolean isVisited() {
		return false;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public ArrayList<Integer> getItems() {
		return this.items;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public void setItems(ArrayList<Integer> items) {
		this.items = items;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */

	@Override
	public String toString() {
		return "Room [roomID=" + roomID + ", name=" + name + ", description=" + description + ", exits=" + exits
				+ ", items=" + items + ", visited=" + visited + ", idb=" + idb + ", getRoomID()=" + getRoomID()
				+ ", getName()=" + getName() + ", getDescription()=" + getDescription() + ", getExits()=" + getExits()
				+ ", isVisited()=" + isVisited() + ", getItems()=" + getItems() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
