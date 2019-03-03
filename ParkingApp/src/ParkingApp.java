import java.util.Scanner;

public class ParkingApp {
	
	public static void inCar(int [] Parking) // 입차 
	{
		Scanner scan =  new Scanner(System.in);
		showCar(Parking); 
		System.out.println("주차할 공간 ?? "); 
		int index = scan.nextInt();  // 주차할 공간의 인덱스 !!
		if( index >= 0 && index < Parking.length)
		{
			int carNo = scan.nextInt(); 
			Parking[index] = carNo;
		}
	}
	public static void outCar(int [] Parking) // 출차 
	{
		// 1. 1대  삭제 
		// 2. 전체  삭제
		
	}
	public static void showCar(int [] Parking) // 출력 
	{
		System.out.println("==   전체 출력 =="); 
		for(int i = 0; i< Parking.length; i++  )
			System.out.print("[ "+ Parking[i] +" ]");
		System.out.println("\n=================");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] Parking;  // 주차공간?? 
		Scanner scan =  new Scanner(System.in);
		System.out.print("주차장 크기 : "); 
		int size = scan.nextInt();
		
		Parking =  new int[size];	// 주차 공간 heap생성 !! 
		
		int input = 0; // 사용자 입력 !! 
		
		while(true)
		{
			System.out.println( "1. 입차 ");
			System.out.println( "2. 출차 ");
			System.out.println( "3. 출력 ");
			System.out.println( "4. 주차장 확장");
			System.out.println( "0. 종료 "); 
			input = scan.nextInt(); 
			
			switch( input )
			{
			case 1:  inCar( Parking );   break;
			case 2:  outCar(Parking);   break; 
			case 3:  showCar(Parking); 	break;
			case 4: 					    break;
			case 0:  return;  
			default : System.out.println("입력 오류 ! " );
			}
		}
	}

}





