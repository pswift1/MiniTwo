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
	
	
	/** Method: Constructor for the GameController class
	 * * Instantiates the Commands object for the game 
	 * */
	public Exit() {
				
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public String getDirection() {
		return this.direction;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public void setDirection​(String direction) {
		this.direction = direction;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public int getDestination() {
		return this.destination;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public void setDestination​(int destination) {
		this.destination = destination;
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */
	public void buildExit​(String ex) throws GameException {
		
		String[] line = ex.split(" ");
		String exit = line[0];
		int rmID = Integer.parseInt(line[1]);
		Exit build = new Exit();
		build.setDirection​(exit);
		build.setDestination​(rmID);
		
	}
	
	/** Method: executeCommand
	 * * Handles the user input from Adventure Sends the user's command 
	 * * to Commands for processing throws an exception if the command is not valid
	 * * @param cmd - String
	 * * @return the result from the command  */

	@Override
	public String toString() {
		return "Exit [destination=" + destination + ", direction=" + direction + ", VALID_DIRECTIONS="
				+ VALID_DIRECTIONS + ", getDirection()=" + getDirection() + ", getDestination()=" + getDestination()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	

}
