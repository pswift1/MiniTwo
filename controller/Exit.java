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
		super();
		this.destination = destination;
		this.direction = direction;
		
	}
	
	public String getDirection() {
		return direction;
	}
	public void setDirection​(String direction) {
		this.direction = direction;
	}
	public int getDestination() {
		return destination;
	}
	public void setDestination​(int destination) {
		this.destination = destination;
	}
	public void buildExit​(String ex) throws GameException {
		
	}

	@Override
	public String toString() {
		return "Exit [destination=" + destination + ", direction=" + direction + ", VALID_DIRECTIONS="
				+ VALID_DIRECTIONS + ", getDirection()=" + getDirection() + ", getDestination()=" + getDestination()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	

}
