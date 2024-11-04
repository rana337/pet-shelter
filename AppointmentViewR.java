package com.example.donor333;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import model.Admin;
import model.Client;
import model.OtherDonation;

public class AppointmentViewR {
 private static OtherDonation otherDonation8;
 private static Client client8;
 private static Admin admin;
    @FXML
    private Label label;

    @FXML
    private Circle shape_1;

    @FXML
    private Label shape_2;

//    public static void main(String[]args){
//
//    System.out.println("The appointment has been booked");
//}
    public String App1="Ahmed";
///////////////////////////////////////////////////
    public void checksendinfo(Client client7, OtherDonation otherDonation7)
    {
        System.out.println(client7.getName()+" Done");
        System.out.println(otherDonation7.getType()+" done");
        System.out.println(otherDonation7.getAppointment()+" done");
        otherDonation7.setClientName(client7.getName());
        otherDonation7.setClientId(client7.getId());
        AppointmentViewR.client8=client7;
        AppointmentViewR.otherDonation8=otherDonation7;
    }


    public void mainlist (Event event){
//        System.out.println(otherDonation8.getClientName()+" 2003");
//        System.out.println(otherDonation8.getClientId()+" 2003");
//        System.out.println(otherDonation8.getType()+" 2003");
//        System.out.println(otherDonation8.getAppointment()+" 2003");
        AppointmentViewR.client8.OtherDonated.add(AppointmentViewR.otherDonation8);
//        AppointmentViewR.admin.clientList.set(5,client8);
        AppointmentViewR.admin.check();


        try {
            //System.out.println(App1);
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("Dono.View.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }
}