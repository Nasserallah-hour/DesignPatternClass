package FbObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class FBNotificationCenter extends Observable {
    List<String> notifications= new ArrayList<String>();
    private List<FacebookView> channels = new ArrayList<>();
    public void addNotification(String notification){
        this.notifications.add(notification);
        this.sendNotification(notification);
    }

    public void addObserver(FacebookView channel) {
        this.channels.add(channel);
    }

    public void removeObserver(FacebookView channel) {
        this.channels.remove(channel);
    }

    public void sendNotification(String notification) {
        for (FacebookView channel : this.channels) {
            channel.update(this,notification);
        }
    }
}
