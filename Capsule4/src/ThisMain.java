//================================================
//  this 개념  
//	 - 메소드를 호출한 객체의 참조 !! 
//	 - 호출된 메소드가 어떤 객체에 의해서 호출되었느냐?? !! 
//================================================
class Point 
{
	private int x; 
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	} 

	public Point() {} 
	public Point(int x,  int y)
	{
	// this : 객체의 필드에 접근 하는 키워드 !
		this.x = x; 
		this.y = y;
	}
	/*public void show( Point this) 
	{
		System.out.println("x : " + this.x + " y : " +  this.y);
	}
	public void show( Point pthis) 
	{
		System.out.println("x : " + pthis.x + " y : " + pthis.y);
	}*/
	public void show( Point pthis /*Point this*/ ) 
	{
		System.out.println(this);
		System.out.println(pthis);
		
	}
	public static void SHOW() 
	{
		System.out.println(this);
	}
}
public class ThisMain {
	public static void main(String[] args) {
		// Point클래스의 객체 !! 
		Point point1  =  new Point( 1,2); //??
		Point point2  =  new Point( 3,4); //??
		System.out.println( point1 ); 
		point1.show( point1 /* point1 */);
		
	}

}








