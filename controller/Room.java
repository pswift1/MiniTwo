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
	
	/** Method: Constructor for the Room class
	 * * Instantiates exits and items ArrayLists
	 * * and gets the current map
	 * */
	public Room() {
		exits = new ArrayList<>();
		items = new ArrayList<>();
		idb = ItemDB.getInstance();
		rdb = RoomDB.getInstance();
	}
	
	/** Method: Constructor for the Room class
	 * * constructs the room object with the given ID 
	 * * @param id - the id to assign to the room */
	public Room(int id) throws GameException{
		this.roomID = id;
	}
	
	/** Method: display
	 * * Builds a String representation of the current room 
	 * * Calls buildItems, buildDescription, and displayExits to build this String
	 * * @return String - the current room display String  */
	public String display() throws GameException {
		return (buildItems() + ",\n" +  displayExits() + ",\n " + buildDescription());
	}
	
	/** Method: buildDescription
	 * * Builds a String of the description
	 * * @return String - the current room description text  */
	private String buildDescription() {
		return this.description;
	}
	
	/** Method: buildItems
	 * * Builds a String of the items in the room
	 * * @return String - the current room items text  */
	private String buildItems() throws GameException{
		if(items == null) {
			throw new GameException("This room has no items");
		}
		return this.items.toString();
	}
	
	/** Method: removeItem
	 * * Removes an item from the room. Removes it and 
	 * * calls updateRoom to save the changes
	 * * @param item - - the Item to remove  */
	public void removeItem(Item item) throws GameException{
		if (!items.contains(item.getItemID())) {
			throw new GameException("That item isn't in this room");
		}
		
		items.remove(Integer.valueOf(item.getItemID()));
		updateRoom();
	}
	
	/** Method: dropItem
	 * * Adds an item to the room. Adds it and 
	 * * calls updateRoom to save the changes
	 * * @param item - - the Item to add  */
	public void dropItem(Item item) throws GameException {
		items.add(item.getItemID());
		updateRoom();
	}
	
	/** Method: updateRoom
	 * *  Calls RoomDB updateRoom(this) to save the current room in the map  */
	public void updateRoom() throws GameException {
		try{
			rdb.updateRoom(this);
		}catch (GameException ge) {
			
		System.out.println("An error occurred");
		}
	}
	
	/** Method: displayExits
	 * * Builds a String of the exits in the room
	 * * @return String - the current room exits text  */
	private String displayExits() {
		return this.exits.toString();
	}
	
	/** Method: retrieveByID
	 * * Retrieves the requested Room from RoomDB. Sets 
	 * * its values into the current Room and returns it
	 * * @param roomNum - ID of the room to retrieve
	 * * @return Room - the requested Room  */
	public Room retrieveByID(int roomNum) throws GameException {
		Room rm = new Room();
		rm = rdb.getRoom(roomNum);
		if (rm == null) {
			throw new GameException("This room can't be found");
		}
		return rm;
	}
	
	/** Method: validDirection
	 * * Determines if the direction entered by the user is 
	 * * valid for this room Throws an exception if this is invalid
	 * * @param cmd - - The direction the user wants to move
	 * * @return int - the ID of the destination room  */
	public int validDirection (char cmd) throws GameException {
		for(Exit ex : exits) {
		    char direction = ex.getDirection().charAt(0);	    
		    if(Character.toUpperCase(direction) == Character.toUpperCase(cmd)) {
			return ex.getDestination();
		    }
		}
		throw new GameException("That exit doesn't exist.");
	}
	
	/** Method: getRoomItems
	 * * This method calls RoomDB to get the items that are in the current room
	 * * @return ArrayList Item - the items in the room  */
	public ArrayList<Item> getRoomItems() throws GameException {
		ArrayList<Item> it = new ArrayList<Item>();
		it = rdb.getItems(this.roomID);
		return it;
	}
	
	/** Method: getRoomID
	 * * getter for roomId
	 * * @return the room ID  */
	public int getRoomID() {
		return this.roomID;
	}
	
	/** Method: setRoomID
	 * * setter for RoomID
	 * * @param roomID - the int to set the RoomID with   */
	public void setRoomID(int roomID) {
		this.roomID =roomID;
	}
	
	/** Method: getName
	 * * getter for room Name
	 * * @return the room name  */
	public String getName() {
		return this.name;
	}
	
	/** Method: setName
	 * * setter for room name
	 * * @param name - the string to set the name with   */
	public void setName(String name) throws GameException{
		if (name.isBlank()) {
			throw new GameException("The name cannot be blank.");
		}
		this.name = name;
	}
	
	/** Method: getDesscription
	 * * getter for room description
	 * * @return the room description  */
	public String getDescription() {
		return this.description;
	}
	
	/** Method: setDescription
	 * * setter for room description
	 * * @param description - the string to set the desc. with   */
	public void setDescription(String description) throws GameException{
		if (description.isBlank()) {
			throw new GameException("The description must be at least one line");
		}
		this.description = description;
	}
	
	/** Method: getExits
	 * * getter for the room Exits
	 * * @return the ArrayList of Exits in the room  */
	public ArrayList<Exit> getExits(){
		return this.exits;
	}
	
	/** Method: setExits
	 * * setter for room Exits
	 * * @param exits - the ArrayList of exits to set for the room  */
	public void setExits(ArrayList<Exit> exits) {
		this.exits = exits;
	}
	
	/** Method: isVisited
	 * * getter for visited
	 * * @return the visited boolean  */
	public boolean isVisited() {
		return this.visited;
	}
	
	/** Method: setVisited
	 * * setter for visited
	 * * @param visited - the boolean if the 
	 * * room has been visited or not */
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	/** Method: getItems
	 * * getter for the item IDs ArrayList
	 * * @return the list of Item ids in the Room  */
	public ArrayList<Integer> getItems() {
		return this.items;
	}
	
	/** Method: setItems
	 * * setter for the ArrayList Integer containing the Item Ids
	 * * @param items - - the ArrayList to be set */
	public void setItems(ArrayList<Integer> items) {
		this.items = items;
	}
	

	@Override
	public String toString() {
		return "Room [roomID=" + roomID + ", name=" + name + ", description=" + description + ", exits=" + exits
				+ ", items=" + items + ", visited=" + visited + ", idb=" + idb + ", getRoomID()=" + getRoomID()
				+ ", getName()=" + getName() + ", getDescription()=" + getDescription() + ", getExits()=" + getExits()
				+ ", isVisited()=" + isVisited() + ", getItems()=" + getItems() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
