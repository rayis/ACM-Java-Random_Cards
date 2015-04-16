import acm.program.*;
import acm.util.*;

public class Cards extends ConsoleProgram {
	
	public void run(){
	    println("This program draws a random card from a complete deck of 52 playing cards");
		int card = rgen.nextInt(1, 13);
		int rank = rgen.nextInt(1, 4);
		String s = Integer.toString(card);
			switch(card){
				case 1: s = "Ace"; break;
				case 2: s = "Two"; break;
				case 3: s = "Three"; break;
				case 4: s = "Four"; break;
				case 5: s = "Five"; break;
				case 6: s = "Six"; break;
				case 7: s = "Seven"; break;
				case 8: s = "Eight"; break;
				case 9: s = "Nine"; break;
				case 10: s = "Ten"; break;
				case 11: s = "Jack"; break;
				case 12: s = "Queen"; break;
				case 13: s = "King"; break;
		}
		String rankS = Integer.toString(rank);
			switch(rank){
				case 1: rankS = "Clubs"; break;
				case 2: rankS = "Diamonds"; break;
				case 3: rankS = "Hearts"; break;
				case 4: rankS = "Spades"; break;
			}
		println(s + " of " + rankS);
	}
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
