//  public  :  어디서든 접근이 가능한 멤버들.... 
//  private :  외부에서 절대 접근할수 없는 멤버들... 
//  protected : 자신 + 자식 클래스에서만 접근가능 (상속) 
import test.*;
class Person
{	// 속성 ( 필드 ) 
	private String name; // 이름  
	private int age;		 // 나이 
	private int weight;	 // 체중 
	private String nickName;
	// get/set 으로 시작하는 함수를 만들어서 노출... 
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










