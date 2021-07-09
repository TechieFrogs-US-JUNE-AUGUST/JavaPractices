public class AddDistance {
int feet,inch;
   AddDistance( int f,int i){
      feet = f;
      inch = i;
   }     
   AddDistance addDist(AddDistance objt,AddDistance objt1){
      int f = 0, i= 0;
      i = inch+objt.inch+objt1.inch;
      if(i >= 12){
         f = i/12;
         i = i%12;
      }
      f =feet+objt.feet+feet+objt1.feet;
      AddDistance objt2 = new AddDistance(f,i);
      return objt2;
   }
   void displayDist(){
System.out.println(feet+"feet"+inch+"inch");
   }
   }
   class AddAddDistance{
      public static void main(String[] args){
         AddDistance objt = new AddDistance(12,24);
         AddDistance objt1 = new AddDistance(13,26);
         AddDistance objt2 = new AddDistance(11,11);
         AddDistance objt3;
         objt3 = objt.addDist(objt1,objt2);
         objt.displayDist();
         objt1.displayDist();
         objt2.displayDist();
         objt3.displayDist();
      }
   }