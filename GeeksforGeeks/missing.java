package GeeksforGeeks;


class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        int ans[]=new int[2];
        int s1=0,s2=0,s3=0;
        for(int i=0;i<arr.length;i++){
            s1^=arr[i];
            s2+=arr[i];
            s3+=i;
        }
        s3+=arr.length;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        ans[0]=(s2-s1)/2;
        ans[1]=(s3-(s2-ans[0]));
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
