package br.com.sus.filainteligente.controller;

import br.com.sus.filainteligente.domain.QueueEntry;
import br.com.sus.filainteligente.repository.QueueEntryRepository;
import br.com.sus.filainteligente.service.QueueService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/queue")
public class QueueController {

    private final QueueEntryRepository queueRepository;
    private final QueueService queueService;

    public QueueController(QueueEntryRepository queueRepository,
                           QueueService queueService) {
        this.queueRepository = queueRepository;
        this.queueService = queueService;
    }

    @PostMapping
    public QueueEntry enterQueue(@RequestBody QueueEntry entry) {
        entry.setAttended(false);
        return queueRepository.save(entry);
    }

    @GetMapping("/status/{position}")
    public Map<String, Object> getQueueStatus(
            @PathVariable Integer position,
            @RequestParam Long patientId,
            @RequestParam Integer averageServiceTime,
            @RequestParam Integer travelTime) {

        Integer estimatedWait =
                queueService.calculateEstimatedWaitTime(averageServiceTime, position);

        String decision =
                queueService.decideMovement(patientId, estimatedWait, travelTime);

        Map<String, Object> response = new HashMap<>();
        response.put("posicaoFila", position);
        response.put("tempoEstimadoEspera", estimatedWait);
        response.put("tempoDeslocamento", travelTime);
        response.put("decisao", decision);

        return response;
    }

    @GetMapping
    public List<QueueEntry> currentQueue() {
        return queueService.getCurrentQueue();
    }
}
