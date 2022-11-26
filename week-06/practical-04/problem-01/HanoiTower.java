//==================================
// Foundations of Computer Science
// Student: Wanxia Yang
// id: a1866893
// Semester:s1
// Year:2022
// Practical Number:04 partII
//===================================

import java.util.*;

public class HanoiTower{
	public static ArrayList<Integer> pole1;
	public static ArrayList<Integer> pole2;
	public static ArrayList<Integer> pole3;
	public static int numberOfDisc;
	//set the attribute

	public HanoiTower(){
		numberOfDisc=3;
		pole1=new ArrayList<>();
		pole2=new ArrayList<>();
		pole3=new ArrayList<>();
		//instantiate the three poles and set the default number of discs

		System.out.print("The discs in pole1 are ");
		for(int i=1; i<=numberOfDisc ; i++){
			pole1.add(i);
			System.out.print("Disc"+pole1.get(i-1));	
		}
		System.out.println("");
		//print the discs on pole1
	}
	//constructor without parameters
	
	public HanoiTower(int tempDisc){
		numberOfDisc=tempDisc;
		pole1=new ArrayList<>();
		pole2=new ArrayList<>();
		pole3=new ArrayList<>();
		//instantiate the three poles and set the  number of discs

		System.out.print("The discs in pole1 are ");
		for(int i=1; i<=numberOfDisc ; i++){
			pole1.add(i);
			System.out.print("Disc"+pole1.get(i-1));		
		}
		System.out.println("");
		//print the discs on pole1
	}
	//constructor with a paramete
	
	public static void move(ArrayList<Integer> sourcePole, ArrayList<Integer> destinationPole){
		int source=0;
		int destination=0;
		//set the variables need

		int n=sourcePole.get(0);
		sourcePole.remove(0);
		destinationPole.add(0,n);
		//move the disc

		if(sourcePole==pole1){
			source=1;
		}else if(sourcePole==pole2){
			source=2;
		}else if(sourcePole==pole3){
			source=3;
		}
		if(destinationPole==pole1){
			destination=1;
		}else if(destinationPole==pole2){
			destination=2;
		}else if(destinationPole==pole3){
			destination=3;
		}
		System.out.printf("Move disc%d from pole%d to pole%d\n", n,source, destination);
		//print the move
	}
	//write the method to move a disc and print it
	
	public void solve(int numberOfDisc, ArrayList<Integer> sourcePole, ArrayList<Integer> auxiliaryPole, ArrayList<Integer> destinationPole){
		if(numberOfDisc==1){
			move(sourcePole, destinationPole);
		}else{
			solve(numberOfDisc-1, sourcePole, destinationPole, auxiliaryPole);
			//use the auxiliary pole as destination pole and solve the problem

			move(sourcePole, destinationPole);
			//move the biggest disc from source pole to destination pole
			
			solve(numberOfDisc-1, auxiliaryPole, sourcePole, destinationPole);
			//use the auxiliary pole as source pole and move the rest to the destination pole			
		}
	}
	//the method to solve
	
	public void automaticSolve(){
		solve(numberOfDisc, pole1, pole2, pole3);
	}
	//write a method to automatic solve
}
