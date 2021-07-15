public class StringsPracticeBuffer{
    public static void main(String[] args){
        StringBuffer sBuffer = new StringBuffer();
        StringBuffer sBuffer1 = new StringBuffer("String Buffer");
        StringBuffer sBuffer2 = new StringBuffer(32);// capacity by default its 16 
        System.out.println(sBuffer);
        System.out.println(sBuffer1);
        System.out.println(sBuffer2);
        sBuffer.append("Mutable");//appending is - adding the string, same as concatination in strings
        System.out.println("sBuffer");

        //insert is same as replace in string
        sBuffer1.insert(7, "insert ");
        System.out.println(sBuffer1);

        // String Buffer replace have 3 parameters (start index , end index, string)
        sBuffer1.replace(7,13,"replace");
        System.out.println(sBuffer1);
         
        //delete string  , particular charcter delete, reverse
        sBuffer1.delete(7,15);
        System.out.println(sBuffer1);
        sBuffer1.deleteCharAt(6);
        System.out.println(sBuffer1);
        sBuffer1.reverse();
        System.out.println(sBuffer1);

        //Capacity   , new capacity is --  (oldcapacity*2 )+2
        StringBuffer sBuffer3 = new StringBuffer();
        System.out.println(sBuffer3.capacity());  // 16
        sBuffer3.append("Checking the Capacity");  // length is 21
        System.out.println(sBuffer3.length()); //21
        System.out.println(sBuffer3.capacity());//21 is more than 16 ((oldcapacity 16*2)+2) =34
        sBuffer3.delete(0,9);
        System.out.println(sBuffer3);//after delete the string , total string is reduces
        System.out.println(sBuffer3.capacity());// but the capacity wont reduce, it remains same 34.
        // its already created 34, it remains.
        sBuffer3.ensureCapacity(15);// lesser capacity when compared to existing capacity
        System.out.println(sBuffer3.capacity());//it will check both and givev which is higher capacity
        sBuffer3.ensureCapacity(50);// given capacity is higher
        System.out.println(sBuffer3.capacity());//here it will increase the capacity (34*2) + 2 = 70
    }
}