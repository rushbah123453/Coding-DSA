package interviewPrep.designPatterns.behavioral.Iterator.Challenge;




public class Client {


    public static void main(String[] args) {

        Collection scienceCollection = new ScienceCollection();
        Collection artCollection = new ArtCollection();

        Iterator scienceIterator=scienceCollection.createIterator();
        Iterator artsIterator=artCollection.createIterator();

        System.out.println("Science:");
        print(scienceIterator);

        System.out.println("Arts:");
        print(artsIterator);

    }




    public static void print(Iterator iterator){
        while (iterator.hashNext()){
            System.out.println(iterator.next());
        }
    }
}
