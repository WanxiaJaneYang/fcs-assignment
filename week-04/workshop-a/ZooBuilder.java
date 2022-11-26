import java.util.ArrayList;

public class ZooBuilder {
    public static void main(String[] args){
        Panda tuantuan =new Panda();
	tuantuan.name="tuantuan";
	Panda.favoriteActivity();

	Koala aussie = new Koala();
	aussie.favoriteActivity();

	Elephant ellie = new Elephant();
	ellie.favoriteActivity();

	Lion luna =new Lion();
	Zebra zebro = new Zebra();
	
	Zoo adeZoo = new Zoo();

	adeZoo.pandas= new ArrayList<Panda>();
	adeZoo.pandas.add(tuantuan);
	System.out.println(adeZoo.pandas.get(0).name);
  }
}
