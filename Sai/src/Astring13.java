public class Astring13{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Clear the String");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.setLength(0);
        System.out.println("after the making length zero, the string is : "+sb);
        System.out.println("after the making length zero : "+sb.length());
        sb.setLength(5);
        System.out.println(sb.length());
        System.out.println(sb);// after clearing the data if we set the length also no data will come back

    }
}