package inheritance;
class PurchaseItem{
    private String name;
    private double unitPrice;
    PurchaseItem(String name,double unitPrice){
        setName(name);
        setUnitPrice(unitPrice);
        this.name=getName();
        this.unitPrice=getUnitPrice();
}
void getPrice(){
    setName(name);
    System.out.println("Name : " +getUnitPrice());
    setUnitPrice(unitPrice);
    System.out.println("Unit Price is : " +getUnitPrice());

}
public String getName()
{
    return name;
}
public void setName(String name){
    this.name=name;
}
public double getUnitPrice()
{
    return unitPrice;

}
public void setUnitPrice(double unitPrice)
{
    this.unitPrice=unitPrice;
}
PurchaseItem(){

}

}
class WeightedItem extends PurchaseItem
{
    private double weight;
    double unitprice1;
    String name1;
   WeightedItem(String name,double unitPrice,double weight)
    {
         super(name,unitPrice);
        this.unitprice1=unitPrice;
        this.weight=weight;
        this.name1=name;
        System.out.println("Name :" +name);
        System.out.println("Unit Price " +unitPrice);
        System.out.println("weight " +weight);

    }
    void getPrice()
    {
        super.setUnitPrice(unitprice1);
        System.out.println("Total Price of " +name1 +"is " +getUnitPrice()*weight);
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

public class InheritanceAssignment9 {
    public static void main(String[] args) {
        String nb="Rice";
        String nb1="Dal";
        
        double unit=20;
        double unit1=40;
        int quan =5;
        double weigh =6;
         WeightedItem wobj =new WeightedItem(nb,unit,weigh);
         CountedItem cobj =new CountedItem(nb1,unit1, quan);
         
       wobj.getPrice();
       cobj.getPrice();


    }
    
}

