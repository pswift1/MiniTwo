/**Class: Exit.java    
* @author Peter Swift   
* @version 1.0    
* Course: ITEC 3860 Summer 2021   
* Written: June 21, 2021   
*    
* This class – this class determines the exits for the rooms
*/
package controller;
import java.util.*;
import gameExceptions.GameException;

public class Exit {
	
	private int destination;
	private String direction;
	private final List<String> VALID_DIRECTIONS = null;
	
	public Exit() {
		
		
	}
	
	public String getDirection() {
		return this.direction;
	}
	public void setDirection​(String direction) {
		this.direction = direction;
	}
	public int getDestination() {
		return this.destination;
	}
	public void setDestination​(int destination) {
		this.destination = destination;
	}
	public void buildExit​(String ex) throws GameException {
		//take the string from RoomDB, break into split like I did in the mini 1
		String[] line = ex.split(" ");
		String exit = line[0];
		int rmID = Integer.parseInt(line[1]);
		Exit build = new Exit();
		build.setDirection​(exit);
		build.setDestination​(rmID);
		
	}

	@Override
	public String toString() {
		return "Exit [destination=" + destination + ", direction=" + direction + ", VALID_DIRECTIONS="
				+ VALID_DIRECTIONS + ", getDirection()=" + getDirection() + ", getDestination()=" + getDestination()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	

}
