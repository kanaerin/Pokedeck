import java.util.Scanner;


public class UserMenu {
	
	private Scanner sc;
	private SubMenu subMenu;
	private String Choice = "1";
	private Deck packUser;
	
	public UserMenu(Deck pack, Scanner scanner) {
		// TODO Auto-generated constructor stub
		this.sc = scanner;
		subMenu = new SubMenu(scanner);
		packUser = pack;
	}

	public void Start() {
		System.out.println("Hello User");
		System.out.println("\n-----------------------------------------------------------\n");
		System.out.println("What do you want to do?\n");
		
		while(Integer.parseInt(Choice) !=0) {
			UserMenu();
			UserChoice();
		}
		
	}

	public void UserMenu() {
		// TODO Auto-generated method stub
		System.out.println("\t\t\t\t Menu \t\t\t\t");
		System.out.println("-----------------------------------------------------------");
		System.out.println("0 - Exit \n");
		System.out.println("1 - Display deck \n");
		System.out.println("2 - Add Card - Type : Pokemon, Trainer, Energy \n");
		System.out.println("3 - Delete Card \n");
		System.out.println("4 - Add Card description \n");
		System.out.println("5 - Search card - Name or Energy Type \n");
		
	}
	
	public void UserChoice() {
		// TODO Auto-generated method stub
		Choice = sc.nextLine();
		if(Choice.equals("")) {
			Choice = "0";
			System.out.println("No choice");
		}
		
		int number = Integer.parseInt(Choice);
		
		switch(number) {
		
			case 0 : System.out.println("Good Bye!\n");
			break;
			
			case 1 : subMenu.DisplayDeck(packUser);
			System.out.println("\n");
			break;
			
			case 2 : subMenu.AddCard(packUser);
			System.out.println("\n");
			break;
			
			case 3 : subMenu.DeleteCard(packUser);
			System.out.println("\n");
			break;
			
			case 4 : subMenu.EditCard(packUser);
			System.out.println("\n");
			break;
			
			case 5 : subMenu.SearchCard(packUser);
			System.out.println("\n");
			break;
			
			default : System.out.println("Wrong choice number, please enter a new one");		
		}	
	}	
}
