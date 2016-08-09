

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pack pack=new PackWithWC();
		Deck deck=new Deck(pack);
		Card c;
		for(int i=0;i<deck.size();i++){
			c=deck.get(i);
			System.out.println(c.getSuit()+" "+c.getValue());
		}
	}

}
