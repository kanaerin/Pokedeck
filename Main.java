import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Coucou");
		
		Deck pack = new Deck();
		Scanner scanner = new Scanner(System.in);
		
		UserMenu menu = new UserMenu(pack, scanner);	
		
		menu.Start();
	}

}
