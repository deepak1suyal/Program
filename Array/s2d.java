package Array;

import java.util.Arrays;

import Comparator.compare;

public class s2d {
    public static void main(String[] args) {
        int a[][]={{6,8},{1,9},{2,4},{4,7}};
   Arrays.sort(a,(arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
   for(int i=0;i<a.length;i++){
    for(int j=0;j<a[i].length;j++){
System.out.print(a[i][j]);
    }
    System.out.println("");
   }

    }
}
