package dp;
import java.util.Arrays;

public class dp3 {
    static int fn(int a[],int l,int s,int dp[][]){
        if(l==0){
         if(s % a[l]==0)
        return 1;
        else
        return 0;}
int p=0,n;
if(dp[l][s]!=-1)
return dp[l][s];
if(s>=a[l])
p=fn(a, l, s-a[l],dp);

n=fn(a, l-1, s,dp);

return dp[l][s]=p+n;
    }
    public static void main(String[] args) {
      int a[]={1,2,3};
      int dp[][]=new int[a.length][4+1];
      for(int i=0;i<a.length;i++) 
      Arrays.fill(dp[i],-1); 
     // System.out.println(fn(a,2,4,dp));
     //moization

     int cur[]=new int[5];
    int pre[]=new int [5];
     for(int j=0;j<5;j++)
     if(j%a[0]==0)
     pre[j]=1;
     else
      pre[j]=0;
    
   for(int i=1;i<3;i++){
   for(int j=0;j<5;j++){
    int p=0,n=0;
   if(j>=a[i])
p=cur[j-a[i]];

n=pre[j];

 cur[j]=p+n; 
}
pre=cur;
cur=new int[5];


}
      System.out.println(pre[4]);

     
    }
}
