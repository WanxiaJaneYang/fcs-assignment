package week12;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class Menu {
	ArrayList<Bus> buses;
	
	public Menu() {
		buses=new ArrayList<>();
	}
	public void assemble() {
		instantiate();
		displayMenu();
		performFuncion(getUserOption(1,4));
	}
	private void instantiate() {
		// TODO Auto-generated method stub
		
	}
	public void displayMenu() {
		System.out.println("Welcome to bus reservation system!");
		System.out.println("1. Add a bus");
		System.out.println("2. Reservation");
		System.out.println("3. Show buses information");
		System.out.println("4. Exit");
		System.out.println("Enter your choice (a number)");
	}
	//method to display the menu
	
	public void performFuncion(int option) {
		switch(option) {
			case 1:
				clear();
				addBus();
				break;
			case 2:
				clear();
				reservationFunction();
				break;
			case 3:
				clear();
				for(Bus bus: buses) {
					bus.showInformation();
				}
				break;
			case 4:
				clear();
				System.out.println("Good Bye!");
				System.exit(0);
				break;
				
		}
	}
	//method to perform the four functions of the menu
	
	public void clear() {
		try {
			Robot r = new Robot();
			r.mousePress(InputEvent.BUTTON3_DOWN_MASK);       
			// press the right button of the mouse
	        r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);    
	        // release the right button of the mouse
	        r.keyPress(KeyEvent.VK_CONTROL);             
	        //press the Ctrl 
	        r.keyPress(KeyEvent.VK_R);                    
	        // press R
	        r.keyRelease(KeyEvent.VK_R);                  
	        // release R
	        r.keyRelease(KeyEvent.VK_CONTROL);            
	        // release Ctrl
	        r.delay(100); 
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}
	//clear screen for eclipse only
	
	private void reservationFunction() {
		System.out.println("Do you want:");
		System.out.println("1. make reservation");
		System.out.println("2. cancel reservation");
		int opt=getUserOption(1,2);
		switch(opt) {
			case 1:
				makeReservation();
				break;
			case 2:
				cancelReservation();
		}
		
	}

	private void cancelReservation() {
		// TODO Auto-generated method stub
		
	}
	private void makeReservation() {
		// TODO Auto-generated method stub
		
	}
	public void instantiateBus() {
		buses.add(new Bus(01));
	}
	
	public String getUserInput(String query, Scanner input) {
		System.out.println(query);
		String answer=input.nextLine();
		return answer;
	}
	
	public int getUserOption(int min, int max) {
		Scanner input= new Scanner(System.in);
		boolean isLegal=false;
		int option=0;
		do{
			String userInput=getUserInput("Please input your option", input);
			try {
				option=Integer.parseInt(userInput);
			}catch(NumberFormatException e) {
				System.out.println("Invalid input, please enter an integer");
				continue;
			}
			//check if the input is an integer
			
			if (option<=max && option>=min) {
				isLegal=true;
			}else {
				System.out.println("Invalid input, please enter an integer between 1 and 4");
			}
			//check if the input is within the range
		}while(!isLegal);
		
		try {
			System.in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return option;
	}
	//method to get an option between 1 and 4
	
	public void addBus() {
		
	}
}
