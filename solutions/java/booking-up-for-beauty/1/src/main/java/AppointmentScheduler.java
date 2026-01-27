import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        //damos formato de como leer un String
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        //lo convertimos en un objeto LocalDateTime con su formato correcto
        LocalDateTime date = LocalDateTime.parse(appointmentDateDescription, parser);
        return date;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime currentTime = LocalDateTime.now();
        return appointmentDate.isBefore(currentTime);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        if(hour >=12 && hour <18){
            return true;
        }
        return false;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        //Objeto LocalDateTime, hay que darle un formato nuevo
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'You have an appointment on' EEEE, MMMM d, yyyy, 'at' h:mm a'.'");
        return appointmentDate.format(formatter);
        
    }

    public LocalDate getAnniversaryDate() {
        LocalDate currentDate = LocalDate.now();
        LocalDate anniversaryDate = currentDate.withMonth(9).withDayOfMonth(15);
        return anniversaryDate;
    }
}
