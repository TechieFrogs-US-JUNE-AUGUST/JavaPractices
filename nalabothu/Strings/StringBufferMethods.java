public class StringBufferMethods {
    public static void main(String[] args)
    {
        StringBuffer str=new StringBuffer("this is");
        str.insert(7,"StringBuffer");
        str.replace(0,1,"hi\n");
        str.delete(0,1);
        str.reverse();
        System.out.println(str);

    }
    
}
