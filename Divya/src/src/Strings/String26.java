import java.util.*;
public class String26 {
    static void splitString(String str1, int n) {              // method with parameters
            int stringSize = str1.length();                    // to find length of a string
            int part_size;
            if (stringSize % n != 0) {                    // to find whether the remaimder of the string is equal to zero
                System.out.println("The size of the given string is not divisible by " + n);
                return;
            } else {
                System.out.println("The given string is: " + str1);
                System.out.println("The string divided into " + n + " parts and they are: ");
                part_size = stringSize / n;                  // to divide the given string in to n equal parts
                for (int i = 0; i < stringSize; i++) {
                    if (i % part_size == 0)
                        System.out.println();
                    System.out.print(str1.charAt(i));
                }
            }
        }
        public static void main(String[] args) {
            String str1 = "abcdefghijklmnopqrstuvwxy";         //declare and initialising of string varibles
            int split_number = 5;
            splitString(str1, split_number);                      //calling created method from class
        }
    }

