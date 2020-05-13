package interviewPrep.java.Collections.iterable.Collection.list.ArrayList;

import java.util.ArrayList;

public class ArrayListExample2 {

    public static void main(String[] args) {

        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("a");
        arrayList.remove("a");

        System.out.println(arrayList);

    }
}
