package Methods;

public class Integer7 
        {
           public static void main(String[ ] args)
            {
                subclass Obj=new subclass();
                Obj.i=1;
               // Obj.printNum();
                Obj.j=2;
                Obj.printNum();
            }
            int i;
            void printNum()
            {
                System.out.println(i);
            }
        }
 class subclass extends Integer7
     {
        int j;
        //int i;
        void printNum()
        {
            System.out.println("i is " +i);
            System.out.println("j is "+j);
        }
     }