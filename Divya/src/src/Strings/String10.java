import java.util.Random;
public class String10 {
    public static void main(String[] args){
String s="ABCDEFGHIJKLMNOPQRTSUVWXYZ";        //declare and initialize the string variable
StringBuilder stringBuilderObj=new StringBuilder();        // creating new instance for String builder
Random randomObj=new Random();                             // create new instance for random class
int length=6;                                           // setting of length
for(int i=0;i<length;i++){
    int index=randomObj.nextInt(s.length());
    char randomChar=s.charAt(index);
    stringBuilderObj.append(randomChar);          //  add stringbuilder object with character object
}
String randomString=stringBuilderObj.toString();                  // to convert characters to string
System.out.println("Random string:"+randomString);
    }
}
