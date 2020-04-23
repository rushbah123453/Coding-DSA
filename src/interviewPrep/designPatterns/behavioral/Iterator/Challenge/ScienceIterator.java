package interviewPrep.designPatterns.behavioral.Iterator.Challenge;

import java.util.List;

public class ScienceIterator implements Iterator {
    private List<String> list;
    int pos=0;
    public ScienceIterator(List<String> list) {
    this.list=list;
    }

    @Override
    public boolean hashNext() {
        if (pos>=list.size() || list.get(pos)==null)
            return false;
        else
            return true;

    }

    @Override
    public Object next() {
        return list.get(pos++);
    }
}
