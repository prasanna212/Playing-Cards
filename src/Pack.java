import java.util.ArrayList;
import java.util.List;

public class Pack {
	List<Card> pack;
	public Pack()
	{
		pack=new ArrayList<Card>();
		for(Suit s: Suit.values()){
			if(!(s == Suit.WILDCARD))
			for(int i=1;i<=13;i++){
				pack.add(new Card(s,i));
			}
		}
	}
//	public Pack(List<Card> pack){
//		this.pack=pack;
//	}
}
