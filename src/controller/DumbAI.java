package controller;

import java.util.ArrayList;
import java.util.List;

import clui.BoardPrinter;
import model.*;

/**
 * A DumbAI is a Controller that always chooses the blank space with the
 * smallest column number from the row with the smallest row number.
 */
public class DumbAI extends Controller {
	
	
	
	public DumbAI(Player me) {
		super(me);
		// TODO Auto-generated constructor stub
		
	}

	protected @Override Location nextMove(Game g) {
		
		// TODO Auto-generatsd method stub
		//container that contains all blank space 
		List<Location> vacant = new ArrayList<Location>();
		
		//checking location starting from the smallest column number from the smallest row number
		for(Location loc:Board.LOCATIONS) {
			
			//check whether the location is played or not
			if(g.getBoard().get(loc) == null)
				vacant.add(loc);
		}
		
		// Note: Calling delay here will make the CLUI work a little more
		// nicely when competing different AIs against each other.
		delay();
		
		//getting the valid location from the smallest column number from the smallest row number
		Location avail_loc = vacant.get(0);
		
		//return result
		return avail_loc;
	}
}
