
public class Cart 
{ 
	// 속성 (필드)
	private String cartName = ""; // 이름 
	private int cartSpeed    = 0 ;    // 현재 속도 
	private int MAX_SPEED   = 100;	  // 최대 속도 
	private int cartPrice     = 0 ;     // 가격 
	
	public int getCartSpeed() {
		return cartSpeed;
	}
	
	public void setCartSpeed(int cartSpeed)
	{
		if( cartSpeed > 0 && cartSpeed <=MAX_SPEED )
		this.cartSpeed = cartSpeed;
	}
	public String getCartName() {
		return cartName;
	}
	public int getCartPrice() {
		return cartPrice;
	}
	
	public Cart(){} 
	
	public Cart( String name , int speed , int price) 
	{
			cartName = name;
			cartSpeed = speed; 
			cartPrice = price;
	}
}
