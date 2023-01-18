package FbObserver;
import java.util.Observable;

public class WebBrowser extends FacebookView{
    @Override
    public void update(Observable o, Object arg) {
        this.notifications.add("Web Browser == "+(String)arg);
    }

}
