package geeksterAssignment;

import java.util.Arrays;

class remove_duplicateNos {
    static int[] removeDuplicate(int arr[]) {
        if (arr.length == 0 || arr.length == 1) {
            return arr;
        }

        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j]=arr[arr.length-1];

        return temp;
    }

    public static void main (String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5,6};
        System.out.println(Arrays.toString(removeDuplicate(arr)));
    }
}
