package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class permutation {
    public static void fn(int arr[],int visited[],
    ArrayList<Integer> l,int i){
  if(l.size()==arr.length){
    System.out.println(l);
    return;
  }

for(int k=0;k<visited.length;k++){
    if(visited[k]==0){
l.add(arr[k]);
visited[k]=1;
fn(arr, visited, l, k+1);
visited[k]=0;
l.remove(l.size()-1);}
}
//fn(arr, visited, l, i+1);
    }
    public static void main(String[] args) {
        
        int arr[]={1,2,3};
        int visited[]=new int[arr.length];
        Arrays.fill(visited,0); 
        ArrayList<Integer> l=new ArrayList<>();
        fn(arr,visited,l,0);      
  
  
  
    }
}
