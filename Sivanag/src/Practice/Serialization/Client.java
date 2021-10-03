package Practice.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Client {

	public static void main(String... args) throws CloneNotSupportedException, IOException, ClassNotFoundException
	{
	
		//  Emp emp=new Emp(1,"A","Sirish");
		// FileOutputStream fos=new FileOutputStream("E://welcome1.txt");
		// ObjectOutputStream oos=new ObjectOutputStream(fos);
        // oos.writeObject(emp);
        // System.out.println("Object get seriarialized");
		
		FileInputStream fis=new FileInputStream("E://ham5.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Emp1 emp =(Emp1)ois.readObject();
		System.out.println(emp.getEno()+"-"+emp.getEname()+"-"+emp.getPassword()+"-"+Emp1.s+"-"+emp.n);
				
	}
}