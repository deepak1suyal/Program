package Array;

import java.util.Arrays;

public class towdarray {
    public static void main(String[] args) {
        int arr[][]=new int[10][20];
      for(int i=0;i<10;i++)
        Arrays.fill(arr[i],0);
        System.out.println(arr[0].length);
        System.out.println(arr.length);
    }
}
