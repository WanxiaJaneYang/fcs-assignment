public class Main{
	public static void main(String[] args){
		Player player1 = new Human();
		Player player2 =new Computer();
		Referee refereeA= new Referee();
		//initialize two players and a referee
		
		refereeA.startGame();
		refereeA.askMove(player1);
		refereeA.askMove(player2);
		refereeA.judge(player1, player2);
	}
}
