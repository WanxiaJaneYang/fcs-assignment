public class Referee{
	void startGame(){
		System.out.println("Game Start!");
	}
	//method to start a game
	
	void askMove(Player a){
		if(a instanceof Human){
			System.out.println("To Human Player: Scissor, rock or paper?");
		}else{
			System.out.println("To Computer Player: Scissor, rock or paper(result hidden)?");
		}
		
		a.setMove(a.performMove());
	}
	//ask the player to move

	void judge(Player a, Player b){
		if(a.getMove()==b.getMove()){
			System.out.println("A Draw.");
		}
		else if(a.getMove()=="Scissors"){
			if(b.getMove() =="Paper"){
				announceVictory(a);
			}else{
				announceVictory(b);
			}
		}else if(a.getMove()=="Paper"){
			if(b.getMove()=="Scissors"){
				announceVictory(b);				
			}else{
				announceVictory(a);
			}
		}else if(b.getMove()=="Paper"){
			announceVictory(b);
		}else{
			announceVictory(a);
		}
	}
	//get the result

	void announceVictory(Player a){
		if(a instanceof Human){
			System.out.printf("Human Player win!\n");
		}else{
			System.out.printf("Computer win!\n");
		}
		
		a.addNumberOfWins();
	}
	//announce the result
}
