public class LexigraphString {
    public static void
    sortLexicographically(String strArr[])
    {
        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].compareToIgnoreCase(strArr[j])
                    > 0) {
                    String temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }
    }
  
    // this function prints the array passed as argument
    public static void printArray(String strArr[])
    {
        for (String string : strArr)
            System.out.print(string + " ");
        System.out.println();
    }
  
    public static void main(String[] args)
    {
        // Initializing String array.
        String stringArray[]
            = { "nnr",    "ntr", "abc",
                "def", "efg", "siva" };
  
        // sorting String array lexicographically.
        sortLexicographically(stringArray);
  
        printArray(stringArray);
    }
}
    

