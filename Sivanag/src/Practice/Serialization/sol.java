package Practice.Serialization;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class sol {
    
        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String name = reader.readLine();
            int number1 = Integer.parseInt(reader.readLine());
            int number2 = Integer.parseInt(reader.readLine());
            System.out.println(name + " will receive " + number1 + " in "+ number2 + " years.");
        }
    
}
