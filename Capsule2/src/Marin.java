
public class Marin
{   // �Ӽ� ( �ʵ�) 
	// �ν��Ͻ� �ʵ� :  ��ü���� 1���� �����Ǵ� �ʵ� !! 
	private int curhp;	// ���� ü�� !! 
	private int kills;
	// ����(static) �ʵ� :  Ŭ������ 1���� ��������� �ǵ� 
	private static final int maxHp = 50;  // �ִ� ü�� !! 
	private static int att   = 6; 
	private static int def   = 0;	
	private static int range = 6;	// ��Ÿ� 
	private static final int price = 50;	// ���� 
	// Ŭ������ �ε��ɶ� 1�� ȣ��Ǽ� �ʱ�ȭ���ִ� �޼��� ! 
	static   // ����ƽ �� static block !! 
	{
		att = 6; 
		def = 0;
		range = 6;
		System.out.println("static {} ȣ�� !! ");
	}
	
	// ������ :  ��ü�� �����ɶ� �ڵ����� ȣ�� !! 
	public Marin() 
	{
		curhp  = 50; 
		kills   = 0;
		System.out.println("Marin() ȣ�� !! ");
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
