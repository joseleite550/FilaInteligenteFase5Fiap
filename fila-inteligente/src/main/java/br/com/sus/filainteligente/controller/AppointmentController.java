package br.com.sus.filainteligente.controller;

import br.com.sus.filainteligente.domain.Appointment;
import br.com.sus.filainteligente.repository.AppointmentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private final AppointmentRepository repository;

    public AppointmentController(AppointmentRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Appointment create(@RequestBody Appointment appointment) {
        return repository.save(appointment);
    }

    @GetMapping
    public List<Appointment> list() {
        return repository.findAll();
    }
}