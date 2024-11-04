package model;

public class OtherDonation extends Donation{
   private String Appointment;
   private String Type;

    public String getAppointment() {
        return Appointment;
    }

    public void setAppointment(String appointment) {
        Appointment = appointment;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public void setType() {
        Type=Type;
    }
}
