/**Class: Item.java    
* @author Peter Swift   
* @version 1.0    
* Course: ITEC 3860 Summer 2021   
* Written: June 21, 2021   
*    
* This class – defines what an Item object is for the game
*/
package controller;
import java.util.*;

public class Item {
	
	private String itemDescription;
	private int itemID;
	private String itemName;
	
	/** Method: Constructor for the GameController class
	 * * Instantiates the Commands object for the game 
	 * */
	public Item() {
		
	}
	
	/** Method: getItemID
	 * * getter for ItemID 
	 * * @return the item ID  */
	public int getItemID() {
		return itemID;
	}
	
	/** Method: setItemID
	 * * setter for ItemID
	 * * @param itemID - the ID of the item to be set*/
	public void setItemID​(int itemID) {
		this.itemID = itemID;
	}
	
	/** Method: getItemName
	 * * getter for the ItemName
	 * * @return the itemName  */
	public String getItemName() {
		return itemName;
	}
	
	/** Method: setItemName
	 * * setter for ItemName
	 * * @param itemName - the name of the item to set */
	public void setItemName​(String itemName) {
		this.itemName = itemName;
	}
	
	/** Method: getItemDescription
	 * * getter for ItemDescription
	 * * @return the item description  */
	public String getItemDescription() {
		return itemDescription;
	}
	
	/** Method: setItemDescription
	 * * setter for ItemDescription
	 * * @param itemDescription - description of the item to be set */
	public void setItemDescription​(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	
	/** Method: display
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public String display() {
		return itemDescription.toString();
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */

	@Override
	public String toString() {
		return "Item [itemDescription=" + itemDescription + ", itemID=" + itemID + ", itemName=" + itemName
				+ ", getItemID()=" + getItemID() + ", getItemName()=" + getItemName() + ", getItemDescription()="
				+ getItemDescription() + ", display()=" + display() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
