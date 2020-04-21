package interviewPrep.designPatterns.behavioral.Iterator;

public class NotificationBar {

    NotificationCollection notificationCollection;

    public NotificationBar(NotificationCollection notificationCollection) {
        this.notificationCollection = notificationCollection;
    }

    public void printNotification(){
        Iterator iterator=notificationCollection.createIterator();
        System.out.println("-----Iterator-----");

        while (iterator.hashNext()){
            Notification notification=(Notification)iterator.next();
            System.out.println(notification.getNotification());
        }
    }
}
