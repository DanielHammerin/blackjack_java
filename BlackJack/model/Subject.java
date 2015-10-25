package BlackJack.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

/**
 * Created by Daniel on 2015-10-25.
 */
public class Subject implements ISubject {

    protected List<IObserver> m_observers = new ArrayList<IObserver>();

    public void register(IObserver o) {
        m_observers.add(o);
    }

    public void unregister(IObserver o) {

    }

    public void update() {
        m_observers.forEach(IObserver::update);
    }
}
