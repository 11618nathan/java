
public class Order
{ 
	private static int orderCount = 0;
	private final int orderNo 	= orderCount++;	        // �ֹ���ȣ 
	private final Member customer = null ;   // �ֹ��� 
	private final int pcode = 	0 ;			    // ��ǰ��ȣ  
	private String addr;							// �ּ� 
		
	
	public Order() 
	{	
		System.out.println( orderNo );
	}
	
	
}
