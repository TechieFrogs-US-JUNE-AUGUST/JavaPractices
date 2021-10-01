public class TryCatchPractice{
    public static void main(String[] args){
        int i=0;            // we get ArithmeticExceprtion  -  / zero
        //System.out.println("after the exception");
        try {
            System.out.println(i);
            i = 50/0;  // now it will execute
        } catch (ArithmeticException ae) {
            System.out.println(" ae");
            ae.printStackTrace(); // gives the what type of exception it is and in which line
        }
        System.out.println("outside the trycatch");
        
    }
}