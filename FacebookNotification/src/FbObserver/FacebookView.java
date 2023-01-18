package FbObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class FacebookView implements Observer {
    private FBNotificationCenter notificationCenter;
    protected List<String> notifications= new ArrayList<String>();
    public void connectTo(FBNotificationCenter notificationCenter) {
        this.notificationCenter = notificationCenter;
        this.notificationCenter.addObserver(this);
    }

    public void showNotifications() {
        for (int i = 0; i < this.notifications.size(); i++) {
            System.out.println(this.notifications.get(i));
        }
    }

    public void disconnect() {
        this.notificationCenter.removeObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.notifications.add((String)arg);
    }
}
