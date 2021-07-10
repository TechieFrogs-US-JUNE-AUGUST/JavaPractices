import java.util.Scanner;
 class Degree5
 {
    public static void main(String[] args)
    {
        Degree5 obj=new Degree5();
        getDegree();
        underGraduate obj2=new underGraduate();
        obj2.Degree();
        postGraduate obj3=new postGraduate();
        obj3.Degree();
    
    }
     public static void getDegree()
     {
         
         
         System.out.println("i got a degree");
     }
    }
    
       class  underGraduate
     {
         public  void Degree()
         {
            
             System.out.println("i am underGraduate");
         }
        }
        
        
          class postGraduate
         {
             public  void Degree()
             {
                
                 System.out.println("i am postgraduate");
             }
            }

 
    

         
     
     

