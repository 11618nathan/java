package parking;

import java.util.Scanner;

public class Parking 
{ 
	private CarInfo [][]  Parking; 	// ���� ���� !! 
	private int carCnt = 0;			// ���� ���� ��� !! 
	private Scanner scan =  new Scanner(System.in);
	
	private int ROW = 0; 
	private int COL  =0;
	
	public int getCarCnt() { return carCnt; }
	
	public Parking() { }
	// ���� ���� ���� �Լ� !! 
	public void settingParking()
	{
		// �� ? 
		System.out.println("�� : "); 
		ROW =  scan.nextInt(); 
		// �� ? 

		System.out.println("�� : "); 
		COL =  scan.nextInt(); 	
		this.Parking = new CarInfo[ROW][];
		
		for(int i = 0; i < Parking.length; i++) // ROW
		{
			Parking[i] = new CarInfo[COL];
		}
	}
	// ��� �Լ�  !! 
	public void show() 
	{
		for(int i = 0; i< Parking.length; i++) // �� 
		{
			for(int j = 0; j<Parking[i].length; j++)
			{
				if( Parking[i][j] == null) 
					System.out.print("[ ���ڸ� ]");
				else 
					System.out.print("[ "+ Parking[i][j].getCarNo() +" ]");
			}
			System.out.println("");
			
		}
	}
		

	
	
	

}
