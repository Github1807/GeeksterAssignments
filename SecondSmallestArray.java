package geeksterAssignments;

public class SecondSmallestArray {
    public static void main(String[] args) {
        int arr[]={8,7,6,5,4,3,2,1};
        int Sec_min=Integer.MAX_VALUE;
        int min=Sec_min-1;
        for(int i=0;i<arr.length;i++){
            int temp=0;
            if(min>arr[i]){
                temp=min;
                min=arr[i];
                Sec_min=temp;
            }
        }
        System.out.println(Sec_min);
    }
}
