import java.util.ArrayList;

public class Deck 
{
	ArrayList<Card> unDealt;
	ArrayList<Card> Dealt;

	public Deck (String [] rank, String [] suit, int [] value)
	{
		this.Dealt = new ArrayList<Card>();
		this.unDealt=new ArrayList<Card>();
		
		for (int i = 0; i < rank.length; i++)
		{
			for (int j = 0; j < suit.length; j++)
			{
				unDealt.add( new Card(rank[i], suit[j], value[i]));
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
		
		//Takes all the cards in the Dealt list and adds them back to the unDealt list
		while (this.Dealt.size() > 0)
		{
			Card holder2 = this.Dealt.get(0);
			this.Dealt.remove(0);
			this.unDealt.add(holder2);
		}
		//Shuffles the Dealt list
		for (int k = 51; k > 0; k--)
		{
			int r = (int)(Math.random()*k);
			Card holder3 = this.unDealt.get(r);
			this.unDealt.set(r,this.unDealt.get(k));
			this.unDealt.set(k,holder3);
		}
		return this.unDealt;
	}
	
	public String toString()
	{
		return("Dealt: " +this.Dealt + "UnDealt: " + this.unDealt);
	}
	
}
