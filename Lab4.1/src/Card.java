
public class Card {
	private String rank;
	private String suit;
	private int value;
	
	public Card (String rank, String suit, int value)
	{
		this.rank = rank;
		this.suit = suit;
		this.value = value;
	}

	public String getRank() 
	{
		return rank;
	}

	
	public String getSuit() 
	{
		return suit;
	}


	public int getValue() 
	{
		return value;
	}

	public boolean equals (Card x, Card y)
	{
		if (x.getValue() == y.getValue())
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		return (this.rank + "of" + this.suit + "with value of: " + this.value);
	}
	
}
