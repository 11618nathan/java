package dic;

public class Word
{
	private String Keyword; //school
	private String desc;    // �б�
	
	public String getKeyword() {
	public String getDesc() {
		
	//������ !!
	public Word(String Keyword, String desc)
	super();
	this.Keyword = keyword;
	this.desc = desc;
	}
	// ����ϴ� �޼ҵ�
	public 
}




------------------------------------------------------------

package dic;

import java.util.Scanner;

// ���� Ŭ���� !!
public class Dic
{
}   
    private static final int Dic_SIZE = 1024;
	private Word [] Words = new Word[DIC_SIZE];
	private int wordCnt = 0; // ����� �ܾ��� ���� !!
	private Scanner scan = new Scaneer 
}

public Word getWord(int index)

   if(index > 0 && index < wordCnt)
	   return Words[index];
   else
	   return null;


public int getWordCnt() { return wordCnt; }
// ������
public Dic() {}


// �޼ҵ�...
public void addWord()
{
	String keyword;
	String desc;
	System.out.println("Ű����);"
0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000	keywotd = scan.nextLine();
	System.out.println("���� :");
	desc = scan.nextLine();
	
}
public void erase
{
	
	
//keyword�� �˻� !!
public Word searchWord()

    return null;
}
public void show() // ��ü �ܾ� ��� !!
   // foreach : �迭�� ���� ���ۺ��� ������ �迭�� ���Ҹ� ��ȯ
  
   for(Word word : Words)
}
   if ( word ! = null)
	   word.show();
   
   else
	   System.out.println"[null ]" ;
   
   ------------------------------------------------------------------------
   
   
























































