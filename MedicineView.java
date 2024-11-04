package com.example.donor333;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.Client;
import model.OtherDonation;

import java.util.ArrayList;
import java.util.Scanner;

public class MedicineView {
    private static Client client16;
    private static OtherDonation otherDonation1;
    @FXML
    private Label Button1;

    @FXML
    private Label Button2;

    @FXML
    private Button label_1;

    @FXML
    private Button label_10;

    @FXML
    private Button label_11;

    @FXML
    private Button label_12;

    @FXML
    private Button label_13;

    @FXML
    private Button label_14;

    @FXML
    private Button label_15;

    @FXML
    private Button label_17;

    @FXML
    private Button label_18;

    @FXML
    private Button label_2;

    @FXML
    private Button label_3;

    @FXML
    private Button label_4;

    @FXML
    private Button label_5;

    @FXML
    private Button label_6;

    @FXML
    private Button label_7;

    @FXML
    private Button label_8;

    @FXML
    private Button label_9;

    @FXML
    private Button Goto;
//

    public void setinfo32(Client client3,OtherDonation otherDonation3)
    {
        System.out.println(client3.getName()+" 32");
        System.out.println(otherDonation3.getType()+" 32");
        MedicineView.client16=client3;
        MedicineView.otherDonation1=otherDonation3;
    }

      public void appoindown (Event event){

          AppointmentViewR A=new AppointmentViewR();
          String App=Goto.getText();
          System.out.println(App);
          MedicineView.otherDonation1.setAppointment(App);
          AppointmentViewR appointmentViewR=new AppointmentViewR();
          appointmentViewR.checksendinfo(client16,otherDonation1);

        try {

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("AppointmentR.view.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }
    public void back (Event event){
        try {

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("Donate.view.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }

    }}



