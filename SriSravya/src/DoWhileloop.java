/*
public class DoWhileloop {
    public static void main(String[] args){
        int i=1;
        do{
            System.out.println(i);
            i++;
        } while(i<=5);
    }
}  */


/*public class DoWhileloop {
    public static void main(String[] args){
        int i=10;
        do{
            System.out.println(i);
            i--;
        } while(i>=1);
    }
}   */


/*public class DoWhileloop {
    public static void main(String[] args){
        do{
            System.out.println("Infinite do-while loop");
        } while(true);
    }
}   */


//do-while using break statement//
/*public class DoWhileloop{
    public static void main(String[] args) {
        int i=1;
    do{
        if(i==5){
            i++;
            break;
        }
         System.out.println(i);
         i++;
        }while(i<=10);   
     }
    }    */

    
    //do-while using continue statement//
    public class DoWhileloop{
        public static void main(String[] args){
            int i=10;
            do{
                if(i==5){
                    i--;
                    continue;
                } System.out.println(i);
                  i--;
            } while(i>=1);
        }
    }
          