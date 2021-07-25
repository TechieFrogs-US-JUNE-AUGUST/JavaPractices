public class String17 
{
    public static void main(String[] args) 
    {
        String str= "rama krishna";
        System.out.println("Characters in string " +str+ " are: ");

        for(int i=0; i<str.length(); i++)                           // if we any specific indexvalue in place str.length o/p will be upto that indexvalue only
        {
            char ch = str.charAt(i);                                  //access each character with index position
            System.out.print(ch+ " , ");
        }
    }
}