package ���2;
//============================================
// ��Ӱ� ��ü�� ���� !! 
//	-->  ��Ӱ� �������� ȣ����� !! 
//============================================
class Car 
{
	private int carNo;		//������ȣ 
	private int curSpeed;	//�ӵ� 
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
// CarŬ������ ���� ��� !! 
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
		//this.carNo = carNo;  // ���⼭ �ʱ�ȭ�� �����ұ�?? 
		// 1) protected ����� �����Ͽ� ���� �����ϵ��� �Ѵ�.
		// 2) �θ� Ŭ������ �����ڸ� ȣ���ؼ� �����ϴ� ��� !! 
		//  �θ�Ŭ������ �����ڸ� ȣ���ϴ� ��� !! 
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
		Bus bus =  new Bus( 2580 ,4885); //  Bus��ü ���� !! 
		System.out.println(bus.getCarNo());
	}

}













