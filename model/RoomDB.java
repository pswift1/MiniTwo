/**Class: RoomDB    
* @author Peter Swift   
* @version 1.0    
* Course: ITEC 3860 Summer 2021   
* Written: June 21, 2021   
*    
* This class – builds an ArrayList out of rooms in the game
*/
package model;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import controller.Exit;
import controller.Item;
import controller.Room;
import gameExceptions.GameException;

public class RoomDB {
	
	private static RoomDB instance;
	private ArrayList<Room> rooms;
	
	
	/** Method: RoomDB constructor
	 * * Remains private to implement the Singleton pattern */
	private RoomDB() {
		rooms = new ArrayList<>();
		
	}
	
	/** Method: getInstance
	 * * Implements the Singleton pattern for our instance. 
	 * * If instance is null, the private constructor is called.
	 * * If it is not, it simply returns the instance
	 * * @return the instance in the class.  */
	 public static RoomDB getInstance() {
		 if (instance == null){
	            instance = new RoomDB();
	        }
		 return instance;
	}
	 
	 /** Method: getItems
		 * * Retrieves the Item ArrayList contained in the room that
		 * * is input by the user.
		 * * Throws Exception if roomID not found.
		 * * @param roomID - roomNum of the requested room
		 * * @return the ArrayList of items in the room.  */
	 public ArrayList<Item> getItems(int roomID) throws GameException{
		 ArrayList<Item> it = new ArrayList<Item>();
			for(Room room : rooms) {
			    if(room.getRoomID() == roomID) {
				 for (Integer itemID: room.getItems())
			    	it.add(ItemDB.getInstance().getItem​(itemID));	
			    }
			   
			    }
//			if (it.size() == 0) {
//				throw new GameException("That room is not found.");
//			}
			
			return it;
		 }
	 
	 /** Method: getMap
		 * * Returns the map of the game.
		 * * @return the completed map.  */
	 public String getMap() {
		 String map = rooms.toString();
		    return map; 
	 }
	 
	 /** Method: getRoom
		 * * Prompts the user for the number of the room they wish to get.
		 * * Throws an exception if the room number isn't found.
		 * * @param id - the ID number of the room you are trying to retrieve
		 * * @return the room with the ID number that has been input.  */
	 public Room getRoom(int roomID) throws GameException{
		 for (Room room : rooms) {
			 if (room.getRoomID() == roomID) {
				 return room;
			 }
		 }
		 throw new GameException("This room is not found.");
	 }

	 /** Method: readRooms
		 * * Reads the room text file and writes it to the program
		 * * Note: Does not used fixed file paths, must place in 
		 * * folder that holds the project. "Rooms.txt" should 
		 * * be the  name of the file.
		 * * File format must be in this order: (Line 1 - room number
		 * * Line 2 - room name, Line 3 - Room Description, Line 4 - 
		 * * "----", Line 5 - The exits) or the reader  
		 * * won't properly read the format.  */
	 public void readRooms() throws GameException{
		 File roomTxt = new File("Rooms.txt");
			try (Scanner scan = new Scanner(roomTxt)){
				
			int i = 0;
			int roomNum;
			String roomName;
			String roomDesc;
			
			
			
				while (scan.hasNextLine()) {
					Room newRoom = new Room();
					ArrayList<Exit> roomExits = new ArrayList<>();
					
					newRoom.setRoomID(Integer.parseInt(scan.nextLine()));
					newRoom.setName(scan.nextLine());
					newRoom.setDescription(scan.nextLine());
					String roomDirection;
					
					
					if (scan.nextLine().matches("----")) {
						do {
							
							roomDirection = scan.nextLine();

							if (!roomDirection.matches("----")) {
								Exit newExit = new Exit();

								newExit.buildExit​(roomDirection);
								roomExits.add(newExit);
								
							}

						} while (!roomDirection.matches("----"));
					}

					newRoom.setExits(roomExits);
					rooms.add(newRoom);
					i++;
					
				} 
				
				
			}
			catch (NumberFormatException | FileNotFoundException e) {
				e.printStackTrace();
			}
		 
	 }
	 /** Method: updateRoom
		 * * Updates the room in the current map 
		 * * throws an exception if the room is not found
		 * * @param rm - the Room that is being updated */
	 public void updateRoom(Room rm) throws GameException{
		 
		 if (!rooms.contains(rm)) {
			 throw new GameException ("This room doesn't exist");	 
		 }
		 for(Room room : rooms) {
				if(rm.getRoomID() == room.getRoomID()) {
				    int index = rooms.indexOf(room);
				    rooms.set(index, rm);
				}
		 
		 
	 }

}
}
