package Recursion;

import java.util.Arrays;

public class nQueen {
    static void print(char arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
    public static boolean check(char arr[][],int i,int j){
int ci=i;
int cj=j;
while(cj>=0){
if(arr[i][cj]=='Q')
return false;
cj--;
}
cj=j;
while (ci>=0) {
    if(arr[ci][j]=='Q')
    return false;
    ci--;
}
ci=i;
while(ci>=0&&cj>=0){
    if(arr[ci][cj]=='Q'){
        return false;
    }
    ci--;
    cj--;
}
ci=i;
cj=j;
while(ci>=0&&cj<arr[0].length){
    if(arr[ci][cj]=='Q')
    return false;
    ci--;
    cj++;
}
return true;
    }

static boolean fn(char arr[][],int i, int j){

if(i==arr.length)
return true;

    for(int k=0;k<arr.length;k++){
        if(check(arr, i, k)){
           arr[i][k]='Q';
          if( fn(arr, i+1, j))
          return true;
           arr[i][k]='.';
        }
    }
    return false;
}
    public static void main(String[] args) {
        char arr[][]=new char[4][4];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(arr[i],'.');
        }
        print(arr);
        fn(arr,0,0);
        print(arr);

    }


}
