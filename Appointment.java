package com.example.donor333;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.Admin;
import model.Adoption;
import model.Client;
import model.Pet;

import java.util.Objects;

public class Appointment {

    private static Client client1;
    //private static Pet pet1;
    private static Adoption adopt1;

    private static Admin admin1;
    @FXML
    private Button button_1;

    @FXML
    private Button button_110;

    @FXML
    private Button button_111;

    @FXML
    private Button button_12;

    @FXML
    private Button button_13;

    @FXML
    private Button button_14;

    @FXML
    private Button button_15;

    @FXML
    private Button button_16;

    @FXML
    private Button button_17;

    @FXML
    private Button button_18;

    @FXML
    private Button button_19;
    @FXML
    private Button catButton;
    @FXML
    private Button dogButton;



    public void setinfo(Client client,Adoption adopt){
        Appointment.client1=client;
        Appointment.adopt1=adopt;
        System.out.println(client1.getName());
        System.out.println(adopt1.adoptedPet.getName());
    }
    public void firstCat(Event event) {
        try {

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Cats.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }

    public void firstDog(Event event) {
        try {

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Dogs.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }

    public void downe(Event event) {
        adopt1.setAppointment(button_18.getText());
        Appointment.client1.AdoptedPets.add(Appointment.adopt1);
//        AppointmentViewR.admin.clientList.set(5,client8);
        Appointment.admin1.check3();

        try {

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Dono.view.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println("lamiaa" + ex.getMessage());

        }
    }

}
