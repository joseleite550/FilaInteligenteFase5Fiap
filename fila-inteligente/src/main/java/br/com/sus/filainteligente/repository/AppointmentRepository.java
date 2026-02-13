package br.com.sus.filainteligente.repository;

import br.com.sus.filainteligente.domain.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
