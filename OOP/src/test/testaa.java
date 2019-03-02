package test;

public class Person 
{
	// 속성, 필드, 멤버 변수 
	int age; 
	String name; 
	int weight;	// 체중 !! 
	
	public void birthday() //생일 
	{ 
		age++;
	}
	public void feeding(int value ) // 먹이 활동 !!
	{
		weight +=value;
	}
}

public class testaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person p = new Person();
        p.age = 0;
	}

}
