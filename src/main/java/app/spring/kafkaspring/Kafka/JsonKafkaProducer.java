package app.spring.kafkaspring.Kafka;


import app.spring.kafkaspring.Payload.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class JsonKafkaProducer {

    private final KafkaTemplate<String, User> kafkaTemplate;

    public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(User data) {

        log.info("Message sent -> {}", data);

        Message<User> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "myTopic")
                .build();
    }
}
