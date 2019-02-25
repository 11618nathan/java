
public class Pride  // kia !!  
{	// final == const  --> 상수화 !! 
	// 상수 필드 : 초기화 이후 절대 값을 변경시킬수 없는 피드 !! 
	
	// 정적(static) 필드 :  객체들사이에서 같은 값을 갖는 필드 !! 
	// 하나의 클래스로부터 만들어지는 모든 객체들이 같은 값을 갖고 
	// 공유해서 함께 사용해야하는 필드 !! 
	// --> 클래스당 1개만 생성된다 !! 
	
	private int carNo; 
	private int curSpeed;  // 현재 속도 !! 
	private static final int maxSpeed = 180; // 최대 속도 !! 
	private int price;	   // 가격 
	private static final int cc = 1400;		   // 배기량 
	private int curFuel;    // 현재 연료량 
	private static final int maxFuel = 50;	   // 최대 연료량 !! 
	
	public Pride(int no) 
	{
		carNo = no; 
		curSpeed = 0; 
		price *=1.1; 
		curFuel = maxFuel/2;
	}
	
}
