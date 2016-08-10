import java.util.Random;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PackWithoutWC pack=new PackWithoutWC();
		Deck deck=new Deck(pack);
		Card c;
		deck.shuffle();
		Random random=new Random();
		Hand pokerHand=new PokerHand();
		pokerHand.add(new Card(Suit.SPADE,13));
		pokerHand.add(new Card(Suit.CLUB,13));
		pokerHand.add(new Card(Suit.DIAMOND,13));
		pokerHand.add(new Card(Suit.HEART,2));
		pokerHand.add(new Card(Suit.DIAMOND,2));
		
		
		System.out.println(pokerHand.evaluate());
	}
}
