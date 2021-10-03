package Practice.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client1 {

	public static void main(String... args) throws CloneNotSupportedException, IOException, ClassNotFoundException
	{
	
		 Emp1 emp=new Emp1(1,"C","Sirish");
        
		FileOutputStream fos=new FileOutputStream("E://ham5.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(emp);
        oos.writeObject(emp.n);
        
        System.out.println("Object get seriarialized");
		
		// FileInputStream fis=new FileInputStream("E://welcome1.txt");
		// ObjectInputStream ois=new ObjectInputStream(fis);
		// Emp1 emp =(Emp1)ois.readObject();
		// System.out.println(emp.getEno()+"-"+emp.getEname()+"-"+emp.getPassword());
				
	}
}