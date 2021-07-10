class One{
    int i;
    public void printNum(){
        System.out.println("Class output : " +i);
    }
}
class OneSubclass extends One{
    int j;
    public void printNum(){
        System.out.println("Subclass output : " +j);
    }
}
class Overload2{
    public static void main(String[] args){
        OneSubclass s = new OneSubclass();
        One o = new One();
        o.i=10;
        s.j=20;
        o.printNum();
        s.printNum();
    }
}