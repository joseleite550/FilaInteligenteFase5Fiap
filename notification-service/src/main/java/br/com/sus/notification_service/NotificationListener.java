package br.com.sus.notification_service;

import br.com.sus.notification_service.dto.NotificationEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

    private static final Logger log = LoggerFactory.getLogger(NotificationListener.class);
    private final NotificationStorage storage;

    public NotificationListener(NotificationStorage storage) {
        this.storage = storage;
    }

    @RabbitListener(queues = "fila.notificacao")
    public void receiveMessage(NotificationEvent event) {
        log.info("🔔 Notificação recebida | pacienteId={} | mensagem={} | timestamp={}",
                event.getPatientId(),
                event.getMessage(),
                event.getTimestamp());

        storage.add(event);
    }
}
