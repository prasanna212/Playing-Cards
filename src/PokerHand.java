import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PokerHand extends Hand {

	public PokerHand(List<Card> hand) {
		super(hand);
		// TODO Auto-generated constructor stub
	}

	@Override
	void evaluate() {
		// TODO Auto-generated method stub
		String rank;
		HashMap<Integer,Integer> valueFrequency;
		valueFrequency = getValueFrequency();
		if(isStraightFlush())
			rank = "Straight Flush";
		else if(isFourOfAKind(valueFrequency))
			rank = "Four of a kind";
		else if(hasSameSuit())
			rank = "Flush";
		else if(isStraight())
			rank = "Straight";
	}

	private boolean isFourOfAKind(HashMap<Integer, Integer> vf) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		if(vf.size() == 2)
		{
			l.add(vf.keySet());
			
		}
		return false;
	}

	private HashMap<Integer, Integer> getValueFrequency() {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> vf = new HashMap<Integer,Integer>();
		int rank;
		for(int i=0;i<hand.size();i++)
		{
			rank = hand.get(i).value;
			if(vf.containsKey(rank))
			{
				vf.put(rank, vf.get(rank));
			}
			else
			{
				vf.put(rank, 1);
			}
		}
		return vf;
	}

	private boolean isStraight() {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>();
		int v;
		for(int i=0;i<hand.size();i++)
		{
			v = hand.get(i).value;
			if(v == 1)
				a.add(14);
			else
				a.add(v);
		}
		Collections.sort(a);
		v = a.get(0);
		for(int i=1;i<a.size();i++)
		{
			if(a.get(i) != a.get(i-1))
				return false;
		}
		return true;
	}

	private boolean isStraightFlush() {
		// TODO Auto-generated method stub
		return isStraight()&&hasSameSuit();
	}

	
	
	private boolean hasSameSuit() {
		// TODO Auto-generated method stub
		Suit suit = hand.get(0).suit;
		for(int i=1;i<hand.size();i++)
			if(hand.get(i).suit != suit)
				return false;
		return true;
	}

}
