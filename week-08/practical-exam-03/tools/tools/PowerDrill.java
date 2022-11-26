//==================================
// Foundations of Computer Science
// Student: Wanxia Yang
// id: a1866893
// Semester:s1
// Year:2022
// Practical Exam Number:03
//===================================

public class PowerDrill extends PowerTool{
	public void useTool(int time){
		System.out.println("Zssh!");
		while(time>0){
			value=value-0.03f;
			time--;
		}
		value=value<0?0:value;
	}
	//method of use tool

	public PowerDrill(){
	}
	//default constructor

	public PowerDrill(float weight, float value){
		super(weight, value, 800);
	}
	//constructor with three parameters
}
