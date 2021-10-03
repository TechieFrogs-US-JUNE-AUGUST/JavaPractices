import java.util.Scanner;

public class Coding13 {
    public static void main(String[] args) {  // series of numbers increments by 6 and 7 
        Scanner scannerObj= new Scanner(System.in);
		int series = 0;
        System.out.print("Give the number : "); //0,0,7,6,14,12,21,18, 28
		int number = scannerObj.nextInt();
		if (number % 2 == 0) {   // for even 
			for (int i = 0; i < number / 2 - 1; i++) {
				series += 6;     // 0, 6, 12, 18, 24, 30...  - increment by 6
				System.out.print(series+" ");
			}
		} else {   // for odd
			for (int i = 0; i < number / 2 - 1; i++) {
				series += 7;     // 0, 7, 14, 21, 28, 35...  - increment by 7
				System.out.print(series+" ");
			}
		}
		scannerObj.close();
    }
}
