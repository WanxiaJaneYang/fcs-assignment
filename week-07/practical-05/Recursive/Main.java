import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	private static final String regex="([0-9+])(\\[[a-zA-Z]+\\])";
	private static final Pattern regexCompile=Pattern.compile(regex);
	//create the compiled regex out of the recursive method to avoid stack overflow

	public static void main(String[] args) {
		int num=10;
		System.out.printf("The next happy number after %d is %d\n", num, nextHappyNum(num));
		//test of next happy number method
		String coded ="3[b2[ca]1[d]] ";
		System.out.printf("Coded String:%s\nDecoded String:%s\n", coded, decodeString(coded));
		//test of decode string method
	}
	//main funtion 
	
	public static int nextHappyNum(int num) {
		if(isHappyNumber(num+1)) {
			return num+1;
		}else {
			num++;
			return nextHappyNum(num);
		}
	}
	//recursive method to get the next happy num
	
	private static boolean isHappyNumber(int num) {
		boolean result=true;
		boolean isRepeated=false;
		ArrayList<Integer> records=new ArrayList<>();
		//to store the variables
		
		while(num!=1) {
			num=calculateByDigit(num);
			for(Integer record:records) {
				if(num==record.intValue()) {
					isRepeated=true;
					result=false;
					break;
					//break the for loop, set the result as false when the result repeats itself
				}
			}
			if(!isRepeated) {
				records.add((Integer)num);
				//add new number into records
			}else {
				break;
				//break the while loop when the sum begins to repeat
			}			
		}
		//repeatedly calculate the sum, break when get the result
		return result;
	}
	//method to judge if the number is a happy number
	
	private static int calculateByDigit(int num) {
		int sum=0;
		int totalDigit=(int) Math.log10(num)+1;
		int[] digits=new int[totalDigit];
		for(int index=0, d=totalDigit-1; d>=0; d--, index++) {
			digits[index]=num/(int)Math.pow(10, d);
			num=num%(int)Math.pow(10, d);
		}
		//get the each digit of the number
		
		for(int digit: digits) {
				sum+=(int)Math.pow(digit,2);
		}
		return sum;
		//calculate the sum
	}
	//method to calculate the sum of each digit's square
	
	public static String decodeString(String s) {
		Matcher matcher =regexCompile.matcher(s);
		//patter of number and [characters] like 2[ab]
		if(matcher.find()) {
			String found=matcher.group();
			int number = Integer.parseInt(matcher.group(1));
			String charactersPart= matcher.group(2);
			//get the match part and parse it 
			String decodedCharactersPart=charactersPart.substring(1, charactersPart.length()-1);
			decodedCharactersPart=multiplyString(decodedCharactersPart, number);
			s=s.replace(found, decodedCharactersPart);
			return decodeString(s);
			//if found the match part, replace with decoded part, i.e. 2[ab] replaced as abab
		}else {
			return s;
		}
	}
	//method to decode string

	private static String multiplyString(String a, int b) {
		String result="";
		for(int i=0; i<b; i++) {
			result=result+a;
		}
		return result;
	}
	//method to copy the string several times and merge into a new one
}

