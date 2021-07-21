public class String44 {
        public static void main(String args[]) {
            String a = "java";           // declare and initialize string variables a and b
            String b = "program";
            System.out.println("Before swap: " + a + " " + b);
            a = a + b;                               // swapping without using temp variable
            b = a.substring(0, a.length() - b.length());
            a = a.substring(b.length());
            System.out.println("After : " + a + " " + b);
        }
    }

