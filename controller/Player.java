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
	
	protected Player() {
		 
		inventory = new ArrayList<>();
		 curRoom = 1;
	}
	
	protected void addItem​(Item it) {
		inventory.add(it);
	}
	protected void removeItem​(Item it) {
		inventory.remove(it);
	}
	protected String printInventory() {
		return null;
	}
	public int getCurRoom() {
		return curRoom;
	}
	public void setCurRoom​(int current) {
		curRoom = current;
	}
	protected ArrayList<Item> getInventory(){
		return inventory;
	}
	

}
