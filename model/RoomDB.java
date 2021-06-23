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
import controller.Item;
import controller.Room;

public class RoomDB {
	
	private static RoomDB instance;
	private ArrayList<Room> rooms;
	
	
	 static RoomDB getInstance() {
		return instance;
	}
	
	 ArrayList<Item> getItems() {
		return null;
		 }
	 
	 String getMap() {
		return null; 
	 }
	 
	 Room getRoom(int roomID) {
		 return null;
	 }
	 
	 public void readRooms() {
		 File roomTxt = new File("Rooms.txt");
			try (Scanner scan = new Scanner(roomTxt)){
				
			HashMap <String, Integer> roomExits;
			int i = 0;
			int roomNum;
			String roomName;
			String roomDesc;
			
				while (scan.hasNextLine()) {
					
					roomNum = Integer.parseInt(scan.nextLine());
					roomName = scan.nextLine();
					roomDesc = scan.nextLine();
					String roomDirection;
					roomExits = new HashMap<>();
					
					if (scan.nextLine().matches("----")) {
						do {
							
							roomDirection = scan.nextLine();

							if (!roomDirection.matches("----")) {

								String[] line = roomDirection.split(" ");
								String exit = line[0];
								int rmID = Integer.parseInt(line[1]);
								roomExits.put(exit, rmID);
							}

						} while (!roomDirection.matches("----"));
					}

					Room newRoom = new Room(roomNum, roomName, roomDesc, false, roomExits);
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
