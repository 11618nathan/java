package 상속2;
//============================================
// 상속과 객체의 생성 !! 
//	-->  상속과 생성자의 호출과정 !! 
//============================================
class Car 
{
	private int carNo;		//차량번호 
	private int curSpeed;	//속도 
	public int getCurSpeed() {
		return curSpeed;
	}
	public void setCurSpeed(int curSpeed) {
		this.curSpeed = curSpeed;
	}
	public int getCarNo() {
		return carNo;
	}
	
	public Car() { System.out.println("Car()");   }
	public Car(int carNo)
	{
		this.carNo = carNo;
	}
	public void accel()     { curSpeed++;  }
	public void breaking() { curSpeed--;   } 
		
}
// Car클래스로 부터 상속 !! 
class Bus extends Car
{	
	private int lineNo;	
	
	private boolean bell; 
	
	public boolean isBell() {
		return bell;
	}
	public void setBell(boolean bell) {
		this.bell = bell;
	}
	public int getLineNo() {
		return lineNo;
	}

	public Bus( int carNo,  int lineNo ) 
	{
		//this.carNo = carNo;  // 여기서 초기화가 가능할까?? 
		// 1) protected 멤버로 변경하여 접근 가능하도록 한다.
		// 2) 부모 클래스의 생성자를 호출해서 전달하는 방법 !! 
		//  부모클래스의 생성자를 호출하는 방법 !! 
		super( carNo ); 
	
		this.lineNo = lineNo; 
		bell = false;	
		System.out.println("Bus( int lineNo ) ");
	}
	public void go(){} 
	public void stop(){}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus =  new Bus( 2580 ,4885); //  Bus객체 생성 !! 
		System.out.println(bus.getCarNo());
	}

}













