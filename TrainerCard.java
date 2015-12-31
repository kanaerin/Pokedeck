
public class TrainerCard extends Card {

	private TrainerType Type;
	
	public TrainerCard(int Id, TrainerType TrainerType, String ItemName) {
		super(Id, "Trainer", ItemName);
		this.Type = TrainerType;
	}

	@Override
	public String cardString() {
		// TODO Auto-generated method stub
		String CardDescript = "Card ID :" + this.getCardId() + "\tCard Type : " + this.CardType() + "\t\tName : " + this.getCardName() + "\t\t Type : " + this.Type;
	
		if(this.CardDescription != null ) {
			CardDescript += "\n" +  "\t\t " + this.CardDescription;
		}
		
		return CardDescript;
	}

}
