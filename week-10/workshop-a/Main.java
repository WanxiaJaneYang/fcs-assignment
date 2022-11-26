public class Main {
	public static void main(String[] args) {
		Dictionary dict =new Dictionary();		
		String[] words= {"apple", "pine", "tree", "pea", "lab","dog"};
		for(String word:words) {
			dict.insert(word);
			dict.printDict();
			System.out.println();
		}		
		dict.printDict();
	}
}
