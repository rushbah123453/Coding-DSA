package interviewPrep.java.Collections.iterable.Collection.list.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> arrayList=new ArrayList<>();
        arrayList.add("1");
        arrayList.size();

        List<Integer> intList=new ArrayList<>();
        intList.add(0,1); // add(index, element)
        intList.add(1,2);
        intList.add(0,3);
        System.out.println(intList);

    }
}
