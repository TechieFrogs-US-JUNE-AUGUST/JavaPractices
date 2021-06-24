public class LCM {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 8;
        int lcm = (n1 > n2) ? n1 : n2;
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.println("The LCM is " + lcm);
                break;
            }

            ++lcm;

        }
    }
}