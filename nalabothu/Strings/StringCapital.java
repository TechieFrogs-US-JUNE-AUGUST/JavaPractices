public class StringCapital {
    public static void main(String[] args)
    {
        String str = "hi ";

// capitalize first letter
String output = str.substring(0, 1).toUpperCase() + str.substring(1);

// print the string
System.out.println(output);
    }
    
    
}
