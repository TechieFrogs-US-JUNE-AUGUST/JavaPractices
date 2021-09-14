import java.util.Scanner;
public class Coding9 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the item id : ");
        char ch = scannerObj.next().charAt(0);
        System.out.println("Give the number for type : ");
        int n = scannerObj.nextInt();
        String c[] = {"Expresso Coffee","Cappuccino Coffee","Lattee Coffee"};  
        String t[] = {"Plain Tea", "Assam Tea", "Ginger Tea", "Cardamom Tea", "Masala Tea", "Lemon Tea",
                      "Green Tea", "Organic Darjeeling Tea"};
        String s[] = {"Hot & Sour Sopu", "Veg Corn Soup", "Tomato Soup", "Spicy Tomato Soup"};
        String b[] = {"Hot Choclate Drink", "Badam Drink", "Badam-Pista Drink"};
        if(ch == 'c'){
            for(int i = 0; i < c.length; i++){
                if(n == (i+1)){
                    System.out.println("Welcome to CCD");
                    System.out.println("Enjoy your "+ c[i]);
                }
            }
            System.out.println("Invalid Input");
        } else if(ch == 't'){
            for(int i = 0; i < t.length; i++){
                if(n == (i+1)){
                    System.out.println("Welcome to CCD");
                    System.out.println("Enjoy your "+ t[i]);
                }
            }
            System.out.println("Invalid Input");
        }else if(ch == 's'){
            for(int i = 0; i < s.length; i++){
                if(n == (i+1)){
                    System.out.println("Welcome to CCD");
                    System.out.println("Enjoy your "+ s[i]);
                }
            }
            System.out.println("Invalid Input");
        }else if(ch == 'b'){
            for(int i = 0; i < b.length; i++){
                if(n == (i+1)){
                    System.out.println("Welcome to CCD");
                    System.out.println("Enjoy your "+ b[i]);
                }
            }
            System.out.println("Invalid Input");
        }else 
             System.out.println("Invalid Input");
    scannerObj.close();
    }
}
