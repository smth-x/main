package archive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Map {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(2);
        list.add(31);
        list.add(4);
        list.add(5);
        //3 1 31 2 5
        list = list.stream().map(e->{
            if (e%2==0){
                e/=2;
            }
            return e;
        }).toList();
        System.out.println(list);

        // 10 3 1 4
        int[] arr = {5,6,2,8};
        arr = Arrays.stream(arr).map(e->{
            if (e%2==0){
                return e/=2;
            } else {
                return e*=2;
            }
        }).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
