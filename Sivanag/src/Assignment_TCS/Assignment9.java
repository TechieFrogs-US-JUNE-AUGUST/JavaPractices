

import java.util.Scanner;



public class Assignment9 {
    static void coffee(int n)
    {
        
        switch(n)
        {
            case 1 : System.out.println("Enjoy your Espresso Coffee");break;
            case 2 : System.out.println("Enjoy your Cappuccino Coffee");break;
            case 3 : System.out.println("Enjoy your Latte Coffee");break;
            default : System.out.println("Invalid ouput");break;
        }
    }
    static void tea(int n)
    {
        
        switch(n)
        {
            case 1 : System.out.println("Enjoy your Plain Tea");break;
            case 2 : System.out.println("Enjoy your Assam Tea");break;
            case 3 : System.out.println("Enjoy your Ginger Tea");break;
            case 4 : System.out.println("Enjoy your Cardamom Tea");break;
            case 5 : System.out.println("Enjoy your Masala Tea");break;
            case 6 : System.out.println("Enjoy your Lemon Tea");break;
            case 7 : System.out.println("Enjoy your Green Tea");break;
            case 8 : System.out.println("Enjoy your Organic Darjeeling Tea");break;
            default : System.out.println("Invalid ouput");break;
        }
    }
    static void soups(int n)
    {
        switch(n)
        {
        case 1 : System.out.println("Enjoy your Hot and Sour Soup");break;
        case 2 : System.out.println("Enjoy your Veg Corn Soup");break;
        case 3 : System.out.println("Enjoy your Tomato Soup");break;
        case 4 : System.out.println("Enjoy your Spicy Tomato Soup");break;
        default : System.out.println("Invalid ouput");break;
                    
        }
    }
    static void Beverages(int n)
    {
        switch(n)
        {
        case 1 : System.out.println("Enjoy your Hot Chocolate Drink");break;
        case 2 : System.out.println("Enjoy your Badam Drink");break;
        case 3 : System.out.println("Enjoy your Badam Pista Drink");break;
       
        default : System.out.println("Invalid ouput");break;
        }
    }
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter what do you want Coffee/Tea/Soup/Beverages");
        char type = scannerObject.next().charAt(0);
        //System.out.println(type);
        int num=scannerObject.nextInt();
        char[] drink={'c','t','s','b'};
        System.out.println("Welcome to CCD");
            if(type==drink[0])

                coffee(num);
            else if(type==drink[1])
                tea(num);
            else if(type==drink[2])
                soups(num);
            else if(type==drink[3])
                Beverages(num);
            else
                System.out.println("Invalid Output");

        scannerObject.close();
        
    }
    
}
