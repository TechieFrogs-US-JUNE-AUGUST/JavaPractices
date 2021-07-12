class Counter{
    int i;
    public void increment(){
        System.out.println("i = " +i);
    }
}
class Subcounter extends Counter{
}
class Counters{
    public static void main(String[] args){
        Subcounter s = new Subcounter();
        s.i=3;
        s.increment();
    }
}