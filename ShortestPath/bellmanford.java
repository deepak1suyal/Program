import java.util.*;
public class bellmanford {
    static class pair{
        int s;
        int d;
        int w;
        public pair(int s,int d,int w){
            this.s=s;
            this.d=d;
            this.w=w;

        }
    }

    public static void creatGraph(ArrayList<pair> g[]){
for(int i=0;i<g.length;i++){
    g[i]=new ArrayList<pair>();
}
g[0].add(new pair(0, 1, 2));
g[0].add(new pair(0, 2, 4));
g[1].add(new pair(1, 2, -4));

g[2].add(new pair(2, 3, 2));
g[3].add(new pair(3, 4, 4));
g[4].add(new pair(4, 1, -1));
    }
    
    public  static void bell(ArrayList<pair> g[],int s,int v){
int distance[]=new int[v];
for(int i=0;i<v;i++){
    if(i!=s){
        distance[i]=Integer.MAX_VALUE;
    }

}
for(int i=0;i<v-1;i++){
    for(int y=0;y<v;y++){
    for(int j=0;j<g[y].size();j++){
      pair p=g[y].get(j);  
      int u=p.s;
       int vi=p.d; 
if(distance[u]!=Integer.MAX_VALUE && distance[u]+p.w<distance[vi]){
distance[vi]=distance[u]+p.w;
}


    }
    }
}
 for(int y=0;y<v;y++){
    for(int j=0;j<g[y].size();j++){
      pair p=g[y].get(j);  
      int u=p.s;
       int vi=p.d; 
if(distance[u]!=Integer.MAX_VALUE && distance[u]+p.w<distance[vi]){
System.out.println("negativ weight cycle");
}


    }
    }
for(int i=0;i<5;i++)
System.out.print(distance[i]+" ");

    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<pair> g[]=new ArrayList[v];
        creatGraph(g);
       bell(g, 0,v);
    }
}
