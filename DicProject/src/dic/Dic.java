package dic;

import java.util.Scanner;

// 사전 클래스 !! 
public class Dic 
{
	private static final int DIC_SIZE = 5;
	private Word [] Words =  new Word[DIC_SIZE]; 
	private int wordCnt = 0;   //  저장된 단어의 갯수 !! 
	private Scanner scan  = new Scanner(System.in);
	
	public Word getWord(int index )  
	{
		if( index >= 0 && index <  wordCnt) 
			return Words[index];
		else 
			return null;
	}
	public int getWordCnt() { return wordCnt;}
	// 생성자 
	public Dic() {} 
	
	// 메소드... 
	public void addWord( )
	{
	  String keyword; 
	  String desc; 
	  System.out.println("키워드 : ");
	  keyword = scan.nextLine();
	  System.out.println("설명 : ");
	  desc = scan.nextLine();
	  
	  Words[wordCnt] =  new Word( keyword, desc ); 
	  wordCnt++;
	  
	}
	public void eraseWord() 
	{
		
	}
	// keyword로 검색 !! 
	public Word searchWord()
	{
		return null;
		
	}
	public void show() // 전체 단어 출력 !! 
	{	// foreach :  배열일 경우 시작부터 끝까지 배열의 원소를 순회
		for(Word word : Words)
		{
			if( word != null) 
				word.show();
			else 
				System.out.println("[   null   ]");
		}
	}

}









