package strings;

    public static boolean checkRotation(String s1, String s2)
    {      
        if(s1.length()!=s2.length()){            //if s1 length is not equal to s2  it returns false
            return false;
        }
        String s3= s1+s2;                        //concat s1,s2 and storing in s3   
        if(s3.contains(s2)) 
             return true;                  //returns true if s3 contains s2 characters.         return true;
        else 

           return false;
        
    }     
   public static void main(String[] args) {
       String s1= "hanshu";
       String s2= "Himanshu";
       if(checkRotation(s1,s2)){                //passing s1,s2 strings to the method checkRotation
           System.out.println("True  " +s2+ " is a rotation of " +s1);  
       }
       else{
           System.out.println("False  " +s2+ " is not rotation of " +s1);
       }
    } 
}

