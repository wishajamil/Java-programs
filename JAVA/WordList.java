import java.util.*;

public class WordList
{
  private ArrayList myList;

  public WordList() { myList = new ArrayList(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  // A-1, (a)

  public int numWordsOfLength(int len)
  {
    int count = 0;
    for(int i=0; i < myList.size(); i++){
        String a = (String)myList.get(i);
        if( a.length() == len){
            count++;
        }
    }
    return count;
  }

  // A-1, (b)

  public void removeWordsOfLength(int len)
  {
      for(int i=0; i < myList.size(); i++){
        String b = (String)myList.get(i);
        if(b.length() == len){
            myList.remove(i);
            i--;
        }
      }
  }
}
