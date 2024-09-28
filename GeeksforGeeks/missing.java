package GeeksforGeeks;


class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        int ans[]=new int[2];
        double s1=0,s2=0,s3=0,s4=0;
        for(int i=0;i<arr.length;i++){
            s1+=Math.pow(arr[i],2);
            s2+=arr[i];
            s3+=i;
            s4+=Math.pow(i,2);
        }
        s3+=arr.length;
        s4+=Math.pow(arr.length,2);
        int x=(int)(s3-s2);//a-b
        int y=(int)((s4-s1)/x);//a^2-b^2
        
        ans[1]=(x+y)/2;
        ans[0]=(ans[1]-x);
        return ans;
    }
}
public class missing {
    public static void main(String[] args) {
        Solve n=new Solve();
        int a[]={1,3,3};
       a= n.findTwoElement(a);
       for (int a2 : a) {
        System.out.println(a2);
       }
    }
}
