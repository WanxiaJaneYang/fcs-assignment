public class Problem10{	
	public static void main(String[] args){

		String agent_message_01282 = "Who are you?";
		System.out.println(agent_message_01282);
		//print who are you		

		agent_message_01282 = "My name is, Bond...";
		System.out.println(agent_message_01282);
		//print My name is Bond
		
		agent_message_01282 = "James Bond";
		System.out.println(agent_message_01282);
		//print James Bond
	
		int agent_id = 007;
		agent_message_01282 = agent_message_01282 + "(00" + agent_id + ")";
		System.out.println(agent_message_01282);
		//print James Bond(007)
	}
}
