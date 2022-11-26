public class WaitingList {
	protected Node head;
	protected int numNodes;
    
	/**
	* default constructor
	*/
	public WaitingList(){
		this.head = null;
		this.numNodes = 0;
	}

	/**
	* This method will pop the first patient from the waiting list
	* @return the patient popped from the waiting list
	*/
	public Patient popPatient() {
		if(head==null) {
			return null;
		}else {
			Patient popped= head.getPatient();
			head=head.getNext();
			numNodes--;
			return popped;
		}
	}

	/**
	* This method will add patient into the waiting list according to the triage level
	* @param patient patient's data
	*/
	public void addToList(Patient patient) {
		Node node=new Node(patient);
		if(head==null) {
			head=node;
			//case of empty stack
		}else {
			Node temp=head;
			if(temp.getPatient().getTriageLevel()<patient.getTriageLevel()) {
				node.setNext(temp);
				head=node;
				//case of top priority
			}else {
				while(temp.getNext()!=null){
					if(temp.getNext().getPatient().getTriageLevel()<patient.getTriageLevel()) {
						node.setNext(temp.getNext());
						temp.setNext(node);       						
						break;
					}else {
						temp=temp.getNext();
					}       				
				}
				temp.setNext(node);
			}
		}
		numNodes++;
	}

	/**
	* print out the information for each patient in waiting list
	*/
	public void printList() {
		if (this.head == null) {
			System.out.println("No Patient Waiting!");
		}
		Node temp = this.head;
		while(temp != null) {
			temp.printNode();
			temp = temp.getNext();
		}
	}

	/**
	* Check whether the patient is in this list or not
	* @return if patient is in the waiting list
	*/
	public boolean isInList(Patient patient) {
		if (this.head == null) {
			return false;
		}
		Node temp = this.head;
		while(temp != null) {
			if(temp.getPatient().getName().equals(patient.getName())&& temp.getPatient().getPhoneNumber().equals(patient.getPhoneNumber())){
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}    
    
	/**
	* Check whether the list is empty
	*/
	public boolean isEmpty() {
		return head==null?true:false;
	}

	/**
	* pop patient according to the patient id
	* @throws EmptyListException 
	*/
	public Patient popPatientByID(int id) throws PatientNotFoundException, EmptyListException {
		Patient patient=null;
		boolean isFound=false;
		if(head==null) {
			throw new EmptyListException("Empty List");
		}else {
			Node temp=head;
			if(temp.getPatient().getId()==id) {
				patient=temp.getPatient();
				this.popPatient();
				return patient;
			}else if(temp.getNext()==null) {
				throw new PatientNotFoundException("Only patient doesnt match");
			}
			while(temp.getNext()!=null) {
				if(temp.getNext().getPatient().getId()==id) {
					patient=temp.getNext().getPatient();
					temp.setNext(temp.getNext().getNext());
					isFound=true;
					break;
				}else {
					temp=temp.getNext();
				}
			}	
		}
		if(!isFound) {
			throw new PatientNotFoundException();
		}
		return patient;
	}

	/**
	* get number of patients lining before according to patient id
	*/
	public int getPositionByID(int id) throws PatientNotFoundException{
		int count=0;
		if(head==null) {
			throw new PatientNotFoundException();
		}else {
			Node temp=head;
			if(temp.getNext()==null) {
				if(temp.getPatient().getId()!=id) {
					throw new PatientNotFoundException();
				}
			}
			while(temp.getNext()!=null) {
				if(temp.getPatient().getId()==id) {
					break;
				}else {
					temp=temp.getNext();
					count++;
				}
			}	
		}
		return count;
	}
}
