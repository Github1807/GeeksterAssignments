package Assignments;

public class averageOfnumbers {
    public static void main(String[] args) {
        int count=0;
        int num=12;
        int sum=0;
        while(num<16){
            count=count+1;
            sum+=num;
            num=num+1;
        }
        System.out.println(sum/count);
    }
}
