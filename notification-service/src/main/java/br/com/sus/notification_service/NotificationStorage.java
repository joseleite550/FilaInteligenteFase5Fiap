package br.com.sus.notification_service;

import br.com.sus.notification_service.dto.NotificationEvent;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotificationStorage {

    private final List<NotificationEvent> notifications = new ArrayList<>();

    public void add(NotificationEvent event) {
        notifications.add(event);
    }

    public List<NotificationEvent> getAll() {
        return notifications;
    }
}

