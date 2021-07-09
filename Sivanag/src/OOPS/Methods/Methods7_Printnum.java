package Methods;

class printNu                            //super class
{
    int i;
    void printNum()                     //method
    {
        System.out.println(i);           //Print class variable i
    }

}
class subprintNu extends printNu         //Subclass
{
    int j;
    void printNum()                      //method overridding
    {
        System.out.println(j);           //Print class variable j
        System.out.println(super.i);     //print super class variable i
    }

}


public class Methods7_Printnum {            // main class
    public static void main(String[] args)  
    {
        subprintNu objsp =new subprintNu();//Subclass Object
        objsp.i=20;                        //Assign value to super class variable
        objsp.j=30;                        //Assign Value to subclass variable
        objsp.printNum();                  //call method in subclass(method overridding) 
        

    }
    
}
