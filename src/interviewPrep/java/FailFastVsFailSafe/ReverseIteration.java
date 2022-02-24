package interviewPrep.java.FailFastVsFailSafe;

//import com.sun.deploy.panel.ITreeNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseIteration {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("abc");
        arrayList.add("def");
        arrayList.add("ghi");

        ListIterator<String> iterator=arrayList.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
