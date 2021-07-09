class Solution{
    int lenght;
    int breadth;
    Solution(int l, int b){      //parameterized constructor
        this.lenght=l;
        this.breadth=b;
    }
     int area(){                //method for calculating the area of rectangle
        return lenght*breadth;
    }
}
    public class Rectangle5{
     
    public static void main(String[] args){
       Solution obj1=new Solution(4,5);                 //obj1 for passing values to the constructor6
       
       Solution obj2=new Solution(5,8);
       System.out.println(obj1.area());
       System.out.println(obj2.area());  
    }
    
    }
