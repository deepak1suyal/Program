package Array;
class ficir {
    void print(int mat[][]){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
               System.out.print(mat[i][j]);
            }
            System.out.println("");
        }
    }
    public void setMatrixZeroes(int[][] mat) {
        
        int a=-1;
        int b=-1;
         for(int i=0;i<mat[0].length;i++)
         {if(mat[0][i]==0)
        b=0;
         }
         for(int i=1;i<mat.length;i++){
             if(mat[i][0]==0)
            a=0;
         }
        for(int i=1;i<mat.length;i++){
            for(int j=1;j<mat[i].length;j++){
                if(mat[i][j]==0)
                {
                    mat[0][j]=0;
                    mat[i][0]=0;
                }
            }
        }
      
          for(int i=1;i<mat.length;i++){
            for(int j=1;j<mat[i].length;j++){
                if(mat[0][j]==0||mat[i][0]==0)
                {
                    
                    mat[i][j]=0;
                    
                }
            }
        }
        
          for(int i=1;i<mat.length;i++){
           if(a==0)
           {
               mat[i][0]=0;
           }
          
        }
     
         for(int i=1;i<mat[0].length;i++){
             
           if(b==0){
               mat[0][i]=0;
           }
          
        }
        
        if(a==0||b==0)
        mat[0][0]=0;
        
    }
}
public class fillcircle {
    public static void main(String[] args) {
        ficir n=new  ficir();

        int mat[][]={{
            -5 ,2, 3, 0},{
            -2 ,-5 ,-2 ,-5},{
            -1 ,4, 4, -2},{
            2 ,5 ,1, 4}};
        n.setMatrixZeroes(mat);
    }
}
