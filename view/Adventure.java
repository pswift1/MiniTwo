/**Class: Adventure.java   
* @author Peter Swift   
* @version 1.0    
* Course: ITEC 3860 Summer 2021   
* Written: June 21, 2021   
*    
* This class – actually plays the game. This is the main method that will build and run the game
*/
package view;
import java.util.*;
import controller.GameController;
public class Adventure {
	
	private GameController gc;
	private Scanner input;
	
	
	
	public Adventure(GameController gc, Scanner input) {
		super();
		this.gc = gc;
		this.input = input;
	}
	
	
	/** Method: getCommand
	 * Convert calendar date into Julian day.
	 * * Note: This algorithm is from Press et al., Numerical Recipes
	 * * in C, 2nd ed., Cambridge University Press, 1992
	 * * @param day day of the date to be converted
	 * * @param month month of the date to be converted
	 * * @param year year of the date to be converted
	 * * @return the Julian day number that begins at noon of the* given calendar date.  */
	private String getCommand() {
		return new String();
	}
	/** Method: playGame
	 * Convert calendar date into Julian day.
	 * * Note: This algorithm is from Press et al., Numerical Recipes
	 * * in C, 2nd ed., Cambridge University Press, 1992
	 * * @param day day of the date to be converted
	 * * @param month month of the date to be converted
	 * * @param year year of the date to be converted
	 * * @return the Julian day number that begins at noon of the* given calendar date.  */
	private void playGame() {
		
	}
	/** Method: main
	 * * This is the main method that processes the actual game
	 * * Note: This algorithm is from Press et al., Numerical Recipes
	 * * in C, 2nd ed., Cambridge University Press, 1992
	 * * @param day day of the date to be converted
	 * * @param month month of the date to be converted
	 * * @param year year of the date to be converted
	 * * @return the Julian day number that begins at noon of the* given calendar date.  */
	static void main(String[] args) {
		
	}

}
