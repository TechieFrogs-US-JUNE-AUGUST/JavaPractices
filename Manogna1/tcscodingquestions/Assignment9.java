package tcscodingquestions;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args)
     {
        Scanner scannerObj=new Scanner(System.in);
        String[] str1={"Espresso Coffee","Cappuccino Coffee","Latte Coffee"};
        char[][] c = new char[str1.length][];
        for(int i =0;i<str1.length;i++)
        {
            c[i]=str1[i].toCharArray();
        }
        String str2[]={"Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"};
        char[][] t = new char[str2.length][];
        for(int i =0;i<str2.length;i++)
        {
            t[i]=str2[i].toCharArray();
        }
        String str3[]= {"Hot and Sour Soup","Veg Corn Soup","Tomato Soup","Spicy Tomato Soup"};
        char[][] s = new char[str3.length][];
        for(int i =0;i<str3.length;i++)
        {
            s[i]=str3[i].toCharArray();
        }
        String str4[]={"Hot Chocolate Drink","Badam Drink","Badam-Pista Drink"};
        char[][] b = new char[str4.length][];
        for(int i =0;i<str4.length;i++)
        {
            b[i]=str4[i].toCharArray();
        }
        
        System.out.println("INPUT");
        char ch= scannerObj.next().charAt(0);
        int item=scannerObj.nextInt();
        int i;
        System.out.println("OUTPUT");
        scannerObj.close();
        if(ch=='c')
        {
            for( i=0; i<3; i++)
            {
                if(item==i+1)
                {
                    System.out.println("Welcome to CCD ! ");
                    System.out.println("Enjoy your " +str1[i]);
                    break;
                }
            
            }
            if(i>=3)
            {
                System.out.println("Invalid Option !");
            }
        }
        if(ch=='t')
            {
                for( i=0; i<8; i++)
                {
                    if(item==i+1)
                    {
                        System.out.println("Welcome to CCD ! ");
                        System.out.println("Enjoy your " +str2[i]);
                        break;
                    }
                }
                if(i>=8)
                    {
                        System.out.println("Invalid Option !");
                    }
        }
        if(ch=='s')
        {
            for( i=0; i<4; i++)
            {
                if(item==i+1)
                {
                System.out.println("Welcome to CCD ! ");
                System.out.println("Enjoy your " +str3[i]);
                    break;
                }     
            }
            if(i>=4)
                {
                System.out.println("Invalid Option !");
                }
        }
    if(ch=='b')
    {
        for( i=0; i<3; i++)
        {
            if(item==i+1)
            {
               System.out.println("Welcome to CCD ! ");
               System.out.println("Enjoy your " +str4[i]);
                break;
            }
        }
        if(i>=3)
            {
            System.out.println("Invalid Option !");
            }   
    }
        
    }
    
}
