package dp;
import java.util.*;
public class dp10 {
    public static int fn(int a[][],int i,int j){
     if(i==2&&j==2)
     return a[i][j];
if(i>2||j>2)
return Integer.MAX_VALUE;

        return a[i][j]+Math.min(fn(a, i+1, j),fn(a, i, j+1));
    }
 public static void main(String[] args) {
    int a[][]={{1,3,1},{1,5,1},{4,2,1}};
    System.out.println(fn(a,0,0));
 }   
}
