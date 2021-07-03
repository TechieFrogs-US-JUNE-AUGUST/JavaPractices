public class Switches {
    public static void main(String[] args) {
        int n=5;
        int b=7;
            switch (n & b)
    { case 5:
        System.out.println("n=50");
        break;
        case 7:
            System.out.println("n = 50" );
            break;
            /*case 50:
            System.out.println("b= 50");              //wont accept same case value twice.
            break;*/
        case 100:
            System.out.println("n+b value is 150");
            break;
        default:
            System.out.println("n value not found ");
                }
          }
     }
