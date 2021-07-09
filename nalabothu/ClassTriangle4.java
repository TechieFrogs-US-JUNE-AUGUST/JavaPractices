 class ClassTriangle4 {
    int l=3;
    int b=4;
    int h=5;    
    int area;
    int perimeter;
void ClassTriangle4(int l,int b,int h)
        {
        area=(b*h)/2;
    perimeter=l+b+h;
        System.out.println("area of triangle is"+area);
        System.out.println("perimeter of triangle is"+perimeter);
        }
        ClassTriangle4()
    {
    area=(b*h)/2;
    perimeter=l+b+h;
    System.out.println("area of triangle in units"+area);
    System.out.println("perimeter of triangle is"+perimeter);
        public static void main(String[] args)
        {
        ClassTriangle4 t=new ClassTriangle4();
        System.out.println(t.area);
        System.out.println(t.perimeter); 
        }
    }
    
    
