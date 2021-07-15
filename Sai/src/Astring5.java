public class Astring5{
    public static void main(String[] args){
        String sE = "Equals";
        String sE1 = new String("Equals");
        System.out.println(sE == sE1);//false beacuse sE point to constant pool and sE1 is Heap area
        String sE2 = "Check";
        String sE3 = new String("check");
        System.out.println(sE2 == sE3);//area references are different(even string also different)
        String sE4 = "Equals";
        System.out.println(sE == sE4);// both are from the same references
        //== checks the string value and references
    }
}