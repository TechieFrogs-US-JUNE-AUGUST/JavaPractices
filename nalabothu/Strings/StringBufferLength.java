public class StringBufferLength {
    public static void main(String[] args)
    {
        StringBuffer sbStr = new StringBuffer();
        String strDays[] = {"Sun", "Mon", "Tuesday", "Wed"};
        
        for(int i = 0; i < strDays.length; i++)
        {            
            
            //empty StringBuilder
            sbStr.setLength(0);
            
            sbStr.append(strDays[i]);
            
            System.out.println(sbStr);
        }
    }
    }
    

