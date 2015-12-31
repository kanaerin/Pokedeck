import java.util.ArrayList;


public class Deck {
	private ArrayList<Card> Deck;
	
	public Deck() {
		Deck = new ArrayList<Card>();
	}

	public ArrayList<Card> getDeck() {
		return Deck;
	}
	
	public void AddCard(Card c) {
		Deck.add(c);
	}
	
	public boolean DeleteCard(int Id) {
		for (Card c : Deck) {
			if(c.getCardId() == Id) {
				return Deck.remove(c);
			}
		}
		return false;
	}
	
	public void AddCardDescription(int Id, String CardDescription) {
		for (Card c : Deck) {
			if( c.getCardId() == Id) {
				c.setDescription(CardDescription);
			}
		}
	}
	
	public int DeckSize() {
		return Deck.size();
	}
	
	public void ViewDeck() {
		for (Card c : Deck) {
			System.out.println(c.cardString());
		}
	}
	
	public boolean IdExistInDeck(int Id) {
		for (Card c : Deck) {
			if( c.getCardId() == Id) {
				return true;
			}
		}
		return false;
	}
	
	public Card returnCardToDeck(int Id) {
		for(Card c : Deck) {
			if(c.getCardId() == Id) {
				return c;
			}
		}
		return null;
		
	}
	
	public void DisplayCardByType(String Type) {
		for (Card c : Deck) {
			if(c.CardType().equals(Type)) {
				System.out.println(c.cardString());
			}
			
		}
	}
	
	public void DisplayCardByName(String Name) {
		String CardName;
		
		for( Card c : Deck) {
			CardName = c.getCardName();
			if(CardName.toLowerCase().equals(Name.toLowerCase())) {
				System.out.println(c.cardString());
			}
		}
	}

}
