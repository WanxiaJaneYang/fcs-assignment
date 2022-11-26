package week12;

public class Seat {
	/**
	 * field
	 */
	protected int seatID;
	protected boolean isReserved;
	protected String passengerName;
	
	/**
	 * getters and setters
	 */
	public void setSeatID(int id) {
		seatID=id;
	}
	public int getSeatID() {
		return seatID;
	}
	
	public void setIsReserved(boolean isReserved) {
		this.isReserved=isReserved;
	}
	
	public boolean getIsReserved() {
		return isReserved;
	}
	
	public void setPassengerName(String passengerName) {
		this.passengerName=passengerName;
	}
	
	public String getPassengerName() {
		return passengerName;
	}
	
	/**
	 * constructors
	 */
	public Seat() {
		isReserved=false;
	}
	
	public Seat(int id) {
		seatID=id;
		isReserved=false;
	}
	
	public Seat(int id, String passengerName) {
		seatID=id;
		this.passengerName=passengerName;
		isReserved=true;
	}
}
