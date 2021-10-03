package Practice.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fi=new FileInputStream("D:\\java\serial.txt");
        ObjectInputStream ob= new ObjectInputStream(fi);
        Objectclass obj=(Objectclass)ob.readObject();
        System.out.println(obj.eno + " - " + obj.ename);

    }
    
}
