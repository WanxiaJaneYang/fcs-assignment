public class Test{
	public static void main(String[] args){
		ShakingParty test1=new ShakingParty();
		test1.showNumber();
		test1.showResult();
		//test of random number party

		ShakingParty test2=new ShakingParty(5);
		test2.showNumber();
		test2.showResult();
		//test of a party of given number of people 
	
		ShakingPartyConstrainted test3= new ShakingPartyConstrainted();
		test3.showNumber();
		test3.showResult();
		//test of a party of random number of couples

		ShakingPartyConstrainted test4= new ShakingPartyConstrainted(5);
		test4.showNumber();
		test4.showResult();
		//test of a party of given number of couples
	}
}
