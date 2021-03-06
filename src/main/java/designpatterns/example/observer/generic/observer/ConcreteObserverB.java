package designpatterns.example.observer.generic.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteObserverB implements Observer{

    @Override
    public void update() {
        log.info("UPDATED");
    }
}
