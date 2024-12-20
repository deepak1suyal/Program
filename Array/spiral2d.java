package Array;

import java.util.ArrayList;

class spiral {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        ArrayList<Integer> ll=new ArrayList<>();
        int l=0;
        int lh=mat.length;
        int r=mat[0].length;
        int rh=0;
        while(l<lh&&rh<r){
            for(int i=rh;i<r;i++){
                ll.add(mat[l][i]);
            }
            l++;
             for(int i=l;i<lh;i++){
                ll.add(mat[i][r-1]);
            }
            if(l==lh)
            break;
            r--;
            for(int i=r-1;i>=rh;i--){
                ll.add(mat[lh-1][i]);
            }
            lh--;
            if(r==rh)
            break;
               for(int i=lh-1;i>=l;i--){
                ll.add(mat[i][rh]);
            }
            rh++;
            
        }
        return ll;
    }
}

public class spiral2d {
    public static void main(String[] args) {
        spiral s=new spiral();
        int arr[][]={{1, 2, 3 ,4 ,5 ,6},
{7, 8, 9, 10, 11, 12},{
13 ,14 ,15 ,16 ,17 ,18}};
System.out.println(s.spirallyTraverse(arr));
    }
}
