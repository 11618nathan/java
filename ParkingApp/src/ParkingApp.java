import java.util.Scanner;

public class ParkingApp {
	
	public static void inCar(int [] Parking) // ���� 
	{
		Scanner scan =  new Scanner(System.in);
		showCar(Parking); 
		System.out.println("������ ���� ?? "); 
		int index = scan.nextInt();  // ������ ������ �ε��� !!
		if( index >= 0 && index < Parking.length)
		{
			int carNo = scan.nextInt(); 
			Parking[index] = carNo;
		}
	}
	public static void outCar(int [] Parking) // ���� 
	{
		// 1. 1��  ���� 
		// 2. ��ü  ����
		
	}
	public static void showCar(int [] Parking) // ��� 
	{
		System.out.println("==   ��ü ��� =="); 
		for(int i = 0; i< Parking.length; i++  )
			System.out.print("[ "+ Parking[i] +" ]");
		System.out.println("\n=================");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] Parking;  // ��������?? 
		Scanner scan =  new Scanner(System.in);
		System.out.print("������ ũ�� : "); 
		int size = scan.nextInt();
		
		Parking =  new int[size];	// ���� ���� heap���� !! 
		
		int input = 0; // ����� �Է� !! 
		
		while(true)
		{
			System.out.println( "1. ���� ");
			System.out.println( "2. ���� ");
			System.out.println( "3. ��� ");
			System.out.println( "4. ������ Ȯ��");
			System.out.println( "0. ���� "); 
			input = scan.nextInt(); 
			
			switch( input )
			{
			case 1:  inCar( Parking );   break;
			case 2:  outCar(Parking);   break; 
			case 3:  showCar(Parking); 	break;
			case 4: 					    break;
			case 0:  return;  
			default : System.out.println("�Է� ���� ! " );
			}
		}
	}

}





