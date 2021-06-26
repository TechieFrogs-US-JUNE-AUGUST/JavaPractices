public class Forloop {
    public static void main(String[] args){
    for(int i=1; i<=5; i++)
    {
        System.out.println(i);
    }
  }   
} 

/*public class Forloop {
    public static void main(String[] args){
    for(int i=5; i>=1; i--)
    {
        System.out.println(i);
    }
  }   
} */


//NestedIf for loop//
/*public class Forloop{
    public static void main(String []args){
        for(int i=1; i<=5; i++)
           //for(int j=1;j<=i;j++)
           for(int j=1; j<=5; j++)
           {
              // System.out.println(i+" "+j);
              System.out.println(i);
           }
    }
}  */

//infinitive for loop//
/*public class Forloop{
    public static void main(String[] args){
        for(; ;)
        System.out.println("Infinitive for loop");
    }
}  */

//Printing star in pyramid shape//
/*public class Forloop{
     public static void main(String[] args) {
      for(int i=1; i<=5; i++){
          //for(int i=1; i>=5; i++){
         for(int j=1; j<=i; j++){
             System.out.print("* ");
         } 
         System.out.println();
       }
      }
    }  */

    //Labelled for loop//
/*public class Forloop{
    public static void main(String[] args){
    aa:
    for(int i=1; i<=3; i++){
        bb:
        for(int j=1; j<=3; j++){
            //if(i==2 && j==2){
            if(i==2 || j==2){
            //break bb;
            break aa;
             } System.out.println(i+" "+j);
        }
    }
  }
}    */

//practice//
/*public class Forloop{
    public static void main(String[] args){
    aa:
    //for(int i=1; i<=3; i++){
    for(int i=3; i>=1; i--) { 
        bb:
        //for(int j=1; j<=3; j++){
        for(int j=3; j>=1; j--){
            //if(i==2 && j==2){
          //  if(i==2 || j==2){
          //  continue;
             System.out.println(i+" "+j);
        }
     }
  }
}     */

