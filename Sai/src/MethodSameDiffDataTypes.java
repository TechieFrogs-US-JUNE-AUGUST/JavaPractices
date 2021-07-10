class Addition{
    public int add(int a, int b, int c){
        int sum = a + b + c;
        return sum;
    }
    public double add(double a, double b, double c){ 
        double sum = a + b + c;
        return sum;
    }
    public float add(float a, float b, float c){
        float sum = a + b + c;
        return sum;
    }
    public String add(String a, String b, String c){
        String sum = a + b + c;
        return sum;
    }
    public long add(long a, long b, long c){
        long sum = a + b + c;
        return sum;
    }
}
class MethodSameDiffDataTypes{
    public static void main(String[] args){ 
        Addition ob = new Addition(); 
        int sum2 = ob.add(1, 2, 3);
        System.out.println("sum of the three integer value : " + sum2);
        double sum3 = ob.add(1.0, 2.0, 3.0);
        System.out.println("sum of the three double value : "+ sum3);
        float sum4 = ob.add(1, 2, 3);
        System.out.println("sum of the three float value : " + sum4);
        String sum5 = ob.add("its" , " a string", " output");
        System.out.println("sum of the three sting value : "+ sum5);
        long sum6 = ob.add(1000, 2000, 3000);
        System.out.println("sum of the three long value : " + sum6);
    }
}
