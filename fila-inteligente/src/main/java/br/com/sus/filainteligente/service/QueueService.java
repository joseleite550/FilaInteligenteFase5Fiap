package br.com.sus.filainteligente.service;

import br.com.sus.filainteligente.domain.QueueEntry;
import br.com.sus.filainteligente.repository.QueueEntryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueueService {

    private final QueueEntryRepository queueEntryRepository;
    private final NotificationPublisher publisher;

    public QueueService(QueueEntryRepository queueEntryRepository,
                        NotificationPublisher publisher) {
        this.queueEntryRepository = queueEntryRepository;
        this.publisher = publisher;
    }

    public Integer calculateEstimatedWaitTime(Integer averageServiceTimeMinutes, Integer position) {
        return position * averageServiceTimeMinutes;
    }

    public String decideMovement(Long patientId,
                                 Integer estimatedWaitTime,
                                 Integer travelTimeMinutes) {

        if (estimatedWaitTime <= travelTimeMinutes) {
            publisher.sendNotification(patientId, "Paciente deve se deslocar agora.");
            return "SE DESLOCAR AGORA";
        }

        return "AGUARDE";
    }


    public List<QueueEntry> getCurrentQueue() {
        return queueEntryRepository.findByAttendedFalseOrderByPositionAsc();
    }
}
