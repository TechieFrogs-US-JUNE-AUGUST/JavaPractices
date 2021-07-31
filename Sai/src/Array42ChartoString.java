import java.util.Arrays;
public class Array42ChartoString{
   public static void main(String args[]){
      char ch[] = {'S','u','p','e','r',' ','S','A','I'};
      String string1 = String.valueOf(ch);
      System.out.println("String is : " + string1);
      String string2 = "Help Ever Hurt Never";
      char[] chars = string2.toCharArray();
      System.out.println(Arrays.toString(chars));
	}
}
