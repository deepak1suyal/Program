class bublesort{
   static void swap(int a,int b,int arr[]){
int c=0;
c=arr[a];
arr[a]=arr[b];
arr[b]=c;
    }
    public static int buble(int arr[]){
        int c=0;
        boolean f=false;
        for(int i=0;i<arr.length;i++){
            f=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                swap(j,j+1,arr);
                f=true;
                c++;}
            }System.out.println(" ");
            for (int arr2 : arr) {
                System.out.print(arr2);
              } 
            if(!f)
            break;
        }
        return c;
    }
    public static int dbuble(int arr[]){
        int c=0;
        boolean f=false;
        for(int i=0;i<arr.length;i++){
            f=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                swap(j,j+1,arr);
                f=true;
                c++;}
            }System.out.println(" ");
            for (int arr2 : arr) {
                System.out.print(arr2);
              } 
            if(!f)
            break;
        }
        return c;
    }
    public static void main(String[] args) {
        int arr[]={4,5,3,2,1};
        int p[]=arr.clone();
        int de=dbuble(p);
       int k= buble(arr);
       System.out.println(" ");
      for (int arr2 : arr) {
        System.out.print(arr2);
      } 
      System.out.println(" ");
      System.out.println(k); 
      System.out.println(de);
    }
}