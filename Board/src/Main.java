import java.util.Scanner;

abstract class Util
{
	private String circle;
	private String line;
	private String square;
	
	public String getCircle() {
		return circle;
	}

	public abstract void setCircle();
	}

	public String getLine() {
		return line;
	}

	public abstract void setLine();

	public String getSquare() {
		return square;
	}

	public abstract void setSquare();

	public Util(String circle, String line, String square) {
		super();
		this.circle = circle;
		this.line = line;
		this.square = square;
	}
	
	public void show()
	{
		System.out.println("시작 좌표, 끝 좌표");
	}
}

class Draw extends Util
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

	public Draw(String circle, String line, String square, int x, int y) {
		super(circle, line, square);
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void show()
	{
		System.out.println(x);
		System.out.println(y);
	}

	@Override
	public void setCircle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSquare() {
		// TODO Auto-generated method stub
		
	}
}

class Erase extends Util
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

	public Erase(String circle, String line, String square, int x, int y) {
		super(circle, line, square);
		this.x = x;
		this.y = y;
	}

	@Override
	public void show()
	{
		System.out.println(x);
		System.out.println(y);
	}

	@Override
	public void setCircle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSquare() {
		// TODO Auto-generated method stub
		
	}
}

class Board
{
	private Util [] util;
	private Scanner scan = new Scanner(System.in);
	
	public Board(){
		util = new Util[10];
	}
	
	public void drawBoard()
	{
		Util newUtil = null;
		System.out.println("1. 그리기 		2. 지우기");
		
		int input = scan.nextInt();
		if(input == 1)
		{
			int start = scan.nextInt();
			newUtil = new Draw(x, y);
		}
		else if(input == 2){
	         //알바사원추가
	        int x = scan.nextInt();
	        int y = scan.nextInt();
	        newUtil = new Erase(x, y);
	    }
	    else{
	        System.out.println("※오류※");
	    }
	}
	
	public void showBoard()
	{
		for (Util util : util) {
			if(util != null)
				util.getshow();
		}
	}

	
	
}

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
