//Sort Elements in Lexicographical Order(Dicionary Order)
package Strings;
public class Assignment2 {
        public static void main(String[] args) {
            String st1;
            String st[] = {"Nag","Siva","Rama","Shiva","Nihal","Nageswara Rao"};
            //String objf = new String(st[]);
            for(int i=0;i<st.length;i++)
            {
                for(int j=i+1;j<st.length;j++)
                {
                    int h=(st[i].compareTo(st[j]));             //if condition to check compare current string to next string
                   if(h>0)
                   {
                       st1 =st[i];
                       st[i]=st[j];
                       st[j]=st1;
                   }
                    }
                }
                for(int k=0;k<st.length;k++)
                {
                    System.out.print(st[k] +" ");
                }
                System.out.println();
            }

        }




