import java.util.Scanner;
class Bank6
 {
    public static void main(String[] args)
    {
        Bank6 obj=new Bank6();
        getBalance(0);
        BankA obj2=new BankA();
        obj2.getBalance(1000);
        BankB obj3=new BankB();
        obj3.getBalance(1500);
        BankC obj4=new BankC();
        obj4.getBalance(2000);
    
    }
     public static void getBalance(int amount)
     {
         
        }
    }
    
       class BankA
     {
         public void getBalance(int deposit)
         {
             
             System.out.println("money deposited from Bank A is"+deposit);
         }
        }
        
        
          class BankB
         {
             public  void getBalance(int deposit1)
             {
                 
                System.out.println("money deposited from Bank B is "+deposit1);
             }
            }
            class BankC
            {
                public  void getBalance(int deposit2)
                {
                  
            System.out.println("money deposited from Bank c is"+deposit2);
                }
               }
               
 
    

         
     
     


    

