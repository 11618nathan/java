package test;

public class Person 
{
	// �Ӽ�, �ʵ�, ��� ���� 
	int age; 
	String name; 
	int weight;	// ü�� !! 
	
	public void birthday() //���� 
	{ 
		age++;
	}
	public void feeding(int value ) // ���� Ȱ�� !!
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
