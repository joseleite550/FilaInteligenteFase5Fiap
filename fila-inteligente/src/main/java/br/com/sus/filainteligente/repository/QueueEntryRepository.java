package br.com.sus.filainteligente.repository;

import br.com.sus.filainteligente.domain.QueueEntry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QueueEntryRepository extends JpaRepository<QueueEntry, Long> {

    List<QueueEntry> findByAttendedFalseOrderByPositionAsc();
}
