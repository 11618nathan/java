//  public  :  ��𼭵� ������ ������ �����.... 
//  private :  �ܺο��� ���� �����Ҽ� ���� �����... 
//  protected : �ڽ� + �ڽ� Ŭ���������� ���ٰ��� (���) 
import test.*;
class Person
{	// �Ӽ� ( �ʵ� ) 
	private String name; // �̸�  
	private int age;		 // ���� 
	private int weight;	 // ü�� 
	private String nickName;
	// get/set ���� �����ϴ� �Լ��� ���� ����... 
	public String getName() 
	{ 
		return name;
	}
	public String getNickname() 
	{
		return nickName;
	}
	public void setNickname(String newName)
	{
		nickName = newName;
	}
	public void Sleeping(){  }
}

public class OOP2 {

	public static void main(String[] args) 
	{
		Person person = new Person(); 
		System.out.println( person.getName());  
	
	

		
	}

}










