package br.com.sus.notification_service.dto;

import java.time.LocalDateTime;

public class NotificationEvent {

    private Long patientId;
    private String message;
    private LocalDateTime timestamp;

    public NotificationEvent() {
    }

    public Long getPatientId() {
        return patientId;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
