package OOPS_assignment_Inheritance;
class PurchaseItem{                       //parent class
private String name;
private double unitPrice;

PurchaseItem(String name,double unitPrice){   //constructor with parameters
    setName(name);
    setUnitPrice(unitPrice);
    this.name=getName();
    this.unitPrice=getUnitPrice();
}
void getPrice(){                           //method that returns unit price
    setName(name);
    System.out.println("Name is: " +getName());
    setUnitPrice(unitPrice);            
    System.out.println("Unit price is" +getUnitPrice());  
}
public String getName(){           //get method or mutator for name
    return name;
}
public void setName(String name) {  //set method or accessor
   this.name =name;
}
public double getUnitPrice(){       //mutator method for unitprice
    return unitPrice;
}
public void setUnitPrice(double unitPrice){    //accessor method
    this.unitPrice=unitPrice;
 }

}

class WeightedItem extends PurchaseItem{                //inheritance
    private double Weight;
    double a;
    String b ;
    WeightedItem(String name,double unitPrice,double Weight){       //constructor with parameters
        super(name, unitPrice);                      //for accessing parent class members
        this.a=unitPrice;
        this.Weight=Weight;
        this.b=name;
        System.out.println("Item Name is: "+name);
        System.out.println("Unit price is: "+unitPrice);
        System.out.println("Weight is: " +Weight);
    }
    void getPrice(){                               //overriding getprice that returns price of purchased item
         super.setUnitPrice(a);                    //constructor with passing unitprice and with super to access parent class mem
         System.out.println("Total Price of " +b + "=" +getUnitPrice()*Weight);
    }
}
class CountedItem extends PurchaseItem{              //inheritance
    private int quantity;
    double a1;
    String b1; 
    CountedItem(String name,double unitPrice,int quantity){   //constructor with parameters
        super(name,unitPrice);                    //super for accessing parent class variables
        this.quantity=quantity;
        this.a1=unitPrice;
        this.b1 =name;
        System.out.println("Item Name : "+name);
        System.out.println("Unit price : "+unitPrice);
        System.out.println("Quantity : "+quantity);
    }
    void getPrice(){                                  //over riding 
        super.setUnitPrice(a1);
        System.out.println("Total Price of " +b1 + "=" +getUnitPrice()*quantity);
    }
}
public class Ass3Prog9{
    public static void main(String[] args) {
        String b="Rice";
        String b1="Dal";
        
        double a=10;
        double a1=20;

        double weight=12;
        int quantity=15;     
        WeightedItem wobj=new WeightedItem(b,a,weight);         //creating obj for weightedItem class with passing i/p
        CountedItem cobj=new CountedItem(b1,a1,quantity);
        wobj.getPrice();              //calling method getPrice of subclass WeightedItem
        cobj.getPrice();              //calling method getPrice of subclass CountedItem
    }  
}