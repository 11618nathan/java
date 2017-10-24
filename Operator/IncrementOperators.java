package operator;

public class IncrementOperators 
{
	public static void main(String[] args)
	{
		int x = 11618;
	
		// ++피연산자 - 수행 전 +1
		++x;
		System.out.println("++x: " + x);
				
		// 피연산자++ - 수행 후  +1
		x++;
		System.out.println("x++: " + x);
	}
}
