package Practice;
public class StringCompare1 {
   public static void main(String[] args) {       
        String sr= new String("hi");
        int i=sr.compareTo("hihyu");
        System.out.println(i);//i=8
        System.out.println(sr.compareTo("gh"));//1
        System.out.println(sr.compareTo("hi"));//0
       }  
}
