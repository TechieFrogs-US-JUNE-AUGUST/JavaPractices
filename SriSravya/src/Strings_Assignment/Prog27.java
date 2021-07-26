//TO FIND ALL SUNSETS OF A STRING
package Strings_Assignment;

public class Prog27 {
   public static void main(String[] args) {
       String s= "Car";
       int len= s.length();
       int temp= 0;

       String arr[]= new String[len*(len+1)/2];    //Total possible sets subsets for string of size nis n*(n+1)/2
       for(int i=0; i<len; i++){                   //This loop is for the starting character
           for(int j=i; j<len; j++){              //This loop adds the next char every iteration for the subset to form and add it to array
               arr[temp]= s.substring(i, j+1);
               temp++;
           }
       }
       System.out.println("All subsets for the given string are: ");
       for(int i=0; i<arr.length; i++){                //prints all the subsets
           System.out.println(arr[i]);
       }
   } 
}
