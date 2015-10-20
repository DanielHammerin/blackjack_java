package BlackJack.model;

import java.util.Observer;

/**
 * Created by Daniel on 2015-10-20.
 */
public interface ISubject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObserver();
}
