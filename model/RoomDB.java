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
import java.util.*;

import controller.Exit;
import controller.Item;
import controller.Room;
import gameExceptions.GameException;

public class RoomDB {
	
	private static RoomDB instance;
	private ArrayList<Room> rooms;
	
	private RoomDB() {
		
	}
	
	
	 public static RoomDB getInstance() {
		 if (instance == null){
	            instance = new RoomDB();
	        }
		 return instance;
	}
	
	 public ArrayList<Item> getItems() {
		return null;
		 }
	 
	 public String getMap() {
		return null; 
	 }
	 
	 public Room getRoom(int roomID) {
		 return null;
	 }
	 
	 public void readRooms() throws GameException{
		 File roomTxt = new File("Rooms.txt");
			try (Scanner scan = new Scanner(roomTxt)){
				
			int i = 0;
			int roomNum;
			String roomName;
			String roomDesc;
			Room[] roomArray = new Room[6];
			ArrayList<Exit> roomExits = new ArrayList<>();
			new ItemDB idb = new ItemDB();
			Exit newExit = new Exit();
				while (scan.hasNextLine()) {
					
					roomNum = Integer.parseInt(scan.nextLine());
					roomName = scan.nextLine();
					roomDesc = scan.nextLine();
					String roomDirection;
					
					
					if (scan.nextLine().matches("----")) {
						do {
							
							roomDirection = scan.nextLine();

							if (!roomDirection.matches("----")) {

								newExit = buildExit(roomDirection);
								roomExits.add(newExit);
							}

						} while (!roomDirection.matches("----"));
					}

					Room newRoom = new Room(roomNum, roomName, roomDesc, roomExits, new ArrayList<Integer>(), false, idb);
					roomArray[i] = newRoom;
					i++;
					
				} 
				
			}
			catch (NumberFormatException e) {
				e.printStackTrace();
			}
		 
	 }
	 
	 public void updateRoom(Room rm) {
		 
	 }

}
