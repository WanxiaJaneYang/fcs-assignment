//==================================
// Foundations of Computer Science
// Student: Wanxia Yang
// id: a1866893
// Semester:s1
// Year:2022
// Practical Number:04 partII
//===================================

import java.util.*;
import java.math.*;

public class ShakingParty{
	private int nPeople;
	//set the attribute as required
	


	public void setNPeople(int number){
		nPeople=number;
	}
	//setter of nPeople

	public int getNPeople(){
		return nPeople;
	}
	//getter of nPeople


		
	public ShakingParty(){
		Random number=new Random();
		nPeople=number.nextInt(200);
	}
	//constructor that generate random number of people in the party

	public ShakingParty(int nTemp){
		nPeople=nTemp;
	}
	//constructor that generate certain number of people
	


	public int countHandShakes(){
		try{
			if(nPeople>2){
				nPeople--;
				return Math.addExact(nPeople,countHandShakes());
			}else if((nPeople==0)||(nPeople==1)){
				return 0;
			}else{
				return 1;
			}
		}catch(ArithmeticException e){
			System.out.println("The number is too big for int type!");
			System.out.println("The following number is invalid!");
			return 0;
		}
	}
	//counter
	


	public void showNumber(){
		System.out.println("There are "+nPeople+" people in the party.");
	}
	//write a method to show the number of people in the party
	
	public void showResult(){
		System.out.printf("There are %d handshakes happened in the party.\n", countHandShakes());
	}
	//print result.
}
