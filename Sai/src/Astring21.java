import java.util.Arrays;
class Astring21{
    static boolean checkLength(String first, String second, String result) {
    if (first.length() + second.length() != result.length()) {
      return false;  // length of string 1+ string 2 = string 3
    }
    else {
      return true;
    }
  }
  static String sortString(String str) {
      char[] charArray = str.toCharArray();// converting string char array
      Arrays.sort(charArray);  // sorting the characters of the array(basically string)
      str = String.valueOf(charArray);  // converting the array back to string
      return str;  // returns the string value
  }

  // this method compares each character of the result with 
  // individual characters of the first and second string
  static boolean shuffleCheck(String first, String second, String result) {
    first = sortString(first); // sorting the strings
    second = sortString(second);
    result = sortString(result);
    int i = 0, j = 0, k = 0;  // variables to track each character of 3 strings

    // iterate through all characters of result
    while (k != result.length()){//checking gthe length of the shuffled string matches to combintion of string 1 & 2
        if (i < first.length() && first.charAt(i) == result.charAt(k))
            i++;                //checking the characters of individual string
        else if (j < second.length() && second.charAt(j) == result.charAt(k))
                   j++;
            else {
        return false;
        }
        k++;   // access next character of result
    }

    // after accessing all characters of result
    // if either first or second has some characters left
    if(i < first.length() || j < second.length()) {
      return false;
    }

    return true;
  }

public static void main(String[] args){
    String first = "XY";
    String second = "12";
    String[] results = {"1XY2", "Y1X2", "Y21XX"};

    // call the method to check if result string is
    // shuffle of the string first and second
    for (String result : results) {
      if (checkLength(first, second, result) == true && shuffleCheck(first, second, result) == true) {
        System.out.println(result + " is a valid shuffle of " + first + " and " + second);
      }
      else {
        System.out.println(result + " is not a valid shuffle of " + first + " and " + second);
      }
    }
  }
}
