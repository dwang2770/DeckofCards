import java.util.ArrayList;

public class Deck 
{
	ArrayList<Cards> unDealt;
	ArrayList<Cards> Dealt;

	public Deck (String [] rank, String [] suit, int [] value)
	{
		for (int i = 0; i < rank.length; i++)
		{
			for (int j = 0; j < suit.length; j++)
			{
				new Cards(rank[i], suit[j], value[i]);
			}
		}
	}

	public boolean isEmpty()
	{
		if (this.unDealt.size() == 0)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public int size()
	{
		return (this.unDealt.size());
	}
	
	public <Cards> deal()
	{
		Cards holder = this.unDealt<0>;
	}
	
}
