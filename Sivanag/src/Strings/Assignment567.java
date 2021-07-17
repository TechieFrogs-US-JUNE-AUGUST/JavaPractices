//Compare strings and string objects using "== "and  "equalto"
package Strings;
public class Assignment567 {
        public static void main(String[] args) {
            String str1 = "Sivanag";
            String str2 = "Sivanag";
            String objst= new String("Sivanag");
            String objst1 =new String("Sivanag");
            System.out.println("String Compare to String using == ");
           System.out.println(str1 +" " + str2);
           if(str1==str2)
           System.out.println("True");
           else
           System.out.println("False");

            System.out.println("String Compare to String in Object using == ");
            System.out.println(str1 +" " + objst);
            if(str1==objst)
            {
                      System.out.println("True");
            }
           else
           System.out.println("False");
           
           System.out.println("String in object Compare to String in Object using == ");
           System.out.println(objst +" " + objst1);
           if(objst==objst1)
           System.out.println("True");
           else
           System.out.println("False");
           System.out.println("-------------------------------------");
           System.out.println("String Compare to String using equals");
           System.out.println(str1 +" " + str2);
           if(str1.equals(str2))
           System.out.println("True");
           else
           System.out.println("False");
           System.out.println("String Compare to String in Object using equals");
           System.out.println(str1 +" " + objst);
           if(str1.equals(objst))
           System.out.println("True");
           else
           System.out.println("False");
           
           System.out.println("String in object Compare to String in Object using equals ");
           System.out.println(objst +" " + objst1);
           if(objst.equals(objst1))
           System.out.println("True");
           else
           System.out.println("False");
        }



}
