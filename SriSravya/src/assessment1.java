import java.util.Scanner;

public class assessment1 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        String s= scannerObj.nextLine();

        int exclamatoryCount= 0, commaCount=0, colonCount=0,semicolonCount=0, count=0;

        for(int i=0; i<s.length(); i++){
            
            if(s.charAt(i)=='!' ){ 
                exclamatoryCount++;
            }
            else if(s.charAt(i)==','){
              commaCount++;
            }
            else if(s.charAt(i)==':'){
                colonCount++;
            }
            else if(s.charAt(i)==';'){
                semicolonCount++;
            }
           
           // else if(s.charAt(i)=='!'|| s.charAt(i)==',' || s.charAt(i)==':' || s.charAt(i)== ';'|| s.charAt(i)=='?'){
                //    count++;
             //   }
            }
            count= exclamatoryCount + commaCount + colonCount + semicolonCount;
        System.out.println("Punctuation characters are: " +count);
        System.out.println("exclamatory count is: " +exclamatoryCount);
        System.out.println("commaCount is: " +commaCount);
        System.out.println("semicolon count is :" +semicolonCount);
        System.out.println("colon count is: "+colonCount);
        scannerObj.close();
    }
}
