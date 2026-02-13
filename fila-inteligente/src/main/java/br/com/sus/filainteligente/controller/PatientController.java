package br.com.sus.filainteligente.controller;

import br.com.sus.filainteligente.domain.Patient;
import br.com.sus.filainteligente.repository.PatientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientRepository repository;

    public PatientController(PatientRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Patient create(@RequestBody Patient patient) {
        return repository.save(patient);
    }

    @GetMapping
    public List<Patient> list() {
        return repository.findAll();
    }
}
