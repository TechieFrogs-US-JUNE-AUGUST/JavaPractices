package Sivanag.src;

class Largestamong3numbers
{
    public static void main(String args[])
    {
        int x= 100;
        int y=20;
        int z=150;
      /*  int a;
        if(x > y)
            a =x;
            else 
            a=y;
            if(a>z)
                System.out.println("Largest among " + x +","+y+","+z + " is: " +a);
                else
                System.out.println("Largest among " + x +","+y+","+z + " is: " +z);*/
        if(x > y)
            if(x>z)
             System.out.println("Largest among " + x +","+y+","+z + " is: " +x);
             else
             System.out.println("Largest among " + x +","+y+","+z + " is: " +z);
        else if(y>z)    
            System.out.println("Largest among " + x +","+y+","+z + " is: " +y); 
            else
            System.out.println("Largest among " + x +","+y+","+z + " is: " +z);

    }
}