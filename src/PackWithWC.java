import java.util.ArrayList;

public class PackWithWC extends Pack {
	public PackWithWC(){
		super();
		pack.add(new Card(Suit.WILDCARD,0));
		pack.add(new Card(Suit.WILDCARD,0));
	}

}
