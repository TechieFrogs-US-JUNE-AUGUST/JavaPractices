public class CodingS23 {
    public static void main(String[] args) {
        int number;
        for(number = 1; number <= 20; number++){
            if(number%3 == 0 && number%5 == 0){
                System.out.println("subdevice");
            }else if(number % 3 == 0){
                System.out.println("usb");
            }else if(number % 5 == 0){
                System.out.println("device");
            }else 
                System.out.println(number);
        }
    }
}
