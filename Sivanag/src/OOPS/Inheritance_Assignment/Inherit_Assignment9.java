package Inheritance_Assignment;

public class Inherit_Assignment9 {
    public static void main(String[] args) {
        String nb="Rice";
        String nb1="Dal";
        
        double unit=20;
        double unit1=40;
        int quan =5;
        double weigh =6;
         WeightedItem wobj =new WeightedItem(nb,unit,weigh);
         CountedItem cobj =new CountedItem(nb1,unit1, quan);
         //CountedItem cobj =new CountedItem();
        
        //PurchaseItem ss = new PurchaseItem("Ricec",20.5);
        //ss.getPrice();
       wobj.getPrice();
       cobj.getPrice();


    }
    
}

class PurchaseItem
{
private String name;
private double unitPrice;

PurchaseItem(String name,double unitPrice)
{
    setName(name);
    setUnitPrice(unitPrice);
this.name=getName();
this.unitPrice=getUnitPrice();



}
void getPrice()
{
    setName(name);
    System.out.println("Name : " + getUnitPrice());
   
    setUnitPrice(unitPrice);
    System.out.println("unit price is " + getUnitPrice());
    
    
}
public String getName() //accesor
{
    return name;
}
public void setName(String name)//mutator
{
   this.name =name;
}
public double getUnitPrice()
{
    return unitPrice;
}
public void setUnitPrice( double unitPrice)
{
    this.unitPrice=unitPrice;
}

PurchaseItem()
{
    

}
}

class WeightedItem extends PurchaseItem
{
    
    private double Weight;
    double u;
    String n ;
    WeightedItem(String name,double unitPrice,double Weight)
    {
       
        super(name, unitPrice);
        this.u=unitPrice;
        this.Weight =Weight;
        this.n =name;
        System.out.println("Item Name : "+name);
        System.out.println("Unit price : "+unitPrice);
        System.out.println("Weight :  " +Weight);
    }
    void getPrice()
    {
        
        super.setUnitPrice(u);
        System.out.println("Total Price of " +n +" is " +getUnitPrice()*Weight);
    }

}
class CountedItem extends PurchaseItem
{
    private int quantity;
    double un;
    String nn;
    CountedItem(String nb1,double unitPrice,int quantity)
    {
        super(nb1,unitPrice);
        this.quantity=quantity;
        this.un=unitPrice;
        this.nn =nb1;
        unitPrice =super.getUnitPrice();
        System.out.println("Item Name : "+nb1);
        System.out.println("Unit price : "+unitPrice);
        System.out.println("Quantity : "+quantity);
    }
    void getPrice()
    {
        super.setUnitPrice(un);
        System.out.println("Total Price of " + nn + " is " +getUnitPrice()*quantity);
    }

}