package designpatterns.example.observer.example;

import designpatterns.example.observer.example.publisher.NewsPublisher;
import designpatterns.example.observer.example.subscriber.EmailSubscriber;
import designpatterns.example.observer.example.subscriber.SmsSubscriber;
import designpatterns.example.observer.example.subscriber.Subscriber;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        Subscriber emailSubscriber = new EmailSubscriber();
        Subscriber smsSubscriber = new SmsSubscriber();

        NewsPublisher newsPublisher = new NewsPublisher();
        newsPublisher.attach(emailSubscriber);
        newsPublisher.attach(smsSubscriber);
        newsPublisher.setLatestNews("Big Bang");

        newsPublisher.detach(smsSubscriber);
        newsPublisher.setLatestNews("Another Bang");



    }
}
