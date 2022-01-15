package Assignments;

public class matrixIsLowerTriangularOrNot {
    public static boolean is_lower_triangular(int arr[][]){
        boolean flag=true;
        if(arr.length!=arr[0].length){
            flag=false;
        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if( i<j ){
                    if(arr[i][j]!=0){
                        flag=false;
                    }
                }
                else{
                    if(arr[i][j]==0){
                        flag=false;
                    }
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int arr[][]= {{2, 0, 1},
                      {4, 3, 0},
                      {6, 8, 11}};
        System.out.println(is_lower_triangular(arr));

    }
}
