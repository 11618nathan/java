import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1번
		// int형의 100개의 원소를 가지고 array로 참조되는 배열을 생성
		int [] array = new int[100]; 
		*/
		
		
		/*2번
		// int형 정수를 저장하고 있는 배열 array의 도든 원소의 값을 두 배로 만드는 반복 루프를 작성
		int [] array = {1,2,3,4,5}; // 초기화
		int [] b = new int[array.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = array[i*2];
		}
		*/
		
		
		/*3번
		// 사용자에게 배열의 크기를 받아서 double형 배열을 생성
		int Size = 0;
		Scanner scan = new Scanner(System.in);
		Size = scan.nextInt();
		int ArrayInput[] = new int[Size];
		double ArrayOutput = ArrayInput[Size]; // casting 
		*/
		
		
		/*4번
		// 하나의 배열을 다른 배열로 복사하는 반복 루프를 작성
		int [] a = {1,2,3,4,5}; // 초기화
		int [] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		System.out.println(b);
		*/
		
		
		/*5번
		// 사용자에게 입력 받은 숫자를 오름차순으로 정리
		Scanner scan = new Scanner(System.in);
		int[] str = new int[3];
		for(int i = 0; i<3; i++)
		{
			str[i] = scan.nextInt();
		}
		int temp = 0; // 정렬을 위해 임시로 값을 저장할 변수 
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] > str[j]) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
			System.out.print(str[i]);
			if (i < str.length - 1) {
				System.out.print(",");
			}
		}
 		*/
		
		
		/*6번
		// 2차원 배열에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성
		int arr[][] = { 
				{1, 2, 3, 4, 5}, 
				{6, 7, 8, 9, 10}, 
				{11, 12, 13, 14, 15}, 
				{16, 17, 18, 19, 20} }; 
		int sum = 0;
		int cnt = 0;
		double avg = 0.0;
		
		for ( int i = 0 ; i <arr.length; i++){
			for (int j = 0; j < arr[i].length; j++){
				sum += arr[i][j];
				cnt++;
			}
		}
		avg = sum/cnt;
		
		System.out.println(sum);
		System.out.println(avg);
		*/ 
		
		
		/**/
		// 1차원 배열 주차
		int Size = 0;
		Scanner scan = new Scanner(System.in);
		Size = scan.nextInt();
		int Parking [] = new int[Size];
		int num = 0;
		System.out.println("-주차 관리-");
		System.out.println("1: 입차");
		System.out.println("2: 출차");
		System.out.println("3: 주차장");
		System.out.println("4: 종료");
		Scanner numScan = new Scanner(System.in);
		num = numScan.nextInt();
		while(true)
		{
			if(num == 1)
			{
				Scanner scan = new Scanner(System.in);
				int[] str = new int[3];
				for(int i = 0; i<3; i++)
				{
					str[i] = scan.nextInt();
				}
			}
			if(num == 2)
			{
				
			}
			if(num == 3)
			{
				
			}
			if(num == 4)
			{
				break;
			}
		}
		
		
		/*
		// 2차원 로또
		*/
		int [][] Lotto; 
		Lotto = new int[3][4];
		
		System.out.println( Lotto.length ); 	
		
		for(int i = 0; i<Lotto.length; i++) 
		{
			for( int j = 0; j<Lotto[i].length; j++)
				Lotto[i][j] = 0;
			
		}
		for(int i = 0; i<Lotto.length; i++)  
		{
			for( int j = 0; j<Lotto[i].length; j++)
					System.out.print(Lotto[i][j]);
			System.out.println("");
		}
		
	}

}
