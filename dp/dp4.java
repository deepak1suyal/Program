package dp;
import java.util.Arrays;

public class dp4 {
    static int fn(int p[],int w[],int i,int wi,int dp[][]){
    if(dp[i][wi]!=-1)
    return dp[i][wi];
        if(i==0){
        if(wi>=w[i])
        return p[i];
        else 
        return 0;
     }

        int pi=0,np=0;
       if(wi>=w[i])
        pi=p[i]+fn(p,w,i-1,wi-w[i],dp);
        np=fn(p,w,i-1,wi,dp);
        return dp[i][wi]=Math.max(pi, np);
    }

    public static void main(String[] args) {
        int p[]={1,2,3};
         int w[]={4,5,1};
         int dp[][]=new int[3+1][5];
         for(int i=0;i<3;i++)
           Arrays.fill(dp[i],-1);
        
     // System.out.println(fn(p,w,2,4,dp));
int pre[]=new int[5];
int cur[]=new int[5];
    for(int i=0;i<5;i++)
    if(i>=w[0])
    dp[0][i]=p[0];
    else 
    dp[0][i]=0;
// for(int i=0;i<5;i++)
// System.out.print(dp[0][i]);
// System.out.println("");
Arrays.fill(pre,-1);
Arrays.fill(cur,-1);
 for(int i=1;i<3;i++)
   for(int j=0;j<5;j++){
     int pi=0,np=0;
       if(j>=w[i])
        pi=p[i]+dp[i-1][j-w[i]];
        np=dp[i-1][j];
         dp[i][j]=Math.max(pi, np);
   }

   for(int i=0;i<3;i++){
   for(int j=0;j<5;j++){
    System.out.print(dp[i][j]);}
 System.out.println("");}
   

   System.out.println("");


Arrays.fill(pre,-1);
Arrays.fill(cur,-1);
    for(int i=0;i<5;i++)
    if(i>=w[0])
    pre[i]=p[0];
    else 
    pre[i]=0;
//for(int i=0;i<5;i++)
 //System.out.print(pre[i]);

 for(int i=0;i<3;i++){
   for(int j=0;j<5;j++){
     int pi=0,np=0;
       if(j>=w[i])
        pi=p[i]+pre[j-w[i]];
        np=pre[j];
         cur[j]=Math.max(pi, np);
   }
   pre=cur;
   cur=new int[5];
   for(int j=0;j<5;j++){
    System.out.print(pre[j]);}
    System.out.println("");
  }
  // System.out.println(pre[4]);
    }
}
