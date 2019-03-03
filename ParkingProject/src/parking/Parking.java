package parking;

import java.util.Scanner;

public class Parking 
{ 
	private CarInfo [][]  Parking; 	// 주차 공간 !! 
	private int carCnt = 0;			// 주차 차량 대수 !! 
	private Scanner scan =  new Scanner(System.in);
	
	private int ROW = 0; 
	private int COL  =0;
	
	public int getCarCnt() { return carCnt; }
	
	public Parking() { }
	// 주차 공간 생성 함수 !! 
	public void settingParking()
	{
		// 행 ? 
		System.out.println("행 : "); 
		ROW =  scan.nextInt(); 
		// 열 ? 

		System.out.println("열 : "); 
		COL =  scan.nextInt(); 	
		this.Parking = new CarInfo[ROW][];
		
		for(int i = 0; i < Parking.length; i++) // ROW
		{
			Parking[i] = new CarInfo[COL];
		}
	}
	// 출력 함수  !! 
	public void show() 
	{
		for(int i = 0; i< Parking.length; i++) // 행 
		{
			for(int j = 0; j<Parking[i].length; j++)
			{
				if( Parking[i][j] == null) 
					System.out.print("[ 빈자리 ]");
				else 
					System.out.print("[ "+ Parking[i][j].getCarNo() +" ]");
			}
			System.out.println("");
			
		}
	}
		

	
	
	

}
