import java.util.Scanner;

class Figure
{
	// �ʵ�
	private int area; 	  // ����
	private String color; // ����
	
	
	// ������
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
	public static int figureCount = 0;	// ���� ī��Ʈ ����
	
	private static Figure[] figures = new Figure[10];
	
	public void addFigure()
	{
		Figure newFigure = null;
		System.out.println("� ������ �߰��Ͻðڽ��ϱ�?");
		System.out.println("1.��  2.�ﰢ�� 3. �簢��");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		System.out.println("������ ���̴�?");
		int area = scan.nextInt();
		
		System.out.println("������ ������");
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
			System.out.println("����!");
		
		// Figures �迭�� null�� ���� ã�Ƽ� ���� !!
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
		System.out.println("������ ������ �ε����� �Է��ϼ���.");
		int index = scan.nextInt();
		
		if(figures[index] != null)
		{
			figures[index] = null;
			figureCount--;
		}
		else
			System.out.println("�̹� ����ִ� �ε����Դϴ�.");
	}
	
	public void showFigure()
	{
		for (Figure figure : figures) 
		{
			if(figure!=null)
			{
				System.out.println("���� : " + figure.getArea() + "/ ����: " + figure.getColor() );
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
			System.out.println("�������������������������׸��Ǧ���������������������");
			System.out.println("1. �����߰�");
			System.out.println("2. ��������");
			System.out.println("3. ���������ȸ");
			System.out.println("0. ����");
			System.out.println("����������������������������������������������������������");
			
			int input = scan.nextInt();
			
			switch(input)
			{
			case 1: ;break;
			case 2: ;break;
			case 3: ;break;
			case 0: ;
			default: System.out.println("�Է°� ����");break;
			}
			
		}
		
	}

}
