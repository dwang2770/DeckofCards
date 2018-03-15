import java.util.ArrayList;

public class Deck 
{
	ArrayList<Card> unDealt;
	ArrayList<Card> Dealt;

	public Deck (String [] rank, String [] suit, int [] value)
	{
		for (int i = 0; i < rank.length; i++)
		{
			for (int j = 0; j < suit.length; j++)
			{
				new Card(rank[i], suit[j], value[i]);
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
	
	public Card deal()
	{
		if (this.unDealt.size() == 0)
		{
			return null;
		}
		else 
		{
		Card holder = this.unDealt.get(0);
		this.unDealt.remove(0);
		this.Dealt.add(holder);
		
		return holder;
		}
	}
	
	public ArrayList<Card> shuffle()
	{
		for (int i = 0; i < this.Dealt.size(); i++)
		{
			Card holder2 = this.Dealt.get(i);
			this.Dealt.remove(i);
			this.unDealt.add(holder2);
		}
		
		for (int k = 51; k >1; k--)
		{
			int r = (int)Math.random()*k;
			Card holder3 = this.unDealt.get(r);
			this.unDealt.set(r,this.unDealt.get(k));
			this.unDealt.set(k,holder3);
		}
		return unDealt;
	}
	
}
