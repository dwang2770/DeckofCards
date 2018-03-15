import java.util.ArrayList;
public class Runner {

	public static void main(String[] args) 
	{
	String [] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	String [] suit = {"Clover", "Heart", "Diamond", "Spades"};
	int [] value= {2,3,4,5,6,7,8,9,10,11,12,13,1};
	
	Deck TehDeck = new Deck (rank, suit, value);
	
	for (int i = 0; i < TehDeck.size(); i ++)
	{
		 System.out.print((TehDeck.get(i)).toString());
	}
	
	}

}
