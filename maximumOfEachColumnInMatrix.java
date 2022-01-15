package assignments;

public class maximumOfEachColumnInMatrix {
    public static void main(String[] args) {
        int arr[][]={{11, 87, 60},
                     {45, 18, 0},
                     {20, 70, 11}};
        for(int i=0;i<arr[0].length;i++){
            int max=0;
            for(int j=0;j< arr.length;j++){
                if(max<arr[j][i])
                    max=arr[j][i];
            }
            System.out.println(max);
        }
    }
}
