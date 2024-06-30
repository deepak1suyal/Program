import java.util.*;
public class sheelsort {
    public static void main(String[] args) {
        
        int a[]={4,7,2,5,8,3};
        int l=a.length;
        for(int gap=l/2;gap>0;gap=gap/2)
        {
            for(int j=gap;j<l;j++)
            {
                for(int i=j-gap;i>=0;i=i-gap){
                    if(a[i+gap]>a[i])
                    break;
                    else
                    {
                        int t=a[i+gap];
                        a[i+gap]=a[i];
                        a[i]=t;
                    }
                }
            }
        }

for(int i=0;i<l;i++){
    System.out.println(a[i]);
}
    }
}
