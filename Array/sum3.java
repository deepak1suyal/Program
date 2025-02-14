package Array;

class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int count = 0;

        // Fix the first element
        for (int i = 0; i < arr.length - 2; i++) {
            int j = i + 1;
            int l = arr.length - 1;

            // Two-pointer approach for the rest
            while (j < l) {
                int sum = arr[i] + arr[j] + arr[l];

                if (sum == target) {
                 
int o=0;
int p=0;
                    // Move pointers and handle duplicates
                    int leftValue = arr[j];
                    int rightValue = arr[l];
                    while (j <= l && arr[j] == leftValue) {j++;
                    o++;}
                    while (j <= l && arr[l] == rightValue) {l--;
                    p++;}
                    if(leftValue==rightValue)
                    count+=leftValue*(leftValue-1)/2;
                    else
count+=o*p;
                } else if (sum < target) {
                    j++;
                } else {
                    l--;
                }
            }
        }

        return count;
    }
}
public class sum3 {
    public static void main(String[] args) {
        Solution s=new Solution();
        int arr[]={-15, -7, -5, -4, 0 ,1, 5, 7, 8, 20, 20
            };
          System.out.println(s.countTriplets(arr, 1));  

    }
}
