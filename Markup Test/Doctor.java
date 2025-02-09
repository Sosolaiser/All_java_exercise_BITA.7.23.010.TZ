import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Doctor {
    String name;
    String specialty;
    LinkedList<String> schedule;
    
    Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        this.schedule = new LinkedList<>();
    }
    
    void addToSchedule(String timeSlot) {
        schedule.add(timeSlot);
    }

}
