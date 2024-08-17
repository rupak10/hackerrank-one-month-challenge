package week.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * count the frequency of strings
 */
public class MatchStrings {

    public static void main(String[] args) {
        String[] strings = {"abc", "abc", "bd", "abr"};
        String[] queries = {"abc", "ab", "bd"};

        List<Integer> list = matchStrings(strings, queries);
        for(Integer number : list) {
            System.out.println(number);
        }
    }

    private static List<Integer> matchStrings(String[] strings, String[] queries) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for(String string : strings) {
            if(map.containsKey(string)){
                map.put(string, map.get(string) + 1);
            }
            else {
                map.put(string, 1);
            }
        }
        for (String query : queries) {
            list.add(map.getOrDefault(query, 0));
        }
        return list;
    }
}
