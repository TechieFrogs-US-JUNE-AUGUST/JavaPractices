public class StringObject7 {
    public static void main(String[] args)
    {
       

      String str = "nnr";
      String str2 = "Tarak";
      Object objStr = str;

      System.out.println( str.compareTo(str2) );
      System.out.println( str.compareToIgnoreCase(str2) );
      System.out.println( str.compareTo(objStr.toString()));
   }
}
