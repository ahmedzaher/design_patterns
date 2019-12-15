package designpatterns.example.observer.generic.observable;

import designpatterns.example.observer.generic.observer.Observer;

public interface Observable {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();
}
