package arrays;



public class Example2 {
    public static void main(String[] args) {
        String string="Quick Brown for jumps over the lazy dog";
        char charArray[]=string.toCharArray();//stores each char to chararray
        //System.out.println(Arrays.toString(charArray));
        int count=0;
        for(int i=0;i<charArray.length;i++)
        {   
            
            if(charArray[i]=='a') //if the character is equal to a count value increases
            {
                count++;
            }
        }
        System.out.println("only" +count + " occurance of a");
    }
}
    

    