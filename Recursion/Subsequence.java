package Recursion;

import java.util.ArrayList;

public class Subsequence {
    static boolean flag=false;
    static void subprint(ArrayList<ArrayList> AL,ArrayList<Character> I,String s,int i){
        if(i>=s.length())
        {ArrayList<Character> c=new ArrayList<>(I);
          
            AL.add(c); 
             
            return;
        }
        I.add(s.charAt(i));
        subprint(AL, I, s, i+1);
        I.remove(I.size()-1);
        subprint(AL, I, s, i+1);
    }
    public static void main(String[] args) {
        ArrayList<ArrayList> AL=new ArrayList<>();
        ArrayList<Character> I=new ArrayList<>();
        subprint(AL,I,"abc",0);
      System.out.println(AL);
    }
}
