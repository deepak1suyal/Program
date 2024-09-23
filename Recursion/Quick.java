package Recursion;

public class Quick {

    
 
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
