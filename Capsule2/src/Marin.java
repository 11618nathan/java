
public class Marin
{   // 속성 ( 필드) 
	// 인스턴스 필드 :  객체마다 1개씩 생성되는 필드 !! 
	private int curhp;	// 현재 체력 !! 
	private int kills;
	// 정적(static) 필드 :  클래스당 1개만 만들어지는 피드 
	private static final int maxHp = 50;  // 최대 체력 !! 
	private static int att   = 6; 
	private static int def   = 0;	
	private static int range = 6;	// 사거리 
	private static final int price = 50;	// 가격 
	// 클래스가 로딩될때 1번 호출되서 초기화해주는 메서드 ! 
	static   // 스태틱 블럭 static block !! 
	{
		att = 6; 
		def = 0;
		range = 6;
		System.out.println("static {} 호출 !! ");
	}
	
	// 생성자 :  객체가 생성될때 자동으로 호출 !! 
	public Marin() 
	{
		curhp  = 50; 
		kills   = 0;
		System.out.println("Marin() 호출 !! ");
	}

	public void showUpgrade()
	{
		System.out.println( att +" : "+def +" : "+ range   );
	
	}

    public static void attUp() 
    {
    	if(att < 9)
    	att++;
    }
	public static void defUp()
	{
		if(def <3)
			def++;
	}
	public static void rangeUp() 
	{
		if(range == 6)
		 range +=2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
