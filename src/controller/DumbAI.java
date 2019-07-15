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
		// Note: Calling delay here will make the CLUI work a little more
		// nicely when competing different AIs against each other.
		
		
		// TODO Auto-generatsd method stub
		List<Location> available = new ArrayList<Location>();
		
		for(Location loc:Board.LOCATIONS) {
			if(g.getBoard().get(loc) == null)
				available.add(loc);
		}
		
		delay();
		
		Location avail_loc = available.get(0);
		return avail_loc;
		
		
	}
}
