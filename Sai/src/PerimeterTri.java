class PerimeterTri{
    int s1,s2,s3,p;
    void triangle(){  // method for assigning the values and calculating perimeter
        s1=3;
        s2=4;
        s3=5;
        p=s1+s2+s3;
        System.out.println("The perimeter of the triangle is "+ p);
    }
   
        public static void main(String[]args){
        PerimeterTri myObj = new PerimeterTri();  /// creating instance
        myObj.triangle();  //calling 
    }
}