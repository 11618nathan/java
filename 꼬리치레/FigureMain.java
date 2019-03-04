import java.util.Scanner;

class Figure
{
	// 필드
	private int area; 	  // 넓이
	private String color; // 색깔
	
	
	// 생성자
	public Figure(int area, String color)
	{
		this.area = area;		
		this.color = color;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}
	
	
	
	
	
}

class Circle extends Figure
{

	public Circle(int area, String color) {
		super(area, color);
	}
	
}

class Triangle extends Figure
{

	public Triangle(int area, String color) {
		super(area, color);
	}
	
}

class Rectangle extends Figure
{

	public Rectangle(int area, String color) {
		super(area, color);
	}
	
}

class DrawingBoard
{
	public static int figureCount = 0;	// 도형 카운트 변수
	
	private static Figure[] figures = new Figure[10];
	
	public void addFigure()
	{
		Figure newFigure = null;
		System.out.println("어떤 도형을 추가하시겠습니까?");
		System.out.println("1.원  2.삼각형 3. 사각형");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		System.out.println("도형의 넓이는?");
		int area = scan.nextInt();
		
		System.out.println("도형의 색깔은");
		String color = scan.nextLine();
		
		if(input == 1)
		{
			newFigure = new Circle(area, color);
		}
		else if (input == 2)
		{
			newFigure = new Triangle(area, color);
		}
		else if( input == 3)
		{
			newFigure = new Rectangle(area, color);
		}
		else
			System.out.println("오류!");
		
		// Figures 배열에 null인 곳을 찾아서 삽입 !!
		for(int i = 0; i < figures.length; i++)
		{
			if(figures[i] == null)
			{
				figures[i] = newFigure;
				figureCount++;
				break;
			}
		}
	}
	
	public void delFigure()
	{
		Scanner scan = new Scanner(System.in);
		showFigure();
		System.out.println("삭제할 도형의 인덱스를 입력하세요.");
		int index = scan.nextInt();
		
		if(figures[index] != null)
		{
			figures[index] = null;
			figureCount--;
		}
		else
			System.out.println("이미 비어있는 인덱스입니다.");
	}
	
	public void showFigure()
	{
		for (Figure figure : figures) 
		{
			if(figure!=null)
			{
				System.out.println("넓이 : " + figure.getArea() + "/ 색깔: " + figure.getColor() );
			}
			
		}
	}
}

public class FigureMain 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("────────────그림판───────────");
			System.out.println("1. 도형추가");
			System.out.println("2. 도형삭제");
			System.out.println("3. 도형목록조회");
			System.out.println("0. 종료");
			System.out.println("─────────────────────────────");
			
			int input = scan.nextInt();
			
			switch(input)
			{
			case 1: ;break;
			case 2: ;break;
			case 3: ;break;
			case 0: ;
			default: System.out.println("입력값 오류");break;
			}
			
		}
		
	}

}
