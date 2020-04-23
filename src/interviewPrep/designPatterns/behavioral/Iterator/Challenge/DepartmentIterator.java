package interviewPrep.designPatterns.behavioral.Iterator.Challenge;

import interviewPrep.designPatterns.behavioral.Iterator.Iterator;
import interviewPrep.designPatterns.behavioral.Iterator.Notification;

public class DepartmentIterator  {

    Collection collection;

    public DepartmentIterator(Collection collection) {
        this.collection = collection;
    }

    public void printNotification(){
        Iterator iterator= (Iterator) collection.createIterator();
        System.out.println("-----Iterator-----");

        while (iterator.hashNext()){
            Notification notification=(Notification)iterator.next();
            System.out.println(notification.getNotification());
        }
    }
}
