package com.vnguy.crud_demo.service;

import com.vnguy.crud_demo.model.Patient;
import com.vnguy.crud_demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private static PatientRepository patientRepository;

    public static List<Patient> findAllPatients() {
        return patientRepository.findAll();
    }

    public static Optional<Patient> findPatientById(Long id) {
        return patientRepository.findById(id);
    }

    public static Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public static void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }

    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);
    }
}
