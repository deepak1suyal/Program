package dp;
import java.util.Arrays;

public class dp5 {
public static int fn(String s1,int l1,String s2,int l2,int dp[][]){
if(l1==-1||l2==-1)


return 0;
if(dp[l1][l2]!=-1)
return dp[l1][l2];

    int r;
if(s1.charAt(l1)==s2.charAt(l2))
 {r=1+fn(s1, l1-1, s2, l2-1,dp);
 }
else
r=0+fn(s1, l1, s2, l2-1,dp);

int p=0+fn(s1, l1-1, s2, l2,dp);
return dp[l1][l2]=Math.max(r,p);


}
    public static void main(String[] args) {
        String s1,s2;
        s1="AGGTAB";
        s2="GXTXAYB";
        int dp[][]=new int[6+1][7+1];
     //   for(int i=0;i<6;i++){
      //  Arrays.fill(dp[i],-1);}

      // System.out.println(fn(s1,5,s2,6,dp)); 
int pre[]=new int[8];
int cur[]=new int[8];
       for(int i=1;i<7;i++)
       {
       for(int y=1;y<8;y++){

    int r;
if(s1.charAt(i-1)==s2.charAt(y-1))
 {r=1+pre[y-1];
 }
else
r=0+cur[y-1];

int p=0+pre[y];
 cur[y]=Math.max(r,p);


       }
    pre=cur;
    cur=new int[8];

    }
       System.out.println(pre[7]);

    }
}
