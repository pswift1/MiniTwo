package controller;
import java.util.*;

import gameExceptions.GameException;
import model.ItemDB;


public class Room {
	
	private int roomID;
	private String name;
	private String description;
	private ArrayList<Exit> exits;
	private ArrayList<Integer> items;
	private boolean visited;
	private ItemDB idb;
	
	public Room() {
		// should initialize exits and items ArrayLists
	}
	
	public Room(int id) throws GameException{
		
	}
	
	public String display() throws GameException {
		return this.name;
	}
	
	private String buildDescription() {
		return this.description;
	}
	private String buildItems() throws GameException{
		return items.toString();
	}
	public void removeItem(Item item) throws GameException{
		//remove item and calls UpdateRoom to save the changes
	}
	public void dropItem(Item item) throws GameException {
		//remove item from inventory and updateRoom
	}
	public void updateRoom() throws GameException {
		
	}
	private String displayExits() {
		return exits.toString();
	}
	public Room retrieveByID(int roomNum) throws GameException {
		return this;
	}
	public int validDirection (char cmd) throws GameException {
		return roomID;
	}
	public ArrayList<Item> getRoomItems() throws GameException {
		return new ArrayList<Item>();
	}
	public int getRoomID() {
		return roomID;
	}
	public void setRoomID(int roomID) {
		this.roomID =roomID;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) throws GameException{
		this.name = name;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) throws GameException{
		this.description = description;
	}
	public ArrayList<Exit> getExits(){
		return this.exits;
	}
	public void setExits(ArrayList<Exit> exits) {
		this.exits =exits;
	}
	public boolean isVisited() {
		return false;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public ArrayList<Integer> getItems() {
		return this.items;
	}
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
