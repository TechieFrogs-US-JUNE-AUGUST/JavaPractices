package Strings_Assignment;

public class Prog2 {
    public static void main(String[] args) {
        String words[]={"Sravya","Venkat","Ramya","Harshitha"};

       // for(int i=0; i<3; i++){
       //    for(int j=i+1; j<4; j++){
        for(int i=0; i<words.length; i++){           //0th index value and then 1,2,3 index values
            for(int j=i+1; j<words.length; j++){     //compares index values like 0,1; 0,2; 0,3   1,2; 1,3; 2,3   
                if(words[i].compareTo(words[j])>0){      
                String temp= words[i];               //swapping words[i] with words[j]
                words[i]= words[j];
                words[j]= temp;
            }
        }
    }
    System.out.println("In lexicographical order: ");
    //for(int i=0; i<4; i++){
         for(int i=0; i<words.length; i++){
         System.out.println(words[i]);
    }    
  }
}
