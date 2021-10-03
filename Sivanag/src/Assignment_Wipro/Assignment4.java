
public class Assignment4 {
    public static void main(String[] args) {
        System.out.print("Enter Barcode Number of Cosmotics: ");
        int barcode=Assignment2.integerInput();
        int temp=barcode;
        int rmd;
        while(barcode>0)
        {
            rmd=barcode%10;
            if(rmd<temp)
                temp=rmd;
            barcode/=10;
        }
        System.out.println("ID of oldest product in the batch is : " +temp);
    }
    
}
