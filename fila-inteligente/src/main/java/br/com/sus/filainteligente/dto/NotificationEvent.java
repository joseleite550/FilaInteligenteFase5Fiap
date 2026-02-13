package br.com.sus.filainteligente.dto;

import java.time.LocalDateTime;

public class NotificationEvent {

    private Long patientId;
    private String message;
    private LocalDateTime timestamp;

    public NotificationEvent() {
    }

    public NotificationEvent(Long patientId, String message) {
        this.patientId = patientId;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
