import vehicles.*;
import vehicles.bicycles.*;

public class Test{
	public static void main(String[] args){
		Bicycle myBicycle= new Bicycle("yellow", 2020);
		myBicycle.setNumberGears(3);
		myBicycle.setIsServiced(true);
		myBicycle.setInDate("Feb 12nd, 2021");
		myBicycle.setOutDate("Feb 31st, 2021");
		myBicycle.setServiceResponsible("changing tyres.");
		myBicycle.checkoutService();
		System.out.printf("The bicycle is a %s one which was made in %d, its number of Gears is %.0f.\n ", myBicycle.getColor(), myBicycle.getYear(), myBicycle.getNumberGears());
		if (myBicycle.getIsServiced() ==true){
			System.out.printf("The bicycle is serviced.\n");
		}else{
			System.out.printf("The bicycle is not serviced.\n");
		}
		System.out.printf("The bicycle was in on %s and out on %s.\n ", myBicycle.getInDate(), myBicycle.getOutDate());
		System.out.printf("We are responsible for the service of: %s.\n", myBicycle.getServiceResponsible());
		myBicycle.changeGear(2);		
		myBicycle.checkBreak(3.4);
		myBicycle.printInformation();		
		//test for bicycle class

		ElectricBike myElectricBike = new ElectricBike();
		myElectricBike.setBattery("Full");
		myElectricBike.chargeBike();
		System.out.printf("The bicycle's battery is %s\n", myElectricBike.getBattery());
		myElectricBike.checkoutService();
		myElectricBike.generateName();
		System.out.println(myElectricBike.getName());
		myElectricBike.printInformation();		
		//test for ElectricBike;

		MountainBike myMountainBike=new MountainBike();
		myMountainBike.setSuspension("full suspension");
		myMountainBike.setForks("XC forks");
		System.out.printf("The bicycle's suspension is %s and its forks are %s\n", myMountainBike.getSuspension(), myMountainBike.getForks());
		myMountainBike.printInformation();
		//test for MountainBike

		RoadBike myRoadBike =new RoadBike();
		myRoadBike.setTyres("Schwabe Marathon");
		System.out.printf("The road bike's tyres are %s\n", myRoadBike.getTyres());
		myRoadBike.printInformation();
		//test for road bike
		
		Hibrid myHibrid =new Hibrid();
		myHibrid.setSuspension("full suspension");
		System.out.printf("The bicycle's suspension is %s\n", myHibrid.getSuspension());
		myHibrid.printInformation();
		//test for hibrid
	
		Bicycle[] bicycles =new Bicycle[4];
		bicycles[0]=new ElectricBike();
		bicycles[1]= new MountainBike();
		bicycles[2]=new RoadBike();
		bicycles[3]=new Hibrid();
		for(Bicycle bicycle : bicycles){
			bicycle.checkoutService();
		}
		//test for polymorphism
	}
}
