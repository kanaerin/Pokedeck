
public abstract class Card {

	private int CardId;
	private String CardName;
	private String CardType;
	protected String CardDescription;
	
	public Card(int cardId, String cardType, String cardName) {
		this.CardId = cardId;
		this.CardName = cardName;
		this.CardType = cardType;
	}

	public int getCardId() {
		return CardId;
	}

	public String getCardName() {
		return CardName;
	}
	
	public String CardType() {
		return CardType;
	}
	
	public String CardDescription() {
		return CardDescription;
	}
	
	public void setDescription(String description) {
		this.CardDescription = description;
	}
	
	public abstract String cardString();
	
}
