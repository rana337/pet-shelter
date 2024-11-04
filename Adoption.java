package model;

public class Adoption {
    private String Appointment;

    public Pet adoptedPet=new Pet();

    public String getAppointment() {
        return Appointment;
    }

    public void setAppointment(String appointment) {
        Appointment = appointment;
    }
}
