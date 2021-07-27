package Arrays;

public class ArraysAssignment25 extends Input {
    public static void main(String[] args) {
        Input inputObject=new Input();
        inputObject.input();
        boolean flag=true;
        for(int i=0;i<inputObject.row;i++){
            for(int j=0;j<inputObject.col;j++){
                if(inputObject.matrix1[i][j]!=inputObject.matrix2[i][j]){
                    flag=false;
                }
            }
        }
        if(flag){
            System.out.println("two matrices are equal");
        }
        else
        System.out.println("two matrices are not equal");
    }
}
