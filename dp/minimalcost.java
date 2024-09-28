package dp;

class Solution {
    static  int ans=Integer.MAX_VALUE;
     
     static void fn(int k,int arr[],int i,int sum){
         
         if(i==arr.length-1){
              ans=Math.min(ans,sum);
            return;
         }
        
         for(int j=1;j<=k;j++){
             if(i+j<arr.length){
                
             fn(k,arr,i+j, sum+Math.abs(arr[i+j]-arr[i]));
                
             }
             
         }
        
         
     }
     
     public int minimizeCost(int k, int arr[]) {
         // code here
         fn(k,arr,0,0);
      return ans;
     }
 }
 
public class minimalcost {
    public static void main(String[] args) {
        int arr[]={
            92 ,5, 3, 54, 93 ,83, 22};
        Solution s=new Solution();
      System.out.println(s.minimizeCost(8, arr));
        
    }
}
