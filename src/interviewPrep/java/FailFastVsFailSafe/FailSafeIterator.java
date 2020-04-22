package interviewPrep.java.FailFastVsFailSafe;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator {

    public static void main(String[] args) {


        ConcurrentHashMap<Integer,Integer> concurrentHashMap=new ConcurrentHashMap<>();
        concurrentHashMap.put(1,1);
        concurrentHashMap.put(2,2);
        concurrentHashMap.put(3,3);

        Iterator iterator=concurrentHashMap.keySet().iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            concurrentHashMap.put(0,0);
        }


        //CopynWriteArrayList creates a clone of collection and iterates on that

        CopyOnWriteArrayList<Integer> copyOnWriteArrayList=new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(1);
        copyOnWriteArrayList.add(2);
        copyOnWriteArrayList.add(3);


        Iterator arrayIterator=copyOnWriteArrayList.iterator();

        while (arrayIterator.hasNext()){
            System.out.println(arrayIterator.next());
            copyOnWriteArrayList.add(4);
        }

        //arrayIterator is already on last element
        //so iterating over it in forward direction is not possible
        while (arrayIterator.hasNext()){
            System.out.println(arrayIterator.next());

        }

    }
}
