/**Class: ItemDB.java    
* @author Peter Swift   
* @version 1.0    
* Course: ITEC 3860 Summer 2021   
* Written: June 21, 2021   
*    
* This class – builds an ArrayList out of items
*/
package model;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import ClassExamples.Room;
import controller.Item;
import gameExceptions.GameException;

public class ItemDB {
	
	static ItemDB instance;
	private ArrayList<Item> items;
	
	
	private ItemDB(ArrayList<Item> items) {
		super();
		this.items = items;
	}
	
	
	public static ItemDB getInstance() {
		return instance;
	}
	
	public Item getItem​(int id) throws FileNotFoundException{
		return null;
	}
	
	public void readItems() throws FileNotFoundException{
		
		File itemTxt = new File("Items.txt");
		
		try (Scanner scan = new Scanner(itemTxt)){
			
		int i = 0;
		int itemNum;
		String itemName;
		String itemDesc;
		Item[] itemArray = new Item[3];
		
		while (scan.hasNextLine()) {
			itemNum = Integer.parseInt(scan.nextLine());
			itemName = scan.nextLine();
			itemDesc = scan.nextLine();
			
			Item newItem = new Item();
			newItem.setItemID​(itemNum);
			newItem.setItemName​(itemName);
			newItem.setItemDescription​(itemDesc);
			itemArray[i] = newItem;
			i++;
		}
		
		// this has to find and read the items from the text
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}

} 
}
