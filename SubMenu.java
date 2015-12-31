
import java.util.Scanner;


public class SubMenu {
	
	private Scanner sc;
	private String Choice;
	private int Id;
	
	public SubMenu(Scanner scanner) {
		// TODO Auto-generated constructor stub
		this.sc = scanner;
	}
	
	public int TypeCardChoice() {
		System.out.println("What is the type of card you want to add : \n");
		System.out.println("1 : Pokemon \t\t 2 : Trainer \t\t 3 : Energy ");
		Choice = sc.nextLine();
		int num = Integer.parseInt(Choice);
		
		return num;	
	}
	
	
	public int TypeSearchChoice() {
		System.out.println("Do you want to seach by : \n");
		System.out.println("1 : Card Id \t\t 2 : Card Type ");
		Choice = sc.nextLine();
		int num = Integer.parseInt(Choice);
		
		return num;
	}
	
	
	public void AddCard(Deck packUser) {
		// TODO Auto-generated method stub
		int menuAdd = TypeCardChoice();
		Card c = returnCreatedCard(packUser, menuAdd);
		packUser.AddCard(c);
	}

	public void DeleteCard(Deck packUser) {
		// TODO Auto-generated method stub
		System.out.println("Do you want to delete a card ?\nPlease enter the id of the card you want to delete");
		Choice = sc.nextLine();
		int Id = Integer.parseInt(Choice);
		
		//System.out.println("Your choice is " + Choice);
		if(!packUser.IdExistInDeck(Id)) {
			System.out.println("Your id card is wrong, please enter a new number");
		} else if( !packUser.DeleteCard(Id)) {
			packUser.DeleteCard(Id);
			System.out.println("Your card is delete");
		}
		else {
			System.out.println("Error : The card can't be delete");
		}
	}

	public void EditCard(Deck packUser) {
		// TODO Auto-generated method stub
		System.out.println("Do you want to modify a card ?\nPlease enter the id of the card you want to modify");    
		Choice = sc.nextLine();
		int Id = Integer.parseInt(Choice);
		
		//System.out.println("Your choice is " + Choice);
		if(!packUser.IdExistInDeck(Id)) {
			System.out.println("Your id card is wrong, please enter a new number");
		} else {
			System.out.println("Please enter the card description : ");
			String description = sc.nextLine();
			packUser.AddCardDescription(Id, description);
		}	
	}

	public void DisplayDeck(Deck packUser) {
		// TODO Auto-generated method stub
		if(packUser.DeckSize() == 0) {
			System.out.println(" Your pokedeck is empty");
		} 
		else {
			packUser.ViewDeck();
		}
	}

	public void SearchCard(Deck packUser) {
		// TODO Auto-generated method stub
		int menuSearch = TypeSearchChoice();
		returnSearchedCard(packUser, menuSearch);
	}
	
	public Card SearchByNumber(Deck packUser) {	
		int CardId;
		
		do {
			System.out.println("Please enter id card : ");
			Choice = sc.nextLine();
			CardId = Integer.parseInt(Choice);
			
			if(!packUser.IdExistInDeck(CardId)) {
				System.out.println("This id card doesn't exit, please try again");
			}
		}
		while (!packUser.IdExistInDeck(CardId));
	
		
		return packUser.returnCardToDeck(CardId);
	}
	
	/*-------------------------------------------------------------------- */
	
	public Card returnCreatedCard(Deck packUser, int Id) {
		int i;
		int CardId;
		
		switch(Id) {
			case 1 : // Pokemon Card
					EnergyType energy;
					PokemonLevel level;
					String Cardname;
					int HP;
					
					/* Energy Type */
					System.out.println("Please choice the pokemon type in this list :");
					
					i = 1;
					for(EnergyType Type : EnergyType.values()) {
						System.out.println( i + ". " + Type );
						i++;
					}
					
					Choice = sc.nextLine();
					Id = Integer.parseInt(Choice);
					energy = EnergyType.values()[Id];
					
					/* Pokemon Cardname */
					System.out.println("Please enter Pokemon name :");
					Cardname = sc.nextLine();
					
					/* Level */
					System.out.println("Please choice the pokemon level in this list :");
					i = 1;
					for(PokemonLevel Level : PokemonLevel.values()) {
						System.out.println( i + ". " + Level );
						i++;
					}
					
					Choice = sc.nextLine();
					Id = Integer.parseInt(Choice);
					level = PokemonLevel.values()[Id];
					
					/* Pokemon HP */
					System.out.println("Please enter Pokemon HP :");
					Choice = sc.nextLine();
					HP = Integer.parseInt(Choice);
					
					
					/* Card ID */
					do {
						System.out.println("Please enter id card : ");
						Choice = sc.nextLine();
						CardId = Integer.parseInt(Choice);
						
						if(packUser.IdExistInDeck(CardId)) {
							System.out.println("Please enter a new Id card");
						}
					}
					while (packUser.IdExistInDeck(CardId));
				
					
					return new PokemonCard(CardId, energy, Cardname, HP, level );
					
			case 2 : 
					TrainerType trainer;
					String ItemName;
					
					/* Trainer Type */
					System.out.println("Please choice the trainer type in this list :");
					i = 1;
					for(TrainerType Type : TrainerType.values()) {
						System.out.println( i + ". " + Type );
						i++;
					}
				
					Choice = sc.nextLine();
					Id = Integer.parseInt(Choice);
					trainer = TrainerType.values()[Id];
				
					/* Item Cardname */
					System.out.println("Please enter Item name :");
					Cardname = sc.nextLine();
					
					/* Card ID */
					do {
						System.out.println("Please enter id card : ");
						Choice = sc.nextLine();
						CardId = Integer.parseInt(Choice);
					
						if(packUser.IdExistInDeck(CardId)) {
							System.out.println("Please enter a new Id card");
						}
					}
					
					while (packUser.IdExistInDeck(CardId));
			
				
					return new TrainerCard(CardId, trainer, Cardname);
					
					
			case 3 : 
				EnergyType tEnergy;
				
				/* Trainer Type */
				System.out.println("Please choice the energy type in this list :");
				i = 1;
				for(EnergyType Type : EnergyType.values()) {
					System.out.println( i + ". " + Type );
					i++;
				}
			
				Choice = sc.nextLine();
				Id = Integer.parseInt(Choice);
				tEnergy = EnergyType.values()[Id];
				
				/* Card ID */
				do {
					System.out.println("Please enter id card : ");
					Choice = sc.nextLine();
					CardId = Integer.parseInt(Choice);
				
					if(packUser.IdExistInDeck(CardId)) {
						System.out.println("Please enter a new Id card");
					}
				}
				
				while (packUser.IdExistInDeck(CardId));
		
			
				return new EnergyCard(CardId, tEnergy);	
			
			default : System.out.println("Wrong choice number\n Please try again");
				return null;
		}
	}
	
	
	public void returnSearchedCard(Deck packUser, int Id) {
		int CardId;
		
		switch(Id) {
			case 1 : // Search By number
					System.out.println(SearchByNumber(packUser).cardString());
					break;
					
			case 2 : 
					String Type;
					
					System.out.println("Type of cards : \n");
					System.out.println("1. Pokemon \t 2. Trainer \t 3. Energy ");
					Choice = sc.nextLine();
					
					int nbChoice = Integer.parseInt(Choice);
					
					switch(nbChoice) {
						case 1 : Type = "Pokemon";
								 break;
						case 2 : Type = "Trainer";
								 break;
						
						case 3 : Type = "Energy";
								 break;
						
						default : Type = "Pokemon";
					}
					
					packUser.DisplayCardByType(Type);
					
					break;
					
			 default : System.out.println("Wrong research");
					
		}
	}

}
