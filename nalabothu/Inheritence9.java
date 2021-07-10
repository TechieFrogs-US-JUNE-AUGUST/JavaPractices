
    import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

class PurchaseItem{
    private String name;
    private double unitPrice;
    PurchaseItem(){

    }
    PurchaseItem(String name,double unitPrice){
        this.name=name;
        this.unitPrice=unitPrice;
        setName(name);
        setUnitPrice(unitPrice);
    }
    void getPrice(){
        setName(name);
        System.out.println("Name of Item: "+getName());
        setUnitPrice(unitPrice);
        System.out.println("unit price of item: "+getUnitPrice());
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
  public double getUnitPrice(){
      return unitPrice;
  }
  public void setUnitPrice(double unitPrice){
      this.unitPrice=unitPrice;
  }
}
class WeightedItem extends PurchaseItem{
    private double weight;
    double unitPrice;
    String name;
WeightedItem(double weight,double unitPrice,String name){
    super(name,unitPrice);
    this.name=name;
    this.unitPrice=unitPrice;
    this.weight=weight;
    System.out.println("item name:"+name);
    System.out.println("unit price: "+unitPrice);
    System.out.println("weight: "+weight);
}
void getPrice(){
    super.setUnitPrice(unitPrice);
    double price= getUnitPrice()*weight;
    System.out.println("Total price is: "+price);
}
}
class CountedItem extends PurchaseItem{
    private int quantity;
    double unitPrice;
    String name;
    CountedItem(int quantity,double unitPrice,String name){
        super(name,unitPrice);
        this.quantity=quantity;
        this.name=name;
        this.unitPrice=unitPrice;
        unitPrice=super.getUnitPrice();
        System.out.println("item name:"+name);
        System.out.println("unit price: "+unitPrice);
        System.out.println("quantity: "+quantity);
    }
    void getPrice(){
        super.setUnitPrice(unitPrice);
        double price=getUnitPrice()*quantity;
        System.out.println("Total price: "+price);
    }
}
public class Inheritence9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter item name");
        String name=sc.nextLine();
        System.out.println("enter value of unit price");
        double unitPrice=sc.nextDouble();
        System.out.println("enter quantity");
        int quantity=sc.nextInt();
        System.out.println("enter weight");
        double weight=sc.nextDouble();
        WeightedItem w=new WeightedItem(weight,unitPrice,name);
        w.getPrice();
        CountedItem c=new CountedItem(quantity,unitPrice,name);
        c.getPrice();
    }
}
    

