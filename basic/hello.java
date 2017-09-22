/*
 * 	자바의 변수 메모리 공간의 이름
 */

package first;

import java.util.Random;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java !!"); // 개행 됨.
		
		// java에서는 조건식에 true, false만 사용이 가능 (숫자 사용 불가)
		boolean bflag = false;
		if(bflag)
			System.out.println("true"); // 개행 됨.
		
		int no = -11;
		System.out.println(no>>2);
	}
	
	// 제어문
	// if(true) else
	// if ~ else if ~ else
	// switch ~ case
	// ?
	
	Random r = new Random();
	int x = r.nextInt()%45;
	// (x % 2 == 0)? System.out.println("짝수"): System.out.println("홀수");
	boolean flag = (x%2 == 0)? true: false;
	System.out.println(flag);
	
	Scanner scan = new Scanner(System.in);
	int y = scan.nextFloat();
	
	switch (x)
	{
	case 1: System.out.println("1"); break;
	case 2: System.out.println("2"); break;
	case 3: System.out.println("3"); break;
	default: System.out.println("0"); break;
	
	}
	
	String s = "AAA";
	S += "BBB";  //STRCAT(s, "BBB");
	S = "";
	if(s=="BBB")
		System.out.println(s);
	
	
}
