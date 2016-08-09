import java.util.List;

public abstract class Hand {
	List<Card> hand;
	
	public Hand(List<Card> hand)
	{
		this.hand = hand;
	}
	
	void add(Card c)
	{
		this.hand.add(c);
	}
	
	void remove(Card c)
	{
		this.hand.remove(c);
	}
	abstract void evaluate();
}
