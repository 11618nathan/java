//===============================================
//  금강대학교학생은 
//  컴퓨터 학생과 불교학과 학생을 구분한다.. 
//  둘다 공부를 하는데... 각각 불경공부와 코딩을 한다. 
//===============================================
//  그림판에서 그릴수 있는 도형은... 
//  사각형, 원, 직선이다..  
//===============================================
//  CGV극장에는 
//  VIP 회원 비회원이 예매를 할수 있고... 
//  - VIP는 10%로 할인과 20%를 마일리지 적립 
//	- 회원은 10%로 마일리지 적입 
//	- 비회원은 짤없다.
//===============================================
//  동물원에는... 
//  -  사파리, 수족관, 케이지(새장)이 있다... 
//===============================================




//===============================================
// Method Overriding ( 메소드 재정의) 
//	 - Overloading VS Overriding !! 
//     - 오버로딩 : 같은 이름의 메소드를 여러개 존재
//		  		   단, 매개변수정보(갯수,타입)이 달라야한다. 
//	 - Overriding ( 재정의) 
//		- 부모클래스에서 정의된 메소드를 자식클래스에서 새롭게 정의 !!
//		- 부모의 행동을 그대로 물려받지 않고 자식의 행동을 다시 정의 !! 
//		- 자식의 행동을 자식클래스에서 구체화 !! 
//===============================================
class Animal 
{
	private int age; 
	
	public void Crying() { System.out.println(" 하고 울다");}
}
class Cat extends Animal
{
	public void Crying() { 
		System.out.println("야옹~~"); 
		super.Crying();  //  
	}
}
//=====================================================
class Emp 
{
	private int empNo; 
	
	public void work() {System.out.println("열심히 일을 합니다.")} 
	public void getSalary(){}
}
class NormalEmp extends Emp 
{
	private int salary;	// 연봉 !! 
	
	public void work() 
	{ 
		System.out.print("주 40시간 동안 "); 
		super.work(); 
	}
	public void getSalary(){System.out.println(salary/13); }
	
}
class PartTimeEmp extends Emp 
{	
	private int time; 
	private int wage;
	
	public void work() 
	{
		System.out.println(time + "시간 동안");
		super.work();
	}
	public void getSalary(){System.out.println( time * wage );}
	
	
}

class Unit
{
	private int hp; //체력!! 
	private int x;
	private int y;	
	
	public void move( int newX, int newY ) 
	{
		x = newX;
		y = newY;
	} 
	public void attack() {} //?? 
}

class Marin extends Unit
{
	public void move(int newX,  int newY)
	{
		System.out.println("GOGOGO~~"); 
		super.move(newX, newY);
	}
	public void attack() {System.out.println("따따따따따따");} 
	
}

class Tank extends Unit
{
	public boolean bSiege = false;
	
	@Override
	public void move( int newX,  int newY)
	{
		System.out.println("옛썰 ~~ ");
		super.move(newX, newY);
	}
	@Override
	public void attack() 
	{
		if(bSiege)
			System.out.println("꽝~~ 3초대기  꽝 ~ 3초대기 ~");
		else 
			System.out.println("퉁퉁퉁~~~ 퉁퉁우투우우ㅜ~!");
	}
}	








public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.Crying();
	}

}










