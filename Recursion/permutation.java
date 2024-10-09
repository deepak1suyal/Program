package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class permutation {
    static void swap(int arr[],int a,int b){
        int c=arr[a];
        arr[a]=arr[b];
        arr[b]=c;
    }
    public static void fn(int arr[],int visited[],
    ArrayList<Integer> l){
  if(l.size()==arr.length){
    System.out.println(l);
    return;
  }

for(int k=0;k<visited.length;k++){
    if(visited[k]==0){
l.add(arr[k]);
visited[k]=1;
fn(arr, visited, l);
visited[k]=0;
l.remove(l.size()-1);}
}
//fn(arr, visited, l, i+1);
    }

static void withoutspacefn(int arr[],int visited[],int i){

if(i==3){for(int p=0;p<arr.length;p++)
    System.out.print(arr[p]);
    System.out.println();
    return;
}
    for(int k=i;k<arr.length;k++){
        swap(arr, i, k);
        withoutspacefn(arr, visited, i+1);
        swap(arr, i, k);
    }
} 

    public static void main(String[] args) {
        
        int arr[]={1,2,3};
        int visited[]=new int[arr.length];
        Arrays.fill(visited,0); 
        ArrayList<Integer> l=new ArrayList<>();
      //  fn(arr,visited,l);      
  
       withoutspacefn(arr,visited,0);
  
    }
}
