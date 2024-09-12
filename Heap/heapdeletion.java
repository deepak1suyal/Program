package Heap;
import java.util.ArrayList;

public class heapdeletion {
     static void heapsort(ArrayList<Integer> b,int i,int n){
      
        int u=b.get(i);
        b.set(i,b.get(n));
        b.set(n, u);
        
        int y=0;
        if((2*i)+1<n && (2*i)+2<n){
        if(b.get((2*i)+1)>b.get((2*i)+2)){
         y=(2*i)+1;

        }
        else{
             y=(2*i)+2;
        }}
        else if((2*i)+1<n){
        y=(2*i)+1;
    }
    else if((2*i)+2<(n)){
        y=(2*i)+2;
    }

        while(b.get(i)<b.get(y)){
      
          int t=b.get(y);
          b.set(y,b.get(i));
          b.set(i,t);
          i=y;
          if((2*i)+1<(n)&&(2*i)+2<(n)){
          if(b.get((2*i)+1)>b.get((2*i)+2)){
         y=(2*i)+1;

        }
        else{
             y=(2*i)+2;
        }
    }
    else if((2*i)+1<(n)){
        y=(2*i)+1;
    }
     else if((2*i)+2<(n)){
        y=(2*i)+2;
    }

        }
    }

    static void deletion(ArrayList<Integer> b,int i){
        int n=b.size()-1;
        int u=b.get(0);
        b.set(0, b.get(n));
        b.set(n, u);
        b.remove(n);
        int y=0;
        if((2*i)+1<(b.size())&&(2*i)+2<(b.size())){
        if(b.get((2*i)+1)>b.get((2*i)+2)){
         y=(2*i)+1;

        }
        else{
             y=(2*i)+2;
        }}
        else if((2*i)+1<(b.size())){
        y=(2*i)+1;
    }
    else if((2*i)+2<(b.size())){
        y=(2*i)+2;
    }

        while(b.get(i)<b.get(y)){
      
          int t=b.get(y);
          b.set(y,b.get(i));
          b.set(i,t);
          i=y;
          if((2*i)+1<(b.size())&&(2*i)+2<(b.size())){
          if(b.get((2*i)+1)>b.get((2*i)+2)){
         y=(2*i)+1;

        }
        else{
             y=(2*i)+2;
        }
    }
    else if((2*i)+1<(b.size())){
        y=(2*i)+1;
    }
     else if((2*i)+2<(b.size())){
        y=(2*i)+2;
    }

        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> b=new ArrayList<Integer>();
        b.add(90);
              b.add(80);
                    b.add(70);
                          b.add(20);
                                b.add(10);
                                 b.add(50);
                          b.add(60);
           System.out.println(b);
  /* deletion(b,0);
      System.out.println(b);*/  
     for(int i=6;i>0;i--)
     {heapsort(b,0,i);
     System.out.println(b);}
    
    
      

    }
}
