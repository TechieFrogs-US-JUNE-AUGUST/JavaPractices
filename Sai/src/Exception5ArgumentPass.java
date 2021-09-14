public class Exception5ArgumentPass {
    public static void main (String args[]) { 
        try {
           throw new Exception("throwing an exception");//we can pass the arguments in exceptions
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
     }
}
