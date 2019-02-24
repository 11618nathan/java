
public class Cart 
{ 
	// �Ӽ� (�ʵ�)
	private String cartName = ""; // �̸� 
	private int cartSpeed    = 0 ;    // ���� �ӵ� 
	private int MAX_SPEED   = 100;	  // �ִ� �ӵ� 
	private int cartPrice     = 0 ;     // ���� 
	
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
