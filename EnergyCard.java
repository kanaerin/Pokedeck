
public class EnergyCard extends Card {

	private EnergyType Type;
	
	public EnergyCard(int Id, EnergyType CardType ) {
		super(Id, "Energy", "");
		this.Type = CardType;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String cardString() {
		// TODO Auto-generated method stub
		String CardDescript = "Card ID :" + this.getCardId() + "\tCard Type : " + this.CardType() + "\t\t Type : " + this.Type;
		if(this.CardDescription != null ) {
			CardDescript += "\n" +  "\t\t " + this.CardDescription;
			return CardDescript;
		}
		return CardDescript;
	}

}
