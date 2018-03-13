
public class Cards 
{
	private String rank;
	private String suit;
	private int value;
	
	public Cards (String rank, String suit, int value)
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

	public boolean equals (Cards x, Cards y)
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
