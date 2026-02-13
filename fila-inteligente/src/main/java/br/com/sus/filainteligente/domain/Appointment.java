package br.com.sus.filainteligente.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    private String healthUnitName;

    private LocalDateTime appointmentDate;

    // Tempo médio de atendimento (minutos)
    private Integer averageServiceTimeMinutes;

    // getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAverageServiceTimeMinutes() {
        return averageServiceTimeMinutes;
    }

    public void setAverageServiceTimeMinutes(Integer averageServiceTimeMinutes) {
        this.averageServiceTimeMinutes = averageServiceTimeMinutes;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getHealthUnitName() {
        return healthUnitName;
    }

    public void setHealthUnitName(String healthUnitName) {
        this.healthUnitName = healthUnitName;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
