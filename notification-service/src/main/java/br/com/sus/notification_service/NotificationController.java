package br.com.sus.notification_service;

import br.com.sus.notification_service.dto.NotificationEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotificationController {

    private final NotificationStorage storage;

    public NotificationController(NotificationStorage storage) {
        this.storage = storage;
    }

    @GetMapping("/notifications")
    public List<NotificationEvent> getNotifications() {
        return storage.getAll();
    }
}
