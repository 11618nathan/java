class Student 
{
	private int Sno;	     //�й� 
	private int Score;	// ���� 
	// get/set 
	public int getSno()   { return Sno; }
    public int getScore() { return Score;}
    public void setScore( String name,  int newScore ) 
    {
    	if(name == "����")
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
		Person p =  new Person("�ڿ�", 20); // ��ü ���� !! 
		// �̸� : �ڿ�  ���� : 20
		
		
		
		System.out.println
		("�̸� : " + p.getName()  + "���� :" +p.getAge());
		
		
	}

}











