package dp;
import java.util.*;
public class dp7 {
    public static int fn(int a[],int i,int l,int dp[][])
    {
if(i==l)
return 0;
if(i>l)
return Integer.MAX_VALUE; 
if(dp[i][l]!=-1)
return dp[i][l];
int m=Integer.MAX_VALUE;
    for(int p=i;p<l;p++){
          int r=fn(a, i, p,dp);
        int t=fn(a, p+1, l,dp);
        int e=a[i-1]*a[p]*a[l];
        if(m>(r+t+e))
       m=r+t+e;
    }
    return dp[i][l]= m;
        
    }
    public static void main(String[] args) {
      
       int a[]={40,20,30,10,30};
       int dp[][]=new int[5][5];
       for(int i=0;i<5;i++)
       Arrays.fill(dp[i],-1);
       System.out.println(fn(a,1,4,dp));
    for(int i=0;i<=4;i++){
    for(int l=0;l<=4;l++){
System.out.print(dp[i][l]+" ");
    }
System.out.println("");}
  for(int i=0;i<5;i++)
Arrays.fill(dp[i],Integer.MAX_VALUE);
    for(int i=0;i<5;i++)
       dp[i][i]=0;
 for(int i=3;i>=1;i--){
    for(int l=0;l<=4;l++){

       // int m=Integer.MAX_VALUE;
    for(int p=i;p<l;p++){
          int r=dp[i][p];
        int t= dp[p+1][l];
        int e=a[i-1]*a[p]*a[l];
        if(dp[i][l]>(r+t+e))
       dp[i][l]=r+t+e;
    }
   
    }
 }
 
System.out.print(dp[1][4]+" ");
 
    }
}
