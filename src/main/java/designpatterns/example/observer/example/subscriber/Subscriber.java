package designpatterns.example.observer.example.subscriber;

import designpatterns.example.observer.example.publisher.NewsPublisher;

public interface Subscriber {

    void update(NewsPublisher newsPublisher);
}
