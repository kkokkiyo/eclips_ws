import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GameBoard {
    
    private Cell[][] square;
    private int point;
    
    public Cell[][] square() { 
        return square; 
    }
    
    public int point() { 
        return point; 
    }
    
    public void upgrade() { 
        point += 2; 
    }
    
    public GameBoard() {
        square = new Cell[4][4];
        Color[] colors = {Color.BLUE, Color.CYAN, Color.PINK, Color.RED, 
                          Color.GRAY, Color.GREEN, Color.MAGENTA, Color.ORANGE};
        Cell[] twins = createTwinCells(colors);
        makeSquare(shuffle(twins));
    }
    
    private void makeSquare(Cell[] cells) {
        // to be filled...
    	for (int i = 0; i < square.length; i++) {
    		for (int j = 0; j < square.length; j++) {
    			square[i][j] = cells[j];
			}
			
		}
    	
    }
    
    private Cell[] createTwinCells(Color[] cs) {
        // to be filled...
    	Cell[] blue = new Cell[2];
    	Cell[] cyan = new Cell[2];
    	Cell[] pink = new Cell[2];
    	Cell[] red = new Cell[2];
    	Cell[] gray = new Cell[2];
    	Cell[] green = new Cell[2];
    	Cell[] magenta = new Cell[2];
    	Cell[] orange = new Cell[2];
    	Cell[] all = new Cell[16]{blue, cyan, pink, red, gray, green, magenta, orange};
    	return all;
    	
    	
    }
    
    private Cell[] shuffle(Cell[] twins) {
        int index;
        Cell temp;
        Random random = new Random();
        for (int i = twins.length - 1; i > 0; i--) {
            index = random.nextInt(i+1);
            temp = twins[index];
            twins[index] = twins[i];
            twins[i] = temp;
        }
        return twins;
    }

}