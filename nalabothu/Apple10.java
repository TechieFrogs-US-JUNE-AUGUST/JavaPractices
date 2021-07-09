public class Apple10
 {
     int number_of_items;
    
       public static void main(String[] args)
       {
           Apple10 obj=new Apple10();
           obj.show(1);
           Banana obj1=new Banana(); 
           obj1.show(5);
           }
            public void show(int number_Of_items)
            {
                
                System.out.println("number of items are"+number_of_items);
   
               }
           }
       
           class Banana extends Apple10
           {
           public void show(int number_of_items)
                   {
                       System.out.println("number_of_items are"+number_of_items);
                   }
               }
           
               
    

