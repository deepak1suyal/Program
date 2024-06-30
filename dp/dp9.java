package dp;
import java.util.Arrays;

public class dp9 {
    public static int fn(int a[][],int i,int j,int dp[][]){
if(i==a[0].length-1&&j==2)
return 1;
if(i>1||j>2)
return 0;
if(dp[i][j]!=0)
return dp[i][j];

        return dp[i][j]=fn(a,i,j+1,dp)+fn(a, i+1, j,dp);
    }
    public static void main(String[] args) {
        int a[][]=new int[2][3];
        int dp[][]=new int[2+1][3+1];
        for(int i=0;i<2;i++)
        Arrays.fill(dp[0],0);

       System.out.println(fn(a,0,0,dp));
for(int i=0;i<3;i++){
for(int j=0;j<4;j++){
  System.out.print(dp[i][j]+" ");
}
System.out.println("");
}

      for(int i=0;i<2;i++)
        Arrays.fill(dp[0],0);  
     dp[1][2]=1;
     for(int i=0;i>=0;i--){
         for(int j=2;j>=0;j--){
            
            int ua=dp[i][j+1];
            int b=dp[i+1][j];

         dp[i][j]=ua+b;
         }

     }
    System.out.println("");
for(int i=0;i<3;i++){
for(int j=0;j<4;j++){
  System.out.print(dp[i][j]+" ");
}
System.out.println("");
}
    }
}
