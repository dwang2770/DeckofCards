/*
 * Dave Wang 
 * 3/18/18
 * Lab 4.1
 */

import java.util.ArrayList;
public class Runner {

	public static void main(String[] args) 
	{
	String [] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	String [] suit = {"Clover", "Heart", "Diamond", "Spades"};
	int [] value= {2,3,4,5,6,7,8,9,10,11,12,13,1};
	
	Deck TehDeck = new Deck (rank, suit, value);
	//shuffles the cards
	TehDeck.shuffle();
	//deals out the cards
	for (int x = 0; x < 52; x++)
	{
	TehDeck.deal();
	}
	
	System.out.print(TehDeck);
	
	}

}
