public class ServiceCenter {
	private WaitingList awl;

	public ServiceCenter() {
		this.awl = new WaitingList();
	}

	/**
	* Record patient's data and add the patient into waiting list
	* @param name
	* @param phoneNumber
	* @param triageLevel
	* @param location
	 */
	public void addPatientIntoList(String name, String phoneNumber, int triageLevel, String location) {
		Patient patient = new Patient(name, phoneNumber, triageLevel, location);
		if(this.awl.isInList(patient)){
			System.out.println(patient.getName() + " is in waiting list. ");
		}else{
			this.awl.addToList(patient);
			System.out.println("Add " + patient.getName() + " into waiting list. ");
		}
	}

	/**
	* Pop out the first patient in the waiting list and assign an Ambulance for him/her
	* @return the patient object
	*/
	public Patient assignAmbulanceForPatient() {
		Patient patient = this.awl.popPatient();
		if(patient!=null) {
			System.out.println("Assigned an ambulance for patient: " + patient.getName());
		}
		return patient;
	}

	/**
	* Print out the waiting list
	*/
	public void printWaitingList(){
		this.awl.printList();
	}
    
	/**
	* assign ambulance by patient id
	* @throws PatientNotFoundException 
	* @throws EmptyListException 
	*/
	public Patient assignAmbulanceByID(int id) throws PatientNotFoundException, EmptyListException {
		Patient patient=this.awl.popPatientByID(id);
		if(patient!=null) {
			System.out.println(" Success! An ambulance as assigned for patient " + id+".");
		}
		return patient;
	}

	/**
	* print the position by patient id
	* @throws PatientNotFoundException 
	*/
	public void checkPositionByID(int id) throws PatientNotFoundException {
		int position=this.awl.getPositionByID(id);
		System.out.println(" There are " +position+" patients before patient " + id +".");		
	}
}
