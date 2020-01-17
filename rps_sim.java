
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.List;

public class rps_sim {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		list.add("Rock"); 
		list.add("Paper"); 
		list.add("Scissors");
		
		Random rand = new Random(); 
		
		int numGames = 0;
		int Pcounter = 0;
		int Ccounter = 0;
		int start = 0;
		
		while (start == 0) {
		System.out.println("Welcome to Rock, Paper, Scissors");
		System.out.println("Please enter how many rounds you want to play: 3, 5, 7, 9.");
		int n = scanner.nextInt();
		
		if (n == 3 || n == 5 || n == 7 || n == 9) {
			for (;numGames < n; numGames++) {
				int index = rand.nextInt(list.size());
				String CPU = list.get(index);
				System.out.println("Please enter Rock, Paper or Scissors to begin");
				System.out.println(CPU);
				String Pinput = scanner.next();
				
				
			if (Pinput.equals("Rock") || Pinput.equals("Paper") || Pinput.equals("Scissors"))	{
				if (Pinput.equals(CPU)) {
					System.out.println("Tie!");
					}
					
					
				else if (Pinput.equals("Rock") && CPU.equals("Paper")) {
					System.out.println("CPU Wins!"); 
					Ccounter += 1;
				}
				else if (Pinput.equals("Rock") && CPU.equals("Scissors")) {
					System.out.println("You Win!");
					Pcounter += 1;
			}
				


				else if (Pinput.equals("Paper") && CPU.equals("Rock")) {
					
					System.out.println("You Win!");
					Pcounter += 1;
					}
				
				else if (Pinput.equals("Paper") && CPU.equals("Scissors")) {
					System.out.println("CPU Wins!");
					Ccounter += 1;
			}
				
				
				else if (Pinput.equals("Scissors") && CPU.equals("Rock")) {
					
					System.out.println("CPU Wins!");
					Ccounter += 1;
					}
				else if (Pinput.equals("Scissors") && CPU.equals("Paper")) {
					System.out.println("You Win!"); 
					Pcounter += 1;
				}
			}
			else {
				System.out.println("Invalid Input");
			}
				

				
		}
		
			System.out.println("Your Score was " + Pcounter);
			System.out.println("CPU Score was " + Ccounter);
			if (Pcounter > Ccounter) {
				System.out.println("You Win!");
				System.out.println("Press 1 to play again or 0 to quit");
				int end = scanner.nextInt();
				if(end == 1) {
					start = 0;
					Pcounter = 0;
					Ccounter = 0;
					numGames = 0;
				}
				else {
					start = 1;
				}
			}
			else if (Pcounter == Ccounter) {
				System.out.println("It was a tie");
				System.out.println("Press 1 to play again or 0 to quit");
				int end = scanner.nextInt();
				if(end == 1) {
					start = 0;
					Pcounter = 0;
					Ccounter = 0;
					numGames = 0;
				}
				else {
					start = 1;
				}
			} 
			else {
				System.out.println("You lose");
				System.out.println("Press 1 to play again or 0 to quit");
				int end = scanner.nextInt();
				if(end == 1) {
					start = 0;
					Pcounter = 0;
					Ccounter = 0;
					numGames = 0;
				}
				else {
					start = 1;
				}
			}
		}
		
		else {
			
			System.out.println("Please enter a valid ammount of rounds");
			
		
		}
		}
		}
		}
		


