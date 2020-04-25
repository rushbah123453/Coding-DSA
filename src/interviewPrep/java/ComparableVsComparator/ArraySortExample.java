package interviewPrep.java.ComparableVsComparator;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortExample {
    public static void main(String[] args) {
        Integer array[]={3,2,1};
        Arrays.sort(array,new Sort());
        for (int i :
                array) {
            System.out.println(i);
        }
    }
}
class Sort implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}