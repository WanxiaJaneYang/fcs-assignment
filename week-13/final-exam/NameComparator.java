import java.util.Comparator;

public class NameComparator implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b){
        return a.getName().compareTo(b.getName());
    }
}

