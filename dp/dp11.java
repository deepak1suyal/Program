package dp;
public class dp11 {

    public static int fn(int a[][],int i,int j,int k[][]){
if(i==0&&j==0)
return a[i][j];

if(i<0||j<0)
return 0;
int e=Math.min(fn(a, i-1, j,k),fn(a, i, j-1,k));

        return k[i][j] = (a[i][j]+Math.min(e,fn(a, i-1, j-1,k)));
    }
   public static void main(String[] args) {
    int a[][]={{0,1,1,1},{1,1,1,1},{0,1,1,1}};
    int k[][]=new int[3][4];
    System.out.println(fn(a,2,3,k));
    int s=0;
    for(int i=0;i<3;i++){
    for(int y=0;y<4;y++)
    {
        System.out.print(k[i][y]);
        s+=k[i][y];
    }
    System.out.println("");
    }

System.out.println(s);

   } 
}
