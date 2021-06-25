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
	private final List<String> VALID_DIRECTIONS = Arrays.asList("North", "South", "East", "West", "Up", "Down");
	
	
	/** Method: Constructor for the Exit class */
	public Exit() {
				
	}
	
	/** Method: getDirection
	 * * getter for the Direction
	 * * @return String containing the direction  */
	public String getDirection() {
		return this.direction;
	}
	
	/** Method: setDirection
	 * * setter for Direction
	 * * @param direction - the direction to be set  */
	public void setDirection​(String direction) {
		this.direction = direction;
	}
	
	/** Method: getDestination
	 * * getter for the destination room number
	 * * @return int containing the destination  */
	public int getDestination() {
		return this.destination;
	}
	
	/** Method: setDestination
	 * * setter for Destination
	 * * @param destination - the target destination to be set  */
	public void setDestination​(int destination) {
		this.destination = destination;
	}
	
	/** Method: buildExit
	 * * Builds an Exit from the String provided 
	 * * throws an exception for an invalid exit
	 * * @param ex - - String containing the information for the exit
	 */
	public void buildExit​(String ex) throws GameException {
		
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
