
public class PokemonCard extends Card{

	private EnergyType Type;
	private int hp;
	private PokemonLevel level;
	
	public PokemonCard(int CardId, EnergyType PokemonType, String PokemonCardName, int hp, PokemonLevel level) {
		super(CardId, "Pokemon", PokemonCardName);
		// TODO Auto-generated constructor stub
		this.Type = PokemonType;
		this.hp = hp;
		this.level = level;
	}

	@Override
	public String cardString() {
		// TODO Auto-generated method stub
		String CardDescript = "Card ID :" + this.getCardId() + "\tCard Type : " + this.CardType() + "\t\tName : " + this.getCardName() + "\t\t Type : " + this.Type + "\t\t Stage : " + this.level;
		
		if(this.CardDescription != null ) {
			CardDescript += "\n" +  "\t\t " + this.CardDescription;
			return CardDescript;
		}
		return CardDescript;
	}
	
}
