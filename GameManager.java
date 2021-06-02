
import java.util.*;

public class GameManager {
	private Maklot[] lines;
	private int turn; //0- p1 1 -p2
	private boolean gameOver;
	private boolean hasStarted;
	// turns
	//impl who wins
	
	
	public GameManager(int lines) {
		int numOfMaklot = 1; // reset lines in pyramid shape
		this.lines = new Maklot[lines];
		for(int i  = 0; i<lines ; i++) {
			this.lines[i] = new Maklot(numOfMaklot);
			numOfMaklot+=2;
		}
	
		Random rand = new Random();
		this.turn = rand.nextInt(2);
		this.gameOver = false;
		this.hasStarted = false;
	}
	
	
	public void playTurn(int selectedRow, int amount) throws Exception {
		if(!hasStarted) {
			hasStarted = true;
		}
		if(this.lines[selectedRow].isEnough(amount)) {
			this.lines[selectedRow].removeNumOfMaklot(amount);
		}else {
			throw new Exception("NOOOOOO");
		}
		
		if(isWon()) {
			this.gameOver = true;
		}
		else {
			if(this.turn == 0) {
				this.turn = 1;
			}else {
				this.turn = 0;
		
			}
		}
	}
    

	private boolean isWon() {
		int count = 0;
		for(int i  = 0; i<lines.length ; i++) {
			if(this.lines[i].isGotOne()) {
				count++;
			}
			if(count > 1) {
				return false;
			}
		}
		return true;
	}


	public int getTurn() {
		return turn;
	}


	public void setTurn(int turn) {
		this.turn = turn;
	}


	public boolean isGameOver() {
		return gameOver;
	}
	
	public boolean HasStarted() {
		return hasStarted;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}
	
	public int getAmountOfLines() {
		return lines.length;
	}
	
	public int getAmountOfMaklotInLine(int row) {
		return lines[row].getAmount();
	}
	
	public Maklot[] getLines() {
		return lines;
	}
	
	public void print() {
		for(int i = 0 ; i<lines.length; i++) {
			Maklot m  = lines[i];
			for(int j  =0 ; j<m.getAmount();j++) {
				if(m.isThere(j)) {
					System.out.print("X");
				}
			}
			System.out.println();
		}
	}
}
