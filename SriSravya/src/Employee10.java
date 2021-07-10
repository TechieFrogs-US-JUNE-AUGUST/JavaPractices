class Emp{
    String name, address;
    int year;
      Emp(String n, int y, String a){         //parameterized constructor
        this.name=n;
        this.year=y;
        this.address=a;
    }
     String getName(){                      //method
        return name;
    }
     int getYear(){                    //method 
        return year;
    }
     String getAddress(){            //method
        return address;
    }
}
 public class Employee10{
     public static void main(String[] args){
         Emp e1=new Emp("Robert",1994,"64C- WallsStreet");        //creating object and passing values
         Emp e2=new Emp("Sam", 2000, "68D- WallsStreet");
         Emp e3=new Emp("John", 1999, "26B- WallsStreet");
         System.out.println("Name        Year of Joining     Address");
         System.out.println(e1.getName()+"      "+e1.getYear()+"                "+e1.getAddress());
         System.out.println(e2.getName()+"         "+e2.getYear()+"                "+e2.getAddress());
         System.out.println(e3.getName()+"        "+e3.getYear()+"                "+e3.getAddress());
     }
 }