public class Player extends Person {
    private int numWins;
    private int numPlayed;
    private static int playerNum=1;
    private int id;
    //field

    public int getNumPlayed() {
        return numPlayed;
    }
    //getter of numPlayed

    public int getNumWins() {
        return numWins;
    }
    //getter of num wins;

    public void setNumWins(int numWins) {
        this.numWins = numWins;
    }
    //setter of num wins

    public void setNumPlayed(int numPlayed) {
        this.numPlayed = numPlayed;
    }
    //setter of num played

    public Player(String name, int age, int numWins, int numPlayed){
        super(name, age);
        this.numWins=numWins;
        this.numPlayed=numPlayed;
	id=playerNum;
        playerNum++;
    }
    //constructor

    public void win(){
        numPlayed++;
        numWins++;
    }
    //win method

    public void lose(){
        numPlayed++;
    }
    //lose method

    public int getRanking(){
        if (numPlayed==0){
            return 0;
        }
        return numPlayed*(numWins/numPlayed);
    }
    //method of get ranking

    public int getId(){
        return id;
    }
    //method of get id

    public String toString(){
        String result=super.toString();
        result=result+" Id: "+id+" Ranking: "+getRanking();
        return result;
    }
    //method to return a string to shwo the information

}
