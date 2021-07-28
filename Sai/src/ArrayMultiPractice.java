import java.util.Scanner;

import javax.sound.midi.Sequencer.SyncMode;

public class ArrayMultiPractice{
    public static void main(String[] args){
        //int array = {{1,2},{1.2}};// we did not declared the identifer as an array so type mismatch error
        int multiArray[][] = {{1,2},{1,2}};
        for(int row = 0; row < 2 ; row++ ){
            for(int column = 0 ; column <2 ; column++){
                System.out.print( row +"x" + column +"=");
                System.out.print(multiArray[row][column] + " ");

            }
            System.out.println();
        }
        System.out.println(multiArray.length);

        //int multi1[][]; //just declaration, but we can use like this
        //int multi1[][] = new int;//here did not insert the dimensions
        int multi1[][] = new int[3][3];
        //System.out.println(multi1[3][3]);
        //multi1[3][3] = {{1,2,3},{1,2,3}};//array constants can only be used at initalizing
        multi1[0][0] = 1;
        multi1[0][1] = 2;
        multi1[0][2] = 3;
        multi1[1][0] = 4;
        multi1[1][1] = 5;
        multi1[1][2] = 6;
        multi1[2][0] = 7; 
        multi1[2][1] = 8;
        multi1[2][2] = 9;
        for(int row = 0; row < 3 ; row++ ){
            for(int column = 0 ; column <3 ; column++){
                System.out.print( row +"x" + column +"=");
                System.out.print(multi1[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println(multi1.length);
        Scanner scannerArray = new Scanner(System.in);
        int multi2[][] = new int[3][3];
        System.out.println("give input");
        for(int row = 0; row < 3 ; row++ ){
            for(int column = 0 ; column <3 ; column++){
                multi2[row][column] =  scannerArray.nextInt();
            }
        }
        for(int row = 0; row < 3 ; row++ ){
            for(int column = 0 ; column <3 ; column++){
                //System.out.print( row +"x" + column +"=");
                System.out.print(multi1[row][column] + " ");
            }
        System.out.println();
        scannerArray.close();
        }
    }  
}
