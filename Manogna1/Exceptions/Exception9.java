package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception9 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream Exception09 = null;
        try{
            Exception09= new FileInputStream(
                "users/Manogna/Exception9.txt");
        }catch(FileNotFoundException ffe){
            System.out.println("File Doesnot Exist");
        }
    }
    
}
