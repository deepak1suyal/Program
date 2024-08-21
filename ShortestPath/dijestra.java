import java.util.*;
public class dijestra {
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
g[1].add(new pair(1, 3, 7));
g[1].add(new pair(1, 2, 1));
g[2].add(new pair(2, 4, 3));
g[3].add(new pair(3, 5, 1));
g[4].add(new pair(4, 3, 2));
g[4].add(new pair(4, 5, 5));
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
    static void shortestpath( ArrayList<pair> g[],  int w[], boolean v[]){
        PriorityQueue<p> pq=new PriorityQueue<>();
       pq.add(new p(0, 0));
       while(!pq.isEmpty()){
        p u=pq.remove();
        
        if(!v[u.node]&& u.node<=4){
            v[u.node]=true;
        for(int i=0;i<g[u.node].size();i++){
        if(g[u.node].get(i).w+w[u.node]<w[g[u.node].get(i).d]){
            w[g[u.node].get(i).d]=g[u.node].get(i).w+w[u.node];
        }
            pq.add(new p(g[u.node].get(i).d,g[u.node].get(i).w));
        }
       }}
    }
    
    public static void main(String[] args) {
        int v=5;
        ArrayList<pair> g[]=new ArrayList[v];
        creatGraph(g);
        int weight[]=new int[6];
        
        Arrays.fill(weight,Integer.MAX_VALUE);
        weight[0]=0;
        boolean visited[]=new boolean[6];
shortestpath(g,weight,visited);
for(int i=0;i<weight.length;i++)
System.out.println(weight[i]);
    }
}

