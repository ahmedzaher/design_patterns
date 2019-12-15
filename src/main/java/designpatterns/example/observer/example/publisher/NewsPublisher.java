package designpatterns.example.observer.example.publisher;

import designpatterns.example.observer.example.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {

    private List<Subscriber> subscribers = new ArrayList<>();

    private String latestNews;

    public void attach(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }
    public void detach(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }
    public void notifySubscribers() {
        this.subscribers.forEach( subscriber -> subscriber.update(this));
    }

    public String getLatestNews() {
        return latestNews;
    }

    public void setLatestNews(String latestNews) {
        this.latestNews = latestNews;
        this.notifySubscribers();
    }
}
