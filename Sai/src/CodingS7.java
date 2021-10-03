import java.util.Scanner;

public class CodingS7 {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        //System.out.println("Enter which number in series of even to find : ");
        //int n = scannerObj.nextInt();
        //System.out.println("Enter which number in series of odd to find : ");
        //int m = scannerObj.nextInt();
        System.out.println("Give the Number to be check : ");
        int x = scannerObj.nextInt();
        int series = 0;
        if (x % 2 == 0) {   // for even 
            System.out.println("Enter which number in series of even to find : ");
            int n = scannerObj.nextInt();
			for (int i = 0; i < n; i++) {
				series += x;     // increment by the value of x
				//System.out.print(series+" "); // display the series of the number x
			}
            System.out.println(n + "th term in the series of number of " + x +" is "+ series);
		} else {   // for odd
            System.out.println("Enter which number in series of odd to find : ");
            int m = scannerObj.nextInt();
			for (int i = 0; i < m; i++) {
				series += x;     // increment by the value of x
				//System.out.print(series+" "); // display the series of the number x
			}
            System.out.println(m + "th term in the series of number of " + x +" is "+ series);
        }
        scannerObj.close();
    }	
}
