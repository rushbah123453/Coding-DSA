package interviewPrep.designPatterns.behavioral.Iterator.Challenge2;

public class Client {

    public static void main(String[] args) {
        NotificationCollection notificationCollection=new NotificationCollection();
        NotificationBar notificationBar=new NotificationBar(notificationCollection);
        notificationBar.printNotification();
    }
}
