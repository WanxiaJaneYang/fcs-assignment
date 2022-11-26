public class Node {
	protected Node next;
	protected Patient patient;
	

	public Node(Patient patient) {
		this.patient = patient;
		this.next = null;
	}
	//constructor

	public Node getNext() {
		return next;
	}
	//getter of next

	public void setNext(Node next) {
		this.next = next;
	}
	//setter of next

	public Patient getPatient() {
        	return patient;
    	}
	//getter of patient

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	//setter of patient

	public void printNode() {
		if(patient==null){
			System.out.println("No patient!");
		}else{	
			System.out.printf("Patient ID:%d\tPatient Name:%s\tPatient Triage Level:%d\n",patient.getId(), patient.getName(), patient.getTriageLevel());
		}
	}
	//method to print node
}

