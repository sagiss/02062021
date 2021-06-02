//import java.util.*;
//import java.util.ArrayList;
//public class Ai {
//	GameManager gm;
//	
//	public Ai(GameManager gm) {
//		this.gm = gm;
//	}
//	
//	public void playTurn() throws Exception {
//		int lineToPlay = 0;
//		int amountToTake = 0;
//		if(!gm.HasStarted()) {
//			Random rnd = new Random();
//			lineToPlay = 0;
//			amountToTake = 0;
//			gm.playTurn(lineToPlay, amountToTake);
//		}
//		else {
//			lineToPlay = getTheOnlyOneLineLeft();
//			if(lineToPlay != -1) {//	הא יש שורה אחת שאפשר להוציא ממנה
//				amountToTake =  getAmoutToRemove(lineToPlay);
//				gm.playTurn(lineToPlay, amountToTake);
//			}else {
//				makeAMove();
//			}
//		//}
//	}
//	
//	public void makeAMove() throws Exception {
//		ArrayList<Integer> goodLinesForTwo = new ArrayList(); 
//		ArrayList<Integer> goodLinesForOne = new ArrayList(); 
//		Integer[] amountLeft = new Integer[gm.getAmountOfLines()];
//		for (int i = 0;i<gm.getAmountOfLines(); i ++) {
//			int num = 0;
//			for ( int j = 0; j<gm.getAmountOfMaklotInLine(i);j++) {
//				if(gm.getLines()[i].getMaklot()[j]) {
//					num++;
//				}	
//			}
//			amountLeft[i] = num;
//			if (num > 2) {
//				goodLinesForTwo.add(i);
//			}else if (num == 1) {
//				goodLinesForOne.add(i);
//			}
//		} 
//		if(goodLinesForTwo.isEmpty() || goodLinesForOne.isEmpty()) {
//		Random rnd = new Random();
//		int line = -1;
//		int amountToTake = -1;
//		int whatToDo = rnd.nextInt(2);
//		if(whatToDo == 0 && !goodLinesForOne.isEmpty()) {
//			int index = rnd.nextInt(goodLinesForOne.size());
//			line = goodLinesForOne.get(index);
//			amountToTake = 1;
//		}
//		else if(!goodLinesForTwo.isEmpty()){
//	     	int index = rnd.nextInt(goodLinesForTwo.size());
//			line = goodLinesForTwo.get(index);
//		    amountToTake = amountLeft[line]-2;
//		}
//		else {
//			
//		}
//		gm.playTurn(line, amountToTake);
//
//		}
//	}
//	
//	public void removeRandom() {
//		
//	}
//	
//	
//	public int getAmountOfTwo () {
//		int count = 0;
//		for (int i = 0;i<gm.getAmountOfLines(); i ++) {
//			int num = 0;
//			for ( int j = 0; j<gm.getAmountOfMaklotInLine(i);j++) {
//				if(gm.getLines()[i].getMaklot()[j]) {
//					num++;
//				}	
//			}
//			if (num == 2) {
//				count++;
//			}
//		}
//		return count;
//			
//	}
//	
//	public int getTheOnlyOneLineLeft() {
//
//		int count = 0;
//		int index = -1;
//		for(int i = 0;i<gm.getAmountOfLines();i++) {
//			if(gm.getLines()[i].isAllOut()) {
//				count ++;
//				index = i;
//			}
//	
//		}
//		if(count > 1) {
//			return -1;
//		}
//		return index;
//	}
//	
//	public int getAmoutToRemove(int line) {
//		int count = -1;
//		for(int i = 0; i<gm.getAmountOfMaklotInLine(line);i++) {
//			if(gm.getLines()[line].getMaklot()[i]) {
//				count++;
//			}
//		}
//		return count;
//	}
//}
