import java.util.Scanner;

public class BlackJackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("What is your name?");
		 String userName1 = sc.nextLine();
		 System.out.println("Hello " + userName1);
		 Player p1 = new Player(userName1); 
		 int human_total1 = play_human1(); 
		 System.out.println("What is your name?"); 
		 String userName2 = sc.nextLine(); 
		 System.out.println("Hello " + userName2); 
		 Player p2 = new Player(userName2); 
		 int human_total2 = play_human2(); 
		 int computer_total = play_computer(); 
		 calculate_winner(human_total1, human_total2, computer_total); 
		 Scanner z = new Scanner(System.in); System.out.println("Play again?"); 
		 while(true){String v = z.nextLine(); 
		 	while(v.equals("Y")){ continue; 
		 	} break;
		 }
	}

}
