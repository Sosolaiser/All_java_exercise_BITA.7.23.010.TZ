import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class HospitalManagementSystem {
    static Queue<Patient> appointmentQueue = new LinkedList<>();
    static PatientBST patientRecords = new PatientBST();
    static HashMap<String, String> symptomToSpecialty = new HashMap<>();
    static HashMap<String, Doctor> doctors = new HashMap<>();
    
    public static void main(String[] args) {
        symptomToSpecialty.put("UTI", "Doctor Medicine");
        symptomToSpecialty.put("cancer", "Radiotheraphy");
        
        doctors.put("Raya Salum", new Doctor("Dr. Masoud", "Doctor Medicine"));
        doctors.put("Dr. Brown", new Doctor("Dr. soso", "Radiotheraphy"));
        
        addPatient("Hafiz Abdul", 1234, "UTI");
        addPatient("Manndy Query", 5678, "cancer");
        scheduleAppointments();
        lookupPatient(1234);
    }
    
    static void addPatient(String name, int ssn, String symptom) {
        Patient newPatient = new Patient(name, ssn, symptom);
        patientRecords.insert(newPatient);
        appointmentQueue.add(newPatient);
        System.out.println("Patient added: " + name);
    }
    
    static void scheduleAppointments() {
        while (!appointmentQueue.isEmpty()) {
            Patient p = appointmentQueue.poll();
            String specialty = symptomToSpecialty.get(p.symptom);
            for (Doctor d : doctors.values()) {
                if (d.specialty.equals(specialty)) {
                    d.addToSchedule(p.name);
                    System.out.println("Scheduled " + p.name + " with " + d.name);
                    break;
                }
            }
        }
    }
    
    static void lookupPatient(int ssn) {
        Patient p = patientRecords.search(ssn);
        if (p != null) System.out.println("Patient found: " + p.name);
        else System.out.println("Patient not found");
    }
}