package interviewPrep.designPatterns.behavioral.Iterator.Challenge2;

public class NotificationIterator implements Iterator {

    private Notification[] notificationList;
    int pos=0;
    public NotificationIterator(Notification[] notificationList) {
        this.notificationList=notificationList;
    }


    @Override
    public boolean hashNext() {
        if (pos>=notificationList.length || notificationList[pos]==null){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public Object next() {
        Notification notification=notificationList[pos];
        pos++;
        return notification;
    }
}
