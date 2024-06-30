import java.util.*;
public class prims {
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
g[0].add(new pair(0, 1, 10));
g[0].add(new pair(0, 2, 15));
g[0].add(new pair(0, 3, 30));
g[1].add(new pair(1, 0, 10));
g[1].add(new pair(1, 3, 40));
g[2].add(new pair(2, 0, 15));
g[2].add(new pair(2, 3, 50));
g[3].add(new pair(3, 1, 40));
g[3].add(new pair(3, 2, 50));

    }
    static class p implements Comparable<p>{
        int node;
        int cost;
        p(int n,int c){
            this.node=n;
            this.cost=c;
        }
       public int compareTo(p i){
return this.cost-i.cost;
        }
    }
    public static void primsalgo(ArrayList<pair> g[],int v){
     PriorityQueue<p> pq=new PriorityQueue<>();
boolean b[]=new boolean[v];
int sum=0;
pq.add(new p(0,0));
while(!pq.isEmpty()){
p c=pq.remove();
if(!b[c.node]){
b[c.node]=true;
sum+=c.cost;
for(int i=0;i<g[c.node].size();i++){
    pq.add(new p(g[c.node].get(i).d, g[c.node].get(i).w));
}

}
}

System.out.println(sum);





    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<pair> g[]=new ArrayList[v];
        creatGraph(g);
        primsalgo( g,v);
    }
}
