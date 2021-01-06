package interviewPrep.designPatterns.behavioral.Iterator.Challenge;

//import com.sun.tools.javac.code.Lint;

import java.util.LinkedList;
import java.util.List;

public interface Collection {
    public Iterator createIterator();
}

class ScienceCollection implements Collection {


    static final int MAX_VALUE = 5;
    int pos = 0;
    List<String> list;

    public ScienceCollection() {
        list = new LinkedList<>();
        add("Science-1");
        add("Science-2");
        add("Science-3");
        add("Science-4");
    }

    private void add(String items) {

        if (pos <= MAX_VALUE) {
            list.add(items);
            pos++;
        } else {
            System.out.println("Full");
            return;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ScienceIterator(list);
    }

}

class ArtCollection implements Collection {


    static final int MAX_VALUE = 5;
    int pos = 0;
    String array[];


    public ArtCollection() {
        array = new String[MAX_VALUE];
        add("Arts-1");
        add("Arts-2");
        add("Arts-3");
        add("Arts-4");
    }

    private void add(String items) {

        if (pos <= MAX_VALUE) {
           array[pos]=items;
            pos++;
        } else {
            System.out.println("Full");
            return;
        }
    }

    @Override
    public Iterator createIterator() {
        return new ArtIterator(array);
    }

}
