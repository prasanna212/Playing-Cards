import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
	private List<Card> deck;
	
	public Deck(Pack pack)
	{
		deck=new ArrayList<Card>();
		deck.addAll(pack.pack);
	}
	public Deck(Pack pack1,Pack pack2){
		deck.addAll(pack1.pack);
		deck.addAll(pack2.pack);
	}
	public Deck(Pack p,int num){		
		for(int i=0;i<num;i++){
			
			deck.addAll(new ArrayList<Card>(p.pack));
		}
	}
	public void addCard(Card c){
		deck.add(c);
	}
	public void removeCard(Card c){
		deck.remove(c);
	}
	public Card get(int n){
		return deck.get(n);
	}
	public int size(){
		return deck.size();
	}
	public void shuffle(){
		Collections.shuffle(this.deck);
	}

}
