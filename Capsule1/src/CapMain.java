class Student 
{
	private int Sno;	     //학번 
	private int Score;	// 점수 
	// get/set 
	public int getSno()   { return Sno; }
    public int getScore() { return Score;}
    public void setScore( String name,  int newScore ) 
    {
    	if(name == "교수")
    	{
    		if( newScore >=0 &&newScore <=100)
    			Score = newScore;
    
    	}
    }

}

class StudentScore
{
	private int Sno; 
	private int c; 
	private int java;
	private int data;
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getSno() {
		return Sno;
	} 
}

public class CapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p =  new Person("자연", 20); // 객체 생성 !! 
		// 이름 : 자연  나이 : 20
		
		
		
		System.out.println
		("이름 : " + p.getName()  + "나이 :" +p.getAge());
		
		
	}

}











