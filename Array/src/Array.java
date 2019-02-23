package dic;

public class Word
{
	private String Keyword; //school
	private String desc;    // 학교
	
	public String getKeyword() {
	public String getDesc() {
		
	//생성자 !!
	public Word(String Keyword, String desc)
	super();
	this.Keyword = keyword;
	this.desc = desc;
	}
	// 출력하는 메소드
	public 
}




------------------------------------------------------------

package dic;

import java.util.Scanner;

// 사전 클래스 !!
public class Dic
{
}   
    private static final int Dic_SIZE = 1024;
	private Word [] Words = new Word[DIC_SIZE];
	private int wordCnt = 0; // 저장된 단어의 갯수 !!
	private Scanner scan = new Scaneer 
}

public Word getWord(int index)

   if(index > 0 && index < wordCnt)
	   return Words[index];
   else
	   return null;


public int getWordCnt() { return wordCnt; }
// 생성자
public Dic() {}


// 메소드...
public void addWord()
{
	String keyword;
	String desc;
	System.out.println("키워드);"
0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000	keywotd = scan.nextLine();
	System.out.println("설명 :");
	desc = scan.nextLine();
	
}
public void erase
{
	
	
//keyword로 검색 !!
public Word searchWord()

    return null;
}
public void show() // 전체 단어 출력 !!
   // foreach : 배열일 경유 시작부터 끝까지 배열의 원소를 순환
  
   for(Word word : Words)
}
   if ( word ! = null)
	   word.show();
   
   else
	   System.out.println"[null ]" ;
   
   ------------------------------------------------------------------------
   
   
























































