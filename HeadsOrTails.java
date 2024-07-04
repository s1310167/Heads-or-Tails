import java.util.Random;

class HeadsOrTails{
	int heads=0,tails=0;

	public static void main(String[] args){
		HeadsOrTails game = new HeadsOrTails();
		game.coinToss();
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
			System.out.println("You won");
		else
			System.out.println("You lose");
	}
}