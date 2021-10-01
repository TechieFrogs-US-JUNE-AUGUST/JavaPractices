// Write a function to show whether the product and sum of two arrays is equal or not having same array length.

package CodingAssessment_Questions;

import java.util.Arrays;

public class Prog2 {

    public static boolean isEqual(int arr1[], int arr2[]){
        int n= arr1.length;
        int m= arr2.length;

        if(n!=m){                      //if lengths of array are not equal means array are not equal
            return false;
        }
        Arrays.sort(arr1);            //sorting both the arrays
        Arrays.sort(arr2);
        for(int i=0; i<n; i++){
            if(arr1[i]!=arr2[i])
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr1[]= {1,2,3,4,5};                       //declaring the array1
        int arr2[]= {5,4,3,2,1};                       //declaring the array2

        if(isEqual(arr1, arr2))
        System.out.println("Yes both arrays prouduct and sum are equal");
        else
        System.out.println("No both arrays product and sum are not equal");
    }
}
