package dic;

import java.util.Scanner;

// ���� Ŭ���� !! 
public class Dic 
{
	private static final int DIC_SIZE = 5;
	private Word [] Words =  new Word[DIC_SIZE]; 
	private int wordCnt = 0;   //  ����� �ܾ��� ���� !! 
	private Scanner scan  = new Scanner(System.in);
	
	public Word getWord(int index )  
	{
		if( index >= 0 && index <  wordCnt) 
			return Words[index];
		else 
			return null;
	}
	public int getWordCnt() { return wordCnt;}
	// ������ 
	public Dic() {} 
	
	// �޼ҵ�... 
	public void addWord( )
	{
	  String keyword; 
	  String desc; 
	  System.out.println("Ű���� : ");
	  keyword = scan.nextLine();
	  System.out.println("���� : ");
	  desc = scan.nextLine();
	  
	  Words[wordCnt] =  new Word( keyword, desc ); 
	  wordCnt++;
	  
	}
	public void eraseWord() 
	{
		
	}
	// keyword�� �˻� !! 
	public Word searchWord()
	{
		return null;
		
	}
	public void show() // ��ü �ܾ� ��� !! 
	{	// foreach :  �迭�� ��� ���ۺ��� ������ �迭�� ���Ҹ� ��ȸ
		for(Word word : Words)
		{
			if( word != null) 
				word.show();
			else 
				System.out.println("[   null   ]");
		}
	}

}









