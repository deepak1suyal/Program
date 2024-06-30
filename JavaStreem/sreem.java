package JavaStreem;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class sreem {
    public static void main(String[] args) {
        List<Integer> nums =Arrays.asList(6,5,2,8,1);
        Stream<Integer> data=nums.stream();
        Stream<Integer> mappedStream=data.map(p->p*2);
        mappedStream.forEach(n->System.out.print(n));
        System.out.println("");
        nums.forEach(n->System.out.print(n));
        System.out.println("");
        System.out.print(nums.stream().map(p->p*2).toList());
        System.out.println("");
        System.out.print(nums);
    }
    
}
