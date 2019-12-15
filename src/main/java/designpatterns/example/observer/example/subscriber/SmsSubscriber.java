package designpatterns.example.observer.example.subscriber;

import designpatterns.example.observer.example.publisher.NewsPublisher;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SmsSubscriber implements Subscriber {

    @Override
    public void update(NewsPublisher newsPublisher) {
        log.info(String.format("SMS received [ %s ]", newsPublisher.getLatestNews()) );
    }
}
