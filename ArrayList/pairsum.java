package ArrayList;

import java.util.ArrayList;

class Solution {

    static boolean fn(int d, ArrayList<Integer> a,int k){
    
        for(int i=0;i<a.size();i++){
          if(((a.get(i)+d)%k)==0){
            a.remove(i);
            return true;
          }
        }
        return false;
    }
        public boolean canArrange(int[] arr, int k) {
     ArrayList<Integer> a=new ArrayList<Integer>();
       int mid=arr.length/2;
       for(int i=0;i<mid;i++){
         a.add(arr[i]);
       }
          for(int i=mid;i<arr.length;i++){
         if(fn(arr[i],a,k))
        continue;
        else
        return false;
       }
    return true;
    
    
        }
    }
public class pairsum {
    public static void main(String[] args) {
        int a[]={-1,1,-2,2,-3,3,-4,4};
        Solution s=new Solution();
        System.out.println(s.canArrange(a, 3));
    }
}
