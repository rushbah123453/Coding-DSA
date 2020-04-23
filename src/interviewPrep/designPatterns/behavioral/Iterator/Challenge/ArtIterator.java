package interviewPrep.designPatterns.behavioral.Iterator.Challenge;

public class ArtIterator implements Iterator {
    String[] array;
    int pos=0;
    public ArtIterator(String[] array) {
        this.array=array;
    }

    @Override
    public boolean hashNext() {
        if (pos>=array.length || array[pos]==null)
            return false;
        else
            return true;

    }

    @Override
    public Object next() {
        return array[pos++];
    }
}
