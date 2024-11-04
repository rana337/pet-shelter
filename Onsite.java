package com.example.donor333;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.Client;
import model.OtherDonation;

import java.util.Objects;

public class Onsite {
    private static Client client16;
    private static OtherDonation otherDonation1;


    @FXML
    private Button button_1;

    @FXML
    private Button button_10;

    @FXML
    private Button button_11;

    @FXML
    private Button button_2;

    @FXML
    private Button button_3;

    @FXML
    private Button button_4;

    @FXML
    private Button button_5;

    @FXML
    private Button button_6;

    @FXML
    private Button button_7;

    @FXML
    private Button button_71;

    @FXML
    private Button button_8;

    @FXML
    private Button cardButton;
    @FXML
    private Button onsiteButton;

    public void setinfo333(Client client3, OtherDonation otherDonation3)
    {
        System.out.println(client3.getName()+" 333");
        System.out.println(otherDonation3.getType()+" 333");
        Onsite.client16=client3;
        Onsite.otherDonation1=otherDonation3;
    }
    public void firstCard (Event event) {
        try {

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Card.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }

    public void firstOnsite (Event event) {
        try {

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Onsite.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }
    public void downappoin (Event event) {

        AppointmentViewR A=new AppointmentViewR();
        String App=button_8.getText();
        System.out.println(App);
        Onsite.otherDonation1.setAppointment(App);
        AppointmentViewR appointmentViewR=new AppointmentViewR();
        appointmentViewR.checksendinfo(client16,otherDonation1);

        try {

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AppointmentR.view.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }
}
