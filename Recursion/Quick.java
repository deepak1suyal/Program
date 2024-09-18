package Recursion;

public class Quick {

    
  static  int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // The main function that implements QuickSort
     static void sort(int arr[], int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);
            // Recursively sort elements before partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    static int fn(int a[],int i,int l){
        int p=i-1;
        for(int k=i;k<=l;k++){
           
           if(a[k]<=a[l]){
            p++;
              int y=a[p];
              a[p]=a[k];
              a[k]=y;
             
           }
        }    
       
       
        return p;
    }


    static void Qsort(int a[],int i,int l){

        if(i<l){
       int m=fn(a,i,l);
          //  int m=partition(a, i, l);
            System.out.println(m);
            Qsort(a, i, m-1);
            Qsort(a, m+1, l);
        }
    }
    public static void main(String[] args) {
        int arr[]={3,1,2,4,1,5,2,6,4};
        Qsort(arr,0,arr.length-1);
        for (int arr2 : arr) {
            System.out.print(arr2);
        }
    }
}
