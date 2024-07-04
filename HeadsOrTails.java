import java.util.Random;
import java.util.Scanner;

class HeadsOrTails{
	int heads=0,tails=0;
	String name;

	public static void main(String[] args){
		HeadsOrTails game = new HeadsOrTails();
		game.userName();
		game.coinToss();
	}
	
	public void userName(){
		System.out.println("Who are you?");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		System.out.println("Hello, " + name + "!");
		
	}
	public void coinToss(){
		System.out.println("Tossing a coin...");
		
		Random rand = new Random();
		for (int i = 0; i < 3; i++){
			if (rand.nextInt(2) == 0){
				System.out.printf("Round %d: Heads\n",i+1);
				heads++;
			} else {
				System.out.printf("Round %d: Tails\n",i+1);
				tails++;
			}
			
		}
		
		System.out.printf("Heads: %d, Tails: %d\n",heads,tails);
		if (heads > tails)
			System.out.println(name + "won!");
		else
			System.out.println(name + " lose");
	}
}