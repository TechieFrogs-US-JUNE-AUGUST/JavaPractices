public class Astring2{
public static void main(String[] args){
    String[] wordsString = { "Sai", "Hari", "Check", "1st", "$" };
    for(int i = 0; i < 4; ++i){ //to check the every word with each other
      for (int j = i + 1; j < 5; ++j){
          if (wordsString[i].compareTo(wordsString[j]) > 0){// comparing each word
              String temp = wordsString[i]; //storing the temp for changing the position
              wordsString[i] = wordsString[j];
              wordsString[j] = temp;
            }
        }
    }
    System.out.println("The words in Lexicographical Order:");//gives the alphabetic order
    for(int i = 0; i < 5; i++)
        System.out.println(wordsString[i]);// gining the string i value
  }
}
