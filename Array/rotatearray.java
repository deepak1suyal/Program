package Array;

public class rotatearray {
    static void swap(int a,int b,int arr[]){
        int k=arr[a];
        arr[a]=arr[b];
        arr[b]=k;
    }
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
  int k=d%arr.length;
  int l=0;
  int h=k-1;
  while(l<h){
      swap(l,h,arr);
      l++;h--;
  }
    l=k;
   h=arr.length-1;
  while(l<h){
      swap(l,h,arr);
      l++;h--;
  }
    l=0;
   h=arr.length-1;
  while(l<h){
      swap(l,h,arr);
      l++;h--;
  }
  
  
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int d=2;
        rotateArr(arr, d);
        for (int i : arr) {
            System.out.println(i);
        }
       
    }
}
