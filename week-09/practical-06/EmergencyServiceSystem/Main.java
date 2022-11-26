import java.util.Scanner;

public class Main {
	/**
	* initialize data to the serviceCenter, terminate the system if data is wrong
	* @param serviceCenter
	*/
	public static void initializeSystem(ServiceCenter serviceCenter){
        	String[] name = {"Tod", "David", "Dave", "Roy", "Megan"};
        	String[] phoneNumbers = {"0410333222", "0410333223", "0410333224",  "0410333225", "0410333226"};
        	int[] triageLevel = {1,5,2,4,3};
        	String[] location={"King William ST", "North Terrace", "Grote St", "Gouger St", "Melbourne St"};
        	// Check the length for each array is equal
        	if(!(name.length == phoneNumbers.length && name.length == location.length && name.length == triageLevel.length)){
            		System.out.println("Failed to initialize data.");
            		return;
        	}
        	// Initialize data into service center
        	for(int i=0; i<name.length; i++){
            		serviceCenter.addPatientIntoList(name[i], phoneNumbers[i], triageLevel[i], location[i]);
        	}

    	}
    
	/**
	* method to clear the screen
	*/
	public static void clearScreen() {
        	System.out.print("\033[H\033[2J");
        	System.out.flush();
    	}
    
	/**
	* method to get the header as String
	*/
	public static String getHeader(boolean toPrint){
        	String ans = "\n\n\n";
        	ans += "===============================================================================" + "\n";
        	ans += ":: Emergency Service Center                                                  ::" + "\n";
        	ans += "===============================================================================" + "\n";
        	if(toPrint)
            		System.out.println(ans);
        	return ans;
	}
    
	/**
	* method to print subHeader
	*/
	public static void printSubHeader(String subHeader){
		getHeader(true);
		String str = ":: " + subHeader + "\n";
		System.out.println(str);
	}
    
	/**
	* method to print Screen Message
	*/
	public static void printScreenMessage(String message){
        	String ans = getHeader(false) + "\n\n";
        	ans += "::            " + message + "\n\n";
        	System.out.println(ans);
	}
    
	/**
	* method to clear the screen and print exit message
	*/
	public static void exitMessage(){
        	clearScreen();
        	printScreenMessage("Thank you!!");
	}
    
	/**
	* method to print the value
	*/
	public static void displayMenu(){
        	String ans = getHeader(false);
        	ans += ":: Options:                                                                  ::" + "\n";
        	ans += ":: 1. Add Patient                                                            ::" + "\n";
        	ans += ":: 2. Assign Ambulance For Patient                                           ::" + "\n";
        	ans += ":: 3. Assign Ambulance For Patient By ID                                     ::" + "\n";
        	ans += ":: 4. Check Position By ID                                                   ::" + "\n";
        	ans += ":: 5. Print Waiting List                                                     ::" + "\n";
        	ans += ":: 0. Exit                                                                   ::" + "\n";
        	ans += "===============================================================================" + "\n";
        	System.out.println(ans);
	}
    
	/**
	* method to get the user input for option
	*/
	public static int getOption(Scanner inputScan, int [] optionsAvailable){
        	String ans = ":: Your option: ";
        	System.out.println(ans);
        	String _input = inputScan.nextLine();
        	int _option = Integer.parseInt(_input);
        	for(int i = 0; i < optionsAvailable.length; i++)
            		if(_option == optionsAvailable[i])
                		return _option;
        	return -1;
    	}

	/**
	* method to print question and receive answer
	*/
	public static String getInput(Scanner inputScan, String question){
        	System.out.println(question);
        	String _input = inputScan.nextLine();
        	return _input;
	}

	/**
	* print while waiting for input
	*/
	public static void waitInput(Scanner scan){
        	String ans = "\n\n\n";
        	ans += "                        Press any key to continue . . .      " + "\n";
        	ans += "===============================================================================" + "\n";
        	System.out.println(ans);
        	scan.nextLine();
	}

	/**
	* try to receive the input one more time
	*/
	public static void tryAgain(Scanner scan){
		clearScreen();
		String ans = getHeader(false);
		ans += ":: Your input is invalid, please select ::" + "\n";
		ans += ":: a valid option.                      ::" + "\n";
		ans += "===============================================================================" + "\n";
		System.out.println(ans);
		waitInput(scan);
	}

	/**
	* method to perform the option's function 
	* @throws EmptyListException 
	*/
	public static boolean performAction(ServiceCenter serviceCenter, int _option, Scanner inputScan) throws EmptyListException, PatientNotFoundException{
		int id;
		switch(_option){
			case 1:
				clearScreen();
				printSubHeader("Add Patient");
				String name = getInput(inputScan, "Please enter the name of patient: ");
				String phoneNumber = getInput(inputScan, "Please enter the phoneNumber of patient: ");
				int triageLevel = getIntTriage(inputScan);
				String location = getInput(inputScan, "Please enter the location of patient: ");
				serviceCenter.addPatientIntoList(name, phoneNumber, triageLevel, location);
				waitInput(inputScan);
				break;
			case 2:
                		clearScreen();
                		printSubHeader("Assign Ambulance");
                		Patient patient=serviceCenter.assignAmbulanceForPatient();
                		if(patient==null) {
                			throw new EmptyListException();
                		}
                		waitInput(inputScan);
                		break;
            		case 3:
            			clearScreen();
            			printSubHeader("Assign Ambulance by Patient ID");
            			id=getIntID(inputScan);
            			serviceCenter.assignAmbulanceByID(id);
            			waitInput(inputScan);
            			break;
            		case 4:
            			clearScreen();
            			printSubHeader("Check Position By Patient ID");
            			id=getIntID(inputScan);
            			serviceCenter.checkPositionByID(id);
            			waitInput(inputScan);
            			break;
            		case 5:
                		clearScreen();
                		printSubHeader("Waiting List");
                		serviceCenter.printWaitingList();
                		waitInput(inputScan);
                		break;
            		case 0:
                		exitMessage();
                		return false;
        	}
        	return true;
    	}
    
	/**
	* method to get the patient's id
	*/
	private static int getIntID(Scanner inputScan) {
		boolean isLegal=true;
		int id=0;
		do {
			try{
				id=Integer.parseInt(getInput(inputScan, "Please enter the patient ID: "));
			}catch(NumberFormatException e) {
			isLegal=false;
			System.out.println("Invalid input, please enter an integer:");
			}
		}while(!isLegal);
		return id;
	}

	/**
	* method to get the patient's triageLevel
	*/
	private static int getIntTriage(Scanner inputScan) {
		boolean isLegal=true;
		int triageLevel=0;
		do {
			try{
				triageLevel=Integer.parseInt(getInput(inputScan, "Please enter the triage level of patient: "));
			}catch(NumberFormatException e) {
			isLegal=false;
			System.out.println("Invalid input, please enter an integer:");
    			}
    			if((triageLevel<1)||(triageLevel>5)) {
				isLegal=false;
			}
		}while(!isLegal);
		return triageLevel;
	}

	public static void main(String[] args) {
        ServiceCenter serviceCenter = new ServiceCenter();
        initializeSystem(serviceCenter);
        Scanner inputScan = new Scanner(System.in);
        int [] options = new int []{1,2,3,4,5,0};
        boolean _continue = true;
        while(_continue){
            clearScreen();
            displayMenu();
            int _option = getOption(inputScan, options);
            if(_option != -1)
				try {
					_continue = performAction(serviceCenter, _option, inputScan);
				} catch (EmptyListException e) {
					System.out.println("Error! The waiting list is empty.");
					waitInput(inputScan);
				} catch (PatientNotFoundException e) {
					System.out.println("Patient not found!");
					waitInput(inputScan);
				}
			else
                tryAgain(inputScan);
        }
    }
}
