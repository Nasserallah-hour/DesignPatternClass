package FbObserver;

import java.util.List;
import java.util.Observable;

public class SmartphoneApplication extends FacebookView {

    @Override
    public void update(Observable o, Object arg) {
        this.notifications.add("SmartPhone APP == "+(String)arg);
    }
}
