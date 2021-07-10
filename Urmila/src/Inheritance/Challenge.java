package Inheritance;
class PurchaseItem{                       //parent class
    private String name;                  // private method
    private double unitPrice;
    
    PurchaseItem(String name,double unitPrice){   //constructor with parameters
        setName(name);
        setUnitPrice(unitPrice);
        this.name=getName();
        this.unitPrice=getUnitPrice();
    }
    void getPrice(){                          
        setName(name);
        System.out.println("Name is: " +getName());
        setUnitPrice(unitPrice);            
        System.out.println("Unit price is" +getUnitPrice());  
    }
    public String getName(){           //get methods
        return name;
    }
    public void setName(String name) {  //set method
       this.name =name;
    }
    public double getUnitPrice(){       // method for unitprice
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice){    //accessor method
        this.unitPrice=unitPrice;
     }
    } 
    class WeightedItem extends PurchaseItem{                //inheritance
        private double Weight;                              // private 
        double a;
        String b ;
        WeightedItem(String name,double unitPrice,double Weight){  
            super(name, unitPrice);                      
            this.a=unitPrice;
            this.Weight=Weight;
            this.b=name;
            System.out.println("Item Name is: "+name);
            System.out.println("Unit price is: "+unitPrice);
            System.out.println("Weight is: " +Weight);
        }
        void getPrice(){                               //overriding getprice 
             super.setUnitPrice(a);                    
             System.out.println("Total Price of " +b + "=" +getUnitPrice()*Weight);
        }
    }
    class CountedItem extends PurchaseItem{              //inheritance
        private int quantity;
        double a1;
        String b1; 
        CountedItem(String name,double unitPrice,int quantity){  
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
            System.out.println("Total Price of " + b1 + "=" + getUnitPrice()*quantity);
        }
    }
 class Challenge{
        public static void main(String[] args) {
            String b="pulses";
            String b1="sugar";
            
            double a=100;
            double a1=40;
    
            double weight=8;
            int quantity=10;     
            WeightedItem weightobj=new WeightedItem(b,a,weight);         //creating obj for weightedItem class with passing i/p
            CountedItem countedobj=new CountedItem(b1,a1,quantity);
            weightobj.getPrice();              //calling method getPrice of subclass WeightedItem
            countedobj.getPrice();              //calling method getPrice of subclass CountedItem
        }  
    }