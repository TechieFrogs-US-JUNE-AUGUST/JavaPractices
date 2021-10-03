public class ObjectConversion {
    public static void main(String[] args) throws Exception {
        String sO = "Sai";  
        Object obj = sO;  
        System.out.println(obj); 
        //System.out.println(obj.getClass().getName());// string
        //Class c= Class.forName("java.lang.String");
        //System.out.println(c.getName());  // String
        //System.out.println(c.getSuperclass().getName());  //object is the super class
    }
}
