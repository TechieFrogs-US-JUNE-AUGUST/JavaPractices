package TcsCoding_Assignment;

import java.util.Scanner;

public class Prog9 {
    public static void main(String[] args) {
        Scanner scannerObj= new Scanner(System.in);
         String str1[]= {"Espresso coffee", "Cappuccino coffee", "Latte coffee"};
         char c[][]= new char[str1.length][];                    //declaring 2D array with coffee items as size
         for(int i= 0; i<str1.length; i++){
             c[i]= str1[i].toCharArray();                      //converting coffee string items to chars
         }
         String str2[]= {"Plain tea", "Assam tea", "Ginger tea", "Cardamom tea", "Masala tea", "Lemon tea", "Green tea", "Organic Darjeeling tea"};
         char t[][]= new char[str2.length][];                 //declaring 2D array with tea items as size
         for(int i= 0; i<str2.length; i++){
             t[i]=str2[i].toCharArray();                      //converting tea string items to chars
         }
         String str3[]= {"Hot and Sour soup", "Veg Corn soup", "Tomato soup", "Spicy Tomato soup"};
         char[][] s = new char[str3.length][];               //declaring 2D array with soup items as size
         for(int i= 0; i<str3.length; i++){
             s[i]=str3[i].toCharArray();                     //converting soup string items to chars
         }
         String str4[]={"Hot Chocolate drink", "Badam drink", "Badam-Pista drink"};
         char[][] b = new char[str4.length][];              //declaring 2D array with drink items as size
         for(int i= 0; i<str4.length; i++){
             b[i]=str4[i].toCharArray();                    //converting drinks string items to chars
         }
         
         System.out.println("Enter input option from Main Menu: ");
         char ch= scannerObj.next().charAt(0);               //reading the i/p from user i.e a single character
         System.out.println("Enter the option from Sub Menu: ");
         int item= scannerObj.nextInt();
         int i;
         scannerObj.close();

         if(ch == 'c'){                                 //'c' is the input for coffee items(Main menu)               
             for(i=0; i<3; i++){                        //traverse through all the items of the submenu
                 if(item== i+1){
                 System.out.println("Welcome to CCD!");
                 System.out.println("Enjoy your "  +str1[i]);
                 break;
             }
         }
         if(i>=3){                                     //if the sub menu items exceed 3 , shows invalid option
             System.out.println("INVALID OPTION!");
         }
       }
       if(ch == 't'){                                 //'t' is the input for tea items(Main menu) 
           for(i=0; i<8; i++){                        //traverse through all the items of the submenu
            if(item== i+1){
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your "  +str2[i]);
                break;
            }
        }  
        if(i>=8){                                     //if the sub menu items exceed 8, shows invalid option
            System.out.println("INVALID OPTION!");
        }
      }
      if(ch == 's'){                                  //'s' is the input for soup items(Main menu)
        for(i=0; i<4; i++){                           //traverse through all the items of the submenu
            if(item== i+1){
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your "  +str3[i]);
                break;
            }
        }
        if(i>=4){                                       //if the sub menu items exceed 4, shows invalid option
            System.out.println("INVALID OPTION!");
        }
      }
      if(ch == 'b'){                                    //'b' is the input for soup items(Main menu)
        for(i=0; i<3; i++){                             //traverse through all the items of the submenu
            if(item== i+1){
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your "  +str3[i]);
                break;
            }
        }
        if(i>=3){                                         //if the sub menu items exceed 3, shows invalid option
            System.out.println("INVALID OPTION!");
        }
      } 
      
    }
}
