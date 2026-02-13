package br.com.sus.filainteligente.service;

import br.com.sus.filainteligente.config.RabbitConfig;
import br.com.sus.filainteligente.dto.NotificationEvent;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class NotificationPublisher {

    private final RabbitTemplate rabbitTemplate;

    public NotificationPublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendNotification(String message) {
        rabbitTemplate.convertAndSend(RabbitConfig.QUEUE_NAME, message);
    }

    public void sendNotification(Long patientId, String message) {
        NotificationEvent event = new NotificationEvent(patientId, message);
        rabbitTemplate.convertAndSend(RabbitConfig.QUEUE_NAME, event);
    }

}
