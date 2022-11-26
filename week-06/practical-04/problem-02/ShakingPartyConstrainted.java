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

public class ShakingPartyConstrainted extends ShakingParty{
	private int nCouples;
	//set the attribute as required
	
	public void setNCouples(int number){
		nCouples=number;
	}
	//setter of nCouples

	public int getNCouples(){
		return nCouples;
	}
	//getter of nCouples
		
	public ShakingPartyConstrainted(){
		nCouples=getNPeople()/2;	
	}
	//constructor that generate random number of couples in the party

	public ShakingPartyConstrainted(int nTemp){
		nCouples=nTemp;
	}
	//constructor that generate certain number of couples
	
	public void showNumber(){
		System.out.printf("There are %d couples in the party.\n", nCouples);
	}
	//rewrite the show number method
	
	public int countHandShakes(){
		if((nCouples==1)||(nCouples==0)){
			return (0);
		}else{
			nCouples--;
			return (3*nCouples +countHandShakes());
		}
	}
	//counter
	
	public void showResult(){
		System.out.printf("There are %d handshakes happened in the party\n", countHandShakes());
	}
	//rewrite the show result method
}
