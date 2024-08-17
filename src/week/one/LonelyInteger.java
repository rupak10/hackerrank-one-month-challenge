package week.one;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the frequency of integers and return the number which occur only once
 * all elements but one occur twice
 * find that one element which occurs only once in the array
 */
public class LonelyInteger {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 2, 3, 3, 5, 3};
        findLonelyInteger(numbers);
    }

    private static void findLonelyInteger(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : numbers) {
            if(map.containsKey(number)) {
                map.put(number, map.get(number)+1);
            }
            else {
                map.put(number, 1);
            }
        }

        for (Integer key : map.keySet()) {
            if(map.get(key)==1) {
                System.out.println(key);
            }
        }
    }

}
