import java.util.*;
public class gek {
    static int minJumps(int[] arr){
        // your code 
        int n=arr.length;
        int i=0;
        int c=0;
        
        while(i<n){ 
            c++;
            int l=arr[i];
            int max=0;
            int k=0;
            for(int j=i+1;j<=(l+i);j++){
                if(j<n){
               if(max==0){ 
                max=arr[j];
                 k=j;  
               }
               else{
                   if(max<=arr[j]){
                       max=arr[j];
                       k=j;
                   }
               }
            }
           else {
return c;
            }
        
        }i=k;
            
        }
        return c;
    }
    static int a(int []ar,int i,int l){
if(i==l-1)
return 0;
int min=Integer.MAX_VALUE-5;
for(int j=i+1;j<=ar[i];j++){
    min=Math.min(min,a(ar,j , l)+1);
}
return min;
    }
    static int cminJumps(int[] arr){
        int p=0,d=0,c=0;
        for(int i=0;i<arr.length-1;i++){
            if(i>d)
            return -1;
            d=Math.max(d,arr[i]+i);
            if(i==p){
              
                p=d;
                c++;
            }
        }
        if(d<arr.length-1)
        return -1;
        return c;
    }
   public static void main(String[] args) {
    int arr[]={1 ,3, 5 ,8 ,9, 2, 6, 7, 6 ,8, 9};
    System.out.println(minJumps(arr));
    System.out.println(a(arr,0,arr.length));
   } 
}
