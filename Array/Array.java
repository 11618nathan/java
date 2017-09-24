import java.util.Random;
import java.util.Scanner;

public class Array {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] Array; 
		Array = new int[5];
		
		for(int i = 0; i<5; i++)
			Array[i]= 0;
		
		int Size = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¹è¿­ Å©±â: ");
		Size = scan.nextInt();
		
		int [] Array = new int[Size];
		
		for(int i = 0; i<Size; i++)
			System.out.println(Array[i]);
	}
	
	//
	Random r = new Random();
	int size = Math.abs(nextInt()%6 + 5);
	int [] Array1 = new int[size];
	
	for(int i = 0; i<Array1.lenegth; i++)
		Array[i] = Math.abs(r.nextInt()%11);
	
	//
	char [] ch = new char[26];
	for(char c = 'A'; c <= 'Z'; c++)
		ch[c-65] = c;
	
	
	int [][] ar;
	ar = new int [3][4];
}
