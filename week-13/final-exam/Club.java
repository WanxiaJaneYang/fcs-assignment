import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Club {
    ArrayList<Player> members;
    //field

    public Club(){
        members=new ArrayList<>();
    }
    //constructor

    public void addMember(Player player){
        members.add(player);
    }
    //method to add a player

    public boolean removeMemberById(int id){
        Iterator<Player> iterator=members.iterator();
        while(iterator.hasNext()){
            Player player=iterator.next();
            if(player.getId()==id){
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    //method to remove a player by id

    public Player getHighestRankedPlayer(){
        if(members.size()==0){
            return null;
        }
    
        Player highPlayer=new Player("", 100, 0, 1);
        Iterator<Player> iterator=members.iterator();
        while(iterator.hasNext()){
            Player player=iterator.next();
            if(player.getRanking()>highPlayer.getRanking()){
                highPlayer=player;
            }else if(player.getRanking()==highPlayer.getRanking()){
                if(player.getAge()<highPlayer.getAge()){
                    highPlayer=player;
                }
            }
        }
        return highPlayer;
    }
    //method to get the highest ranking player

    public void printMembers(){
        sort();
        Iterator<Player> iterator=members.iterator();
        while(iterator.hasNext()){
            Player player=iterator.next();
            System.out.println(player.toString());
        }
    }
    //method to print members one by one

    private void sort() {
        Collections.sort(members, new NameComparator());
    }
    //method to sort players by their name
    
    public void countMembers(){
        int juniorCount=0, seniorCount=0;
        Iterator<Player> iterator=members.iterator();
        while(iterator.hasNext()){
            Player player=iterator.next();
            if(player.getAge()<21){
                juniorCount++;
            }else{
                seniorCount++;
            }
        }
        System.out.println("The club has "+juniorCount+" junior and "+seniorCount+" senior members");
    }
    //method to print the junior numbers of members and senior members 

    public Player getHighestRankedJunior(){
        if(members.size()==0){
            return null;
        }
        //if no members 

        Player highJuniorPlayer=new Player("", 21, 0, 1);
        Iterator<Player> iterator=members.iterator();
        while(iterator.hasNext()){
            Player player=iterator.next();
            if(player.getAge()<21){
                if(player.getRanking()>highJuniorPlayer.getRanking()){
                    highJuniorPlayer=player;
                }else if(player.getRanking()==highJuniorPlayer.getRanking()){
                    if(player.getAge()<highJuniorPlayer.getAge()){
                        highJuniorPlayer=player;
                    }
                }
            }
        }

        if(highJuniorPlayer.getAge()==21){
            return null;
        }
        //if there is no junior member 

        return highJuniorPlayer;
    }
    //method to get highest ranking player of junior memebers
}

