import java.util.Scanner;
import java.util.regex.*;

public class Human extends Player{
	String performMove(){
		int option=0;
		Scanner input =new Scanner(System.in);
		String aMove="";
		do{	
			System.out.println("Give your choice:");
			aMove=input.next();
			//get input

			String patternOfScissors="(S|s).*";
			String patternOfRock="(r|R).*";		
			boolean isMatchScissors=Pattern.matches(patternOfScissors,aMove);
			boolean isMatchRock=Pattern.matches(patternOfRock,aMove);
			//set to match the user's input

			if(isMatchScissors){
				aMove="Scissors";
				System.out.println("Do you want to give 'Scissors'?");
			}else if(isMatchRock){
				aMove="Rock";
				System.out.println("Do you want to give 'Rock?'");
			}else{
				aMove="Paper";
				System.out.println("Do you want to give 'Paper?'");
			}
	
			System.out.println("Y for yes, N for No");
			char opt = input.next().charAt(0);

			switch (opt){
				case 'y':
				case 'Y':
					option=1;
					break;
				default:
					break;
			}
		}while(option==0);
		//loop until the player is sure of his or her choice

		return aMove;	
	}
	//perform move method for human player
}
