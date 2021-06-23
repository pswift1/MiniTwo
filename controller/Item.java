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
	
	public Item() {
		
	}
	
	public int getItemID() {
		return itemID;
	}
	public void setItemID​(int itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName​(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription​(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String display() {
		return itemDescription.toString();
	}

	@Override
	public String toString() {
		return "Item [itemDescription=" + itemDescription + ", itemID=" + itemID + ", itemName=" + itemName
				+ ", getItemID()=" + getItemID() + ", getItemName()=" + getItemName() + ", getItemDescription()="
				+ getItemDescription() + ", display()=" + display() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
