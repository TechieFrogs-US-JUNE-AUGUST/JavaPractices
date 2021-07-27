public class Arrays43 {
public static void main(String[] args){
    int[] arr = {1, 2, 3, 4, 5};                // declaration and initialisation of array  variables
    int findNumber = 3;
    boolean result = false;
    for (int n : arr) {                             // for each loop to compare each element
        if (n == findNumber) {                     // if number is found result gives true
            result = true;
            break;
        }
    }
    if(result)
            System.out.println(findNumber + " is found.");
    else
            System.out.println(findNumber + " is not found.");
}
}