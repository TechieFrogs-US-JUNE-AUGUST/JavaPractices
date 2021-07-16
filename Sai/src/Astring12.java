public class Astring12{
    public static void main(String[] args){
        StringBuffer clearBuffer = new StringBuffer("How to clear the string");
        System.out.println(clearBuffer);
        clearBuffer.delete(0,13);//delete(from,to) index locations to be delete
        System.out.println(clearBuffer);
    }
}