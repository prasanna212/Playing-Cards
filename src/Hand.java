import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	List<Card> hand;
	public Hand(){
		hand=new ArrayList<Card>();
	}
	public Hand(List<Card> hand)
	{
		this.hand = hand;
	}
	
	public void add(Card c)
	{
		this.hand.add(c);
	}
	public Card get(int i){
		return hand.get(i);
	}
	
	public void remove(Card c)
	{
		this.hand.remove(c);
	}
	abstract int evaluate();
}
