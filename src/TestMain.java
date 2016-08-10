

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pack pack=new PackWithWC();
		Deck deck=new Deck(pack);
		Card c;
		
		deck.shuffle();
		RummyHand rummyHand=new RummyHand();
		for(int i=0;i<13;i++){
			rummyHand.add(deck.get(i));
		}
		//rummyHand.sort();
		for(int i=0;i<13;i++){
			c=rummyHand.get(i);
			System.out.println(c.getSuit()+" "+c.getValue());
		}
	}

}
