package contest.leetcode.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/destination-city/
public class Problem4 {

    public static void main(String[] args) {

        List<List<String>> path=new ArrayList<>();
        List<String> aray1=new ArrayList<>();
        aray1.add("London");
        aray1.add("New York");
        path.add(aray1);
        List<String> aray2=new ArrayList<>();
        aray2.add("New York");
        aray2.add("Lima");
        path.add(aray2);
        List<String> aray3=new ArrayList<>();
        aray3.add("Lima");
        aray3.add("ao Paulo");
        path.add(aray3);

        System.out.println(destCity(path));
    }

    public static String destCity(List<List<String>> paths) {
        System.out.println(paths);

        Set<String> set= new HashSet<>();
        for (List<String> l: paths) set.add(l.get(1));
        for (List<String> l: paths) set.remove(l.get(0));
        return set.iterator().next();
    }
}
