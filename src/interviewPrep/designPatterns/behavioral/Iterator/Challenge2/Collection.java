package interviewPrep.designPatterns.behavioral.Iterator.Challenge2;

public interface Collection {

     Iterator createIterator();
}

class NotificationCollection implements Collection {

     private static final int MAX_ITEMS=5;
    private int numberOfItems=0;
    Notification[] notificationList;

    public NotificationCollection() {
    notificationList=new Notification[MAX_ITEMS];

         addItems("added 1");
        addItems("added 2");
        addItems("added 3");
        addItems("added 4");
        addItems("added 5");
    }

    private void addItems(String s) {
      Notification notification=new Notification(s);

      if (numberOfItems>=MAX_ITEMS){
          System.out.println("Full");
      }else {
          notificationList[numberOfItems]=notification;
          numberOfItems++;
      }
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationList);
    }
}
