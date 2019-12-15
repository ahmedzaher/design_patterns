package designpatterns.example.observer.generic.observable;

import designpatterns.example.observer.generic.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable implements Observable{
    int state;
    private List<Observer> observers;

    public ConcreteObservable() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyObservers();
    }
}
