package ExceptionHandling;
public class Exception25 {
        public static void main(String[] args)
        {
            int a[] = new int[5];
            try
            {
                a[6]=2;
            } catch (Exception e){
                System.out.println("array out of bound");
            }
            finally {
                int n1= 1;
                int n2=2;
                int n3=n1/n2;
                a[2]=4;                                // finaly block for catching Exceptions
                System.out.println("sum of n1 and n2: " +n3 );
                System.out.println(a[2]);
                System.out.println("The finally statement is executed");
            }
        }
}