
public class Card {
	
	Suit suit;
	int value;
	public Card(Suit suit,int value){
		this.suit = suit;
		this.value = value;
	}
	public Suit getSuit(){
		return this.suit;
	}
	public int getValue(){
		return this.value;
	}
}

enum Suit{SPADE,HEART, DIAMOND, CLUB, WILDCARD};