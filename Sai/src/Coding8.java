import java.util.Scanner;

public class Coding8 {
    public static void main(String[] args) {
        //int amount = 5000;
        int commission = 250;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Give the Parent : ");
        String parent = scanner.next();
        int member = 1;
        System.out.print("Do you have child : ");
        char ch = scanner.next().charAt(0);
        System.out.println("How many Childeren do you have");
        int childN  = scanner.nextInt();
        String name[] = new String[0];
        if( ch == 'y' || ch == 'Y'){            
            for(int i = 0; i < childN ; i++ ){
                System.out.print("Enter the child "+ (i+1) + " ");
                name[i] = scanner.next();                
            }   
        }else if(ch == 'n' || ch == 'N')
            System.out.println("No child");
        member = member + childN;
        if(member > 0 ){
            //commission = childN*commission;
            for(int i = 0; i < childN ; i++){
                commission += commission;
            }
        }
        System.out.println("Total Members : "+ member);
        System.out.println(parent + " : "+ commission +" INR");
        commission = 250;
        for(int i = 0 ; i < childN ; i++){
            System.out.print(name[i] + " : ");
            System.out.println(commission + " INR");
        }
        scanner.close();        
    }
}
