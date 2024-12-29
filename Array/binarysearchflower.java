package Array;
import java.util.Arrays;

class bS{
    static boolean fn(int mi,int arr[],int m,int k){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(mi>=arr[i])
            c++;
        }
        if(c>=(m*k))
        return true;
        else return false;
    }
    public static int minDaysBloom(int m, int k, int[] arr) {
        // code here
        if(m*k>arr.length)
        return -1;
        Arrays.sort(arr);
        int l=1;
        int h=arr[arr.length-1];
        while(l<=h){
            int mi=(l+h)/2;
            if(fn(mi,arr,m,k)){
               h=mi-1; 
            }
            else {
                l=mi+1;
            }
        }
        return l;
    }
}
public class binarysearchflower {
    public static void main(String[] args) {
        int arr[]={3 ,4, 2, 7, 13, 8, 5};
           int m= 3;
           int k= 2;
           bS b=new bS();

           System.out.println(bS.minDaysBloom(m, k, arr));
    }
}
