//================================================
//  this ����  
//	 - �޼ҵ带 ȣ���� ��ü�� ���� !! 
//	 - ȣ��� �޼ҵ尡 � ��ü�� ���ؼ� ȣ��Ǿ�����?? !! 
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
	// this : ��ü�� �ʵ忡 ���� �ϴ� Ű���� !
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
		// PointŬ������ ��ü !! 
		Point point1  =  new Point( 1,2); //??
		Point point2  =  new Point( 3,4); //??
		System.out.println( point1 ); 
		point1.show( point1 /* point1 */);
		
	}

}








