package dp;
import java.util.Arrays;

public class dp1 {
    static int c=0;
    public static int re(int a[],int n,int dp[]){
  if(n<0)
  return 0;
if(dp[n]!=-1)
return dp[n];
int e=-1,o=-1;
 e=a[n]+re(a,n-2,dp);
 o=0+re(a,n-1,dp);

 return dp[n]=Math.max(e,o);


    }
    public static void main(String[] args) {
        int a[]={2,7,9,3,1};
        int dp[]=new int[5];
        Arrays.fill(dp,-1);
        System.out.println(re(a,a.length-1,dp));
        int dp1[]=new int[5];
        Arrays.fill(dp1,0);
         dp1[0]=2;
for(int i=1;i<5;i++){
//if(dp[i]!=-1)
// dp[i];
int e=0,o=0;
if(i>=2)
 e=a[i]+dp[i-2];
 if(i>=1)
 o=0+dp[i-1];

  dp[i]=Math.max(e,o);


}
System.out.println(dp[4]);

    }
}
