package dp;
import java.util.Arrays;

public class dp8 {


public static int fn(int a[],int i,int j,int dp[][]){
    if(i>j)
    return 0;
    if(dp[i][j]!=-1)
    return dp[i][j];
int min=Integer.MAX_VALUE;
 for(int p=i;p<=j;p++){
int y=fn(a, i, p-1,dp);
int z=fn(a,p+1,j,dp);
int w=a[j+1]-a[i-1];
if(min>(y+z+w))
min=y+z+w;
 }
return dp[i][j]=min;
}

 public static void main(String[] args) {
    int a[]={0,5,6,1,4,2,9};
    Arrays.sort(a);
   int dp[][]=new int[7][7];
   for(int i=0;i<7;i++)
   Arrays.fill(dp[i],-1);

   // System.out.println(fn(a,1,a.length-2,dp));
    for(int i=0;i<7;i++)
     for(int j=0;j<7;j++){
     if(i>j)
     dp[i][j]=0;
     }
for(int i=5;i>0;i--)
     for(int j=i;j<6;j++){

int min=Integer.MAX_VALUE;
 for(int p=i;p<=j;p++){
int y=fn(a, i, p-1,dp);
int z=fn(a,p+1,j,dp);
int w=a[j+1]-a[i-1];
if(min>(y+z+w))
min=y+z+w;
 }
dp[i][j]=min;

     }

     System.out.println(dp[1][5]);
 }   
}
