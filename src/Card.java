
public class Card {
	public enum Suit{SPADE,HEART, DIAMOND, CLUB};
	Suit suit;
	int value;
	public Card(Suit suit,int value){
		this.suit = suit;
		this.value = value;
	}
}
