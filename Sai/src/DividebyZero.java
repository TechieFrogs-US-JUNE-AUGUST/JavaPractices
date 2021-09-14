public class DividebyZero {
    public static void main(String[] args) {
        int x = 10;
        if(x != 10 && x/0 == 0){  // in && it checks 1st condition, if it false then condition is false
            System.out.println("we can");
        }else
            System.out.println("we can not");
    }
}
