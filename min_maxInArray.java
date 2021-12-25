package geeksterAssignments;

public class min_maxInArray {
    public static void main(String[] args) {
        int arr[]={2,3,4,51,61,7,8,9,1,10};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
               min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(min+" , "+max);

    }
}
