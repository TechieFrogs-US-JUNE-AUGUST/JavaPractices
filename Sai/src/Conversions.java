public class Conversions {
    public static void main(String[] args) throws Exception{
        String s = "100";
        int i = Integer.parseInt(s);
        System.out.println(i);
        String s1 = String.valueOf(i);
        System.out.println(s1);
        System.out.println(i+100); // add the i and 100 value
        System.out.println(s1+100); // s1 will concat with 100
        int i1 = 900;
        String s2 = Integer.toString(i1);      
        String s3 = String.valueOf(i1);
        String s4 = String.format("%d", i1);
        System.out.println(s2+s3+s4);
        long l = 500;
        String sL1 = Long.toString(l);      
        String sL2 = String.valueOf(l);
        System.out.println(sL1);
        System.out.println(sL2);
        String sL = "1000";
        Long sL3 = Long.parseLong(sL);
        System.out.println(sL3);
        float f = Float.parseFloat(sL);
        System.out.println(f);
        double d = Double.parseDouble(sL);
        System.out.println(d);
        double d1 = 1.23;
        String sD = String.valueOf(d1);
        System.out.println(sD);
        float f1 = 9.f;
        String sF = String.valueOf(f1);
        System.out.println(sF);
        String sC = "hello";  
        char ch = sC.charAt(4);
        System.out.println(ch);
        char chS ='S';    
        String sCh = Character.toString(chS); 
        System.out.println(sCh);
        String sB1 = "true";  
        String sB2 = "123";  
        String sB3 = "false";  
        boolean b1 = Boolean.parseBoolean(sB1); 
        System.out.println(b1); 
        boolean b2 = Boolean.parseBoolean(sB2); 
        System.out.println(b2);  
        boolean b3 = Boolean.parseBoolean(sB3);  
        System.out.println(b3);   
        Boolean b4 = Boolean.valueOf(sB1); 
        System.out.println(b4); 
        boolean bS1=true;  
        boolean bS2=false;  
        String sb1=String.valueOf(bS1);  
        String sb2=Boolean.toString(bS2);  
        System.out.println(sb1);  
        System.out.println(sb2);   
    
    }
}
