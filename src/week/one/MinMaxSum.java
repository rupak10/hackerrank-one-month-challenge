package week.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 9, 3, 4, 5};
        minMaxSum(List.of(arr));
    }

    public static void minMaxSum(List<Integer> list) {
        List<Integer> mutableList = new ArrayList<>(list);
        Collections.sort(mutableList);
        int length = mutableList.size();

        long minSum = 0;
        for(int i=0; i<length-1; i++) {
            minSum += mutableList.get(i);
        }

        long maxSum = 0;
        for(int i=1; i<length-1; i++) {
            maxSum += mutableList.get(i);
        }

        System.out.println(minSum + " " + maxSum);
    }
}
