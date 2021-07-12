class TriPerimeter2{
    int a,b,c,p,area;
    TriPerimeter2(int s1 , int s2, int s3){    // constructor 
        a=s1;  
        b=s2;
        c=s3;
    }
    void periarea(){     //method for calculating area
        p=a+b+c;
        area=p/2;
        System.out.println(p +","+ area);
    }
    public static void main(String[] args){
        TriPerimeter2 pa=new TriPerimeter2(3,4,5);  //creating instance and giving values
        System.out.print("Perimeter and Area of the triangle : ");
        pa.periarea();  //calling method
        
    }
}