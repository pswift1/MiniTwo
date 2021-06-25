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
	
	/** Method:ItemDB Constructor
	 ** Private constructor to implement the singleton*/
	private ItemDB() {
		items = new ArrayList<>();
		
	}
	
	/** Method: getInstance
	 * * Implements the Singleton pattern for our instance. 
	 * * If instance is null, the private constructor is called.
	 * * If it is not, it simply returns the instance
	 * * @return the instance in the class.  */
	public static ItemDB getInstance() {
		if (instance == null){
            instance = new ItemDB();
        }
		return instance;
	}
	
	
	/** Method: getItem
	 * Prompts the user for the number of an item they wish to get.
	 * * @param id - the ID number of the item you are trying to retrieve
	 * * @return the item with the ID number that has been input.  */
	public Item getItem​(int id) throws GameException{
		for (Item it: items) {
			if (it.getItemID() == id) {
				return it;
			}
		}
		throw new GameException("This item is not found");
	}
	
	
	/** Method: readItems
	 * * Reads the item text file and writes it to the program
	 * * Note: Does not used fixed file paths, must place in 
	 * * folder that holds the project. "Items.txt" should 
	 * * be the  name of the file.
	 * * File format must be in this order: Line 1 - Item number
	 * * Line 2 - Item Name, Line 3 - Item Description or the reader
	 * * won't properly read the format.  */
	public void readItems() throws GameException{
		
		File itemTxt = new File("Items.txt");
		
		try (Scanner scan = new Scanner(itemTxt)){
			
		int i = 0;
		int itemNum;
		String itemName;
		String itemDesc;
		
		
		while (scan.hasNextLine()) {
			itemNum = Integer.parseInt(scan.nextLine());
			itemName = scan.nextLine();
			itemDesc = scan.nextLine();
			
			Item newItem = new Item();
			newItem.setItemID​(itemNum);
			newItem.setItemName​(itemName);
			newItem.setItemDescription​(itemDesc);
			items.add(newItem);
			i++;
		}
		
		// this has to find and read the items from the text
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}

} 
}
