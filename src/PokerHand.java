import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PokerHand extends Hand {
	
	final static int STRAIGHT_FLUSH = 1;
	final static int FOUR_OF_A_KIND = 2;
	final static int FULL_HOUSE = 3;
	final static int FLUSH = 4;
	final static int STRAIGHT = 5;
	final static int THREE_OF_A_KIND = 6;
	final static int TWO_PAIR = 7;
	final static int ONE_PAIR = 8;
	final static int HIGH_CARD = 9;
	
	public PokerHand(){
		super();
	}
	public PokerHand(List<Card> hand) {
		super(hand);
		// TODO Auto-generated constructor stub
	}

	@Override
	int evaluate() {
		// TODO Auto-generated method stub
		return calculateHandRank();
	}
	
	

	private int calculateHandRank() {
		// TODO Auto-generated method stub
		
		int rank=0;
		HashMap<Integer,Integer> valueFrequency;
		valueFrequency = getValueFrequency();
		if(isStraightFlush())
			rank = STRAIGHT_FLUSH;
		else if(isFourOfAKind(valueFrequency))
			rank = FOUR_OF_A_KIND;
		else if(isFullHouse(valueFrequency))
			rank = FULL_HOUSE;
		else if(hasSameSuit())
			rank = FLUSH;
		else if(isStraight())
			rank = STRAIGHT;
		else if(isThreeOfAKind(valueFrequency))
			rank = THREE_OF_A_KIND;
		else if(isTwoPair(valueFrequency))
			rank = TWO_PAIR;
		else if(isOnePair(valueFrequency))
			rank = ONE_PAIR;
		else
			rank = HIGH_CARD;
		return rank;
	}

	private boolean isOnePair(HashMap<Integer, Integer> valueFrequency) {
		// TODO Auto-generated method stub
		int pair_count = 0;
		if(valueFrequency.size() == 4)
		{
			for(int value:valueFrequency.keySet())
			{
				if(valueFrequency.get(value) == 2)
					pair_count++;
			}
		}
		return pair_count==1;
	}

	private boolean isTwoPair(HashMap<Integer, Integer> valueFrequency) {
		// TODO Auto-generated method stub
		int pair_count = 0;
		if(valueFrequency.size() == 3)
		{
			for(int value:valueFrequency.keySet())
			{
				if(valueFrequency.get(value) == 2)
					pair_count++;
			}
		}
		return pair_count==2;
	}

	private boolean isThreeOfAKind(HashMap<Integer, Integer> valueFrequency) {
		// TODO Auto-generated method stub
		if(valueFrequency.size() == 3)
		{
			for(int value:valueFrequency.keySet())
			{
				if(valueFrequency.get(value) == 3)
					return true;
			}
		}
		return false;
	}

	private boolean isFullHouse(HashMap<Integer, Integer> valueFrequency) {
		// TODO Auto-generated method stub
		if(valueFrequency.size() == 2)
		{
			for(int value:valueFrequency.keySet())
			{
				if(valueFrequency.get(value) == 3)
					return true;
			}
		}
		return false;
	}

	private boolean isFourOfAKind(HashMap<Integer, Integer> vf) {
		// TODO Auto-generated method stub
		//List<Integer> l = new ArrayList<Integer>();
		if(vf.size() == 2)
		{
			for(int value:vf.keySet())
			{
				if(vf.get(value) == 4)
					return true;
			}
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
				vf.put(rank, vf.get(rank)+1);
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
			if(a.get(i) != a.get(i-1)+1)
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
