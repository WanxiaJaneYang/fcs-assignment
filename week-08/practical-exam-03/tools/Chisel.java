//==================================
// Foundations of Computer Science
// Student: Wanxia Yang
// id: a1866893
// Semester:s1
// Year:2022
// Practical Exam Number:03
//===================================

public class Chisel extends HandTool{
	public void useTool(int time){
		System.out.println("Scrape");
		while(time>0){
			value=value-0.02f;
			time--;
		}
		value=value<0?0:value;
	}
	//method of use tool
	
	public Chisel(){
	}
	//default constructor
	
	public Chisel(float weight, float value){
		super(weight, value, true);
	}
	//constructor with three parameters
}
