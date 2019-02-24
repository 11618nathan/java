
public class Order
{ 
	private static int orderCount = 0;
	private final int orderNo 	= orderCount++;	        // 주문번호 
	private final Member customer = null ;   // 주문자 
	private final int pcode = 	0 ;			    // 상품번호  
	private String addr;							// 주소 
		
	
	public Order() 
	{	
		System.out.println( orderNo );
	}
	
	
}
