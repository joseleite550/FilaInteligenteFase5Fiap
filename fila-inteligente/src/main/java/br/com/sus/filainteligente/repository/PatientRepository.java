package br.com.sus.filainteligente.repository;

import br.com.sus.filainteligente.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
