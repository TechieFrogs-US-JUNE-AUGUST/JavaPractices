package Arrays_Assignment;

import java.util.Arrays;


public class Assignment15 {

    public static void main(String[] args) {
        int[] array1=Assignment1.assignArray();
        Arrays.sort(array1);
        int[] array2=new int[array1.length];
     int i=array1.length-1;
     int j=0;
     while(i>=0)
     {
        array2[j]=array1[i];
        i--;
        j++;

     }
           
        Assignment1.displayArray(array2);
        }
    }
    

