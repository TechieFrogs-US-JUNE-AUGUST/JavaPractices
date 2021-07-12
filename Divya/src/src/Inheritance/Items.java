package Inheritance;
class PurchaseItem {
    private String name;
    private double unitPrice;
    PurchaseItem() {
    }
    PurchaseItem(String name, double unitPrice) {
        setName(name);
        setUnitPrice(unitPrice);
        this.name = getName();
        this.unitPrice = getUnitPrice();
    }
    void getPrice() {
        setName(name);
        System.out.println("Name : " + getName());
        setUnitPrice(unitPrice);
        System.out.println("unit price: " + getUnitPrice());
    }
    public String getName() {
        return name;
    }
    public void setName(String name)           //method mutator
    {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

}
class WeightedItem extends PurchaseItem
{
    private double Weight;
    double unit;
    String name ;
    WeightedItem(String name,double unitPrice,double Weight)
    {
        this.unit=unitPrice;
        this.Weight =Weight;
        this.name =name;
        System.out.println("Item Name : "+name);
        System.out.println("Unit price : "+unitPrice);
        System.out.println("Weight :  " +Weight);
    }
    void getPrice()
    {
        super.setUnitPrice(unit);
        System.out.println("Total cost of " +name +" is " +getUnitPrice()*Weight);
    }

}
class CountedItem extends PurchaseItem
{
    private int quantity;
    double unit;
    String name;
    CountedItem(String name,double unitPrice,int quantity)
    {
        super(name,unitPrice);
        this.quantity=quantity;
        this.unit=unitPrice;
        this.name =name;
        unitPrice =super.getUnitPrice();
        System.out.println("Item Name : "+name);
        System.out.println("Unit price : "+unitPrice);
        System.out.println("Quantity : "+quantity);
    }
    void getPrice()
    {
        super.setUnitPrice(unit);
        System.out.println("Total cost of " + name + " is " +getUnitPrice()*quantity);
    }
}
class Items {
    public static void main(String[] args) {
        String nb="sugar";
        String nb1="Almond";
        double unit=40;
        double unit1=50;
        int quantity =9;
        double weigh =3;
        WeightedItem obj =new WeightedItem(nb,unit,weigh);
        CountedItem obj1 =new CountedItem(nb1,unit1, quantity);
        obj.getPrice();
        obj1.getPrice();
    }
}