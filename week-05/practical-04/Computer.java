import java.util.*;

public class Computer extends Player{
	String performMove(){
		Random randomNumber=new Random();
		int moveIndex=randomNumber.nextInt(3);
		String aMove="";

		switch (moveIndex){
			case (0):
				aMove="Scissors";
				break;
			case (1):
				aMove="Rock";
				break;
			case (2):
				aMove="Paper";
				break;		
		}

		//System.out.println("The move of computer is "+aMove+"(Just show for test)");
		//only used in test

		return aMove;
	}//generate a random move
}
