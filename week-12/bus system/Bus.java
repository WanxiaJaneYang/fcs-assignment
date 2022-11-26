package week12;

public class Bus {
	int busID;
	boolean available;
	Seat[] seats;
	int numberOfSeatsAvailable;
	
	public Bus() {
		seats=new Seat[20];
		for(int i=0; i<20; i++) {
			seats[i]=new Seat();
			seats[i].setSeatID(i);
			seats[i].setIsReserved(false);
		}
		//instantiate all the seats
		
		numberOfSeatsAvailable=20;
		available=true;
	}
	
	public Bus(int id) {
		busID=id;
		seats=new Seat[20];
		numberOfSeatsAvailable=20;
		available=true;
		
		for(int i=0; i<20; i++) {
			seats[i]=new Seat();
			seats[i].setSeatID(i);
			seats[i].setIsReserved(false);
		}
		//instantiate all the seats
	}
	
	public Bus(int id, boolean available, Seat[] seats) {
		busID=id;
		this.available=available;
		this.seats=seats;
	}
	
	public void showInformation() {
		System.out.println("Bus ID: "+busID);
		System.out.println("Available or not: "+available);
		printSeats();
	}
	//method to print the bus information

	private void printSeats() {
		for(int i=0;i<20;i++) {			
			if(seats[i].getIsReserved()) {
				System.out.print(seats[i].getPassengerName()+" ");
			}else {
				System.out.print("Empty ");
			}
			
			if((i+1)%4==0) {
				System.out.println();
			}
		}		
	}
	//print all the seats in the bus, each line contains four seats
	
	public void makeReservation(String name) {
		for(Seat seat:seats) {
			if(!seat.isReserved) {
				System.out.println("Seat "+ seat.getSeatID()+" booked for you.");
				seat.setIsReserved(true);
				seat.setPassengerName(name);
				break;
			}
		}
		numberOfSeatsAvailable--;
		if(numberOfSeatsAvailable==0) {
			available=false;
		}
	}
	//method to book a seat in a bus
	
	public void cancelReservation(String name) {
		for(Seat seat:seats) {
			if(seat.getPassengerName().equals(name)) {
				System.out.println("Your reservation of seat "+ seat.getSeatID()+" is cancelled.");
				seat.setIsReserved(false);
				seat.setPassengerName(null);
				break;
			}else {
				System.out.println("Passenger name not found!");
			}
		}
		numberOfSeatsAvailable++;
		available=true;
	}
	//method to cancel a reservation
}
