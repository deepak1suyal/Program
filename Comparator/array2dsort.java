package Comparator;

import java.util.Arrays;

public class array2dsort {
    public static void main(String[] args) {
         int arr[][]={{9, 2, 3 ,4 ,5 ,6},

{13 ,14 ,15 ,16 ,17 ,18},{7, 8, 9, 10, 11, 12}
};
Arrays.sort(arr,(arr1,arr2) -> {
    return arr1[0]-arr2[0];
});
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println("");
}
    }
}
