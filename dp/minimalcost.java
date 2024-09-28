package dp;

class Solution {
   
    
    static int fn(int k,int arr[],int i,int sum,int ar[]){
        
        if(i==arr.length-1){
         
           return 0;
        }
        int ans=Integer.MAX_VALUE;
        for(int j=1;j<=k;j++){
            if(ar[i]!=Integer.MAX_VALUE)
            return ar[i];
            if(i+j<arr.length){
            
        int   s=Math.abs(arr[i+j]-arr[i])+fn(k,arr,i+j, sum,ar);
               
               ans=Math.min(ans,s);
               
            }

        }
       return ar[i] =ans;
    }
    
    public int minimizeCost(int k, int arr[]) {
        // code here
        int ar[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            
                ar[i]=Integer.MAX_VALUE;
           
        }
        
     return fn(k,arr,0,0,ar);
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
