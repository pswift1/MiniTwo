/**Class: GameException.java    
* @author Peter Swift   
* @version 1.0    
* Course: ITEC 3860 Summer 2021   
* Written: June 21, 2021   
*    
* This class – defines the exceptions the game throws, as well as the message that displays when one is thrown.
*/
package gameExceptions;

import java.io.IOException;

public class GameException extends IOException{
	
	public GameException() {
		super();
		
	}
	
	public GameException(String message) {
		super(message);
	}

}
