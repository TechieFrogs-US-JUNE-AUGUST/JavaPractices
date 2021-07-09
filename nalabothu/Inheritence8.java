public class Inheritence8
 {
    int i;
    int j;
    public static void main(String[] args)
    {
        Inheritence8 obj=new Inheritence8();
        obj.show(1,3);
        B obj1=new B();
        obj1.show(5);
        }
         public void show(int i,int j)
         {
             
             System.out.println("i and j values are" + i +j);

            }
        }
    
        class B extends Inheritence8
        {
        public void show(int k)
                {
                    System.out.println("k value is"+k);
                }
            }
        
            