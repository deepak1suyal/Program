package String;

import java.util.Arrays;

public class sortst {
 public static void main(String[] args) {
    String s="deepak";
    char c[]=new char[s.length()];
   
    for(int i=0;i<s.length();i++){
c[i]=s.charAt(i);
    }
    Arrays.sort(c);
    StringBuffer ns=new StringBuffer();
    for(int i=0;i<c.length;i++){
        ns.append(c[i]);
            } 
            System.out.println(ns.toString());
 }   
}
