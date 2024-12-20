package GeeksforGeeks;
class Solution {
     int check(int arr[],int k,int i){
        int s=0;
        int su=1;
        for(int j=0;j<arr.length;j++){
            if(s+arr[j]<=i)
            s+=arr[j];
            else
            {
                s=arr[j];
                su+=1;
               
            }
        }
        
        return su;
       
    }
    public  int findPages(int[] arr, int k) {
        // code here
        int max=-1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]>max)
            max=arr[i];
        }
        for(int i=max;i<=sum;i++){
            if(check(arr,k,i)>k)
            continue;
            else
            return i;
        }
        return -1;
    }
}
public class bookprblem {
    public static void main(String[] args) {
        int arr[]={15,10,19,10,5,18,7};
        Solution s=new Solution();
      System.out.println( s.findPages(arr,5 )); 
    }
}
