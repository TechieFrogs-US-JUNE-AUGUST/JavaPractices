package oops.Methods;

class printNu                            
{
    int i;
    void printNum()                     
    {
        System.out.println(i);           
    }

}
class subprintNu extends printNu         
{
    int j;
    void printNum()                      
    {
        System.out.println(j);           
        System.out.println(super.i);     
    }

}


public class Methods7_Printnum {            
    public static void main(String[] args)  
    {
        subprintNu objsp =new subprintNu();
        objsp.i=20;                       
        objsp.j=30;                      
        objsp.printNum();                  
        

    }
    
}
