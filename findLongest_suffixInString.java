package Assignments;

import java.util.Arrays;

public class findLongest_suffixInString {
    public static int small(String arr[]){
        int min=Integer.MAX_VALUE;
        int pos=0;
        for(int i=0;i< arr.length;i++){
            int len=arr[i].length();
            if(min>len){
                min=len;
                pos=i;
            }
        }
        return pos;
    }
    public static void main(String[] args) {
        String arr[]={"Tejaswini","Meshram","geekster","Tejaswini"};
        String small=arr[small(arr)];
        int min=small.length();
        int count;
        int pos=0;
        int m=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            count=0;
            for(int j=arr[i].length()-1,k=min-1;j>=arr[i].length()-min&& k>=0;j--,k--){
                if(arr[i].charAt(j)==small.charAt(k)){
                count++;
                }
                else{
                    break;
                }
            }
            if(count<m){
                m=count;
            }
        }
        System.out.println(arr[0].substring(arr[0].length()-m, arr[0].length()));
    }
}
