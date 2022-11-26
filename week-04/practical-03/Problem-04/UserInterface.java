import vehicles.*;
import vehicles.bicycles.*;
import java.util.*;

public class UserInterface{
	public static void main(String[] args){
		StoreBikes bikesInStore= new StoreBikes();
		bikesInStore.electricBikes = new ArrayList<>();
		bikesInStore.hibrids =new ArrayList<>();
		bikesInStore.mountainBikes= new ArrayList<>();
		bikesInStore.roadBikes = new ArrayList<>();
		//creata room to store four different bikes
		
		//create bicycles to test
		ElectricBike myElectricBike1=new ElectricBike();
		myElectricBike1.setColor("Yellow");
		myElectricBike1.setYear(2020);
		myElectricBike1.setNumberGears(3);
		myElectricBike1.setIsServiced(true);
		myElectricBike1.setInDate("20/02/2022");
		myElectricBike1.setOutDate("21/03/2022");
		myElectricBike1.setServiceResponsible("tyres changed");
		myElectricBike1.setBattery("Full");
		myElectricBike1.generateName();
		bikesInStore.electricBikes.add(myElectricBike1);
		
		MountainBike myMountainBike=new MountainBike();
		myMountainBike.setColor("Red");
		myMountainBike.setYear(2021);
		myMountainBike.setNumberGears(2);
		myMountainBike.setIsServiced(false);
		myMountainBike.setInDate("22/02/2022");
		myMountainBike.setOutDate("22/02/2022");
		myMountainBike.setServiceResponsible("tyres changed");
		myMountainBike.setSuspension("full suspension");
		myMountainBike.setForks("XC forks");
		myMountainBike.generateName();
		bikesInStore.mountainBikes.add(myMountainBike);

		RoadBike myRoadBike =new RoadBike();
		myRoadBike.setTyres("Schwabe Marathon");
		myRoadBike.setColor("Red");
		myRoadBike.setYear(2021);
		myRoadBike.setNumberGears(2);
		myRoadBike.setIsServiced(false);
		myRoadBike.setInDate("22/02/2022");
		myRoadBike.setOutDate("22/02/2022");
		myRoadBike.setServiceResponsible("tyres changed");
		myRoadBike.generateName();
		bikesInStore.roadBikes.add(myRoadBike);

		Hibrid myHibrid =new Hibrid();
		myHibrid.setSuspension("full suspension");
		myHibrid.setColor("Red");
		myHibrid.setYear(2021);
		myHibrid.setNumberGears(2);
		myHibrid.setIsServiced(false);
		myHibrid.setInDate("22/02/2022");
		myHibrid.setOutDate("22/02/2022");
		myHibrid.setServiceResponsible("tyres changed");
		myHibrid.generateName();
		bikesInStore.hibrids.add(myHibrid);
		//creation ended
		
		start();
		//print the welcome line
 
		int option=askTypeOfBike();
		switch (option){
			case(1):
				printElectricBikes(bikesInStore.electricBikes);
				break;
			case(2):
				printMountainBikes(bikesInStore.mountainBikes);
				break;
			case(3):
				printRoadBikes(bikesInStore.roadBikes);
				break;
			case(4):
				printHibridBikes(bikesInStore.hibrids);
				break;
		}//print all the bikes according to user input
	}



	public static void printElectricBikes(ArrayList<ElectricBike> electricBikes){
		for(int i=0; i<electricBikes.size(); i++){
			System.out.println("--------------------------------------");
			electricBikes.get(i).printInformation();
			System.out.println("--------------------------------------");
		}
	}
	//print the electricbike arraylist
	
	public static void printHibridBikes(ArrayList<Hibrid> hibrids){
		for(int i=0; i<hibrids.size(); i++){
			System.out.println("--------------------------------------");
			hibrids.get(i).printInformation();
			System.out.println("--------------------------------------");
		}
	}
	//print the hibridBike arraylist

	public static void printMountainBikes(ArrayList<MountainBike> mountainBikes){
		for(int i=0; i<mountainBikes.size(); i++){
			System.out.println("--------------------------------------");
			mountainBikes.get(i).printInformation();
			System.out.println("--------------------------------------");
		}
	}
	//print the mountainBike arraylist	

	public static void printRoadBikes(ArrayList<RoadBike> roadBikes){
		for(int i=0; i<roadBikes.size(); i++){
			System.out.println("--------------------------------------");
			roadBikes.get(i).printInformation();
			System.out.println("--------------------------------------");
		}
	}
	//print the road bike arraylist



	public static void start(){
		System.out.println("Welcom Dear User:");
	}
	//welcome print

	public static int askTypeOfBike(){
		int opt=0;
		Scanner input= new Scanner(System.in);
		do{
			System.out.println("Here are the four kinds of bicycles we have in the store:");
			System.out.println("1. Electrical bikes 2.Mountain bikes 3.Road bikes 4.Hibrids ");
			if(!input.hasNextInt()){
				System.out.println("Invalid Input, please choose again.");
				input.next();
			}else{
				opt=input.nextInt();
				if((opt>4)||(opt<1)){
					System.out.println("Wrong number, please enter again.");
					opt=0;
				}
			}
		}while(opt==0);
		return opt;
	}
	//ask the user the type of bikes
}
