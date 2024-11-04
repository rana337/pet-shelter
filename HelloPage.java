package com.example.donor333;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HelloPage {

    @FXML
    private Button Donated_Money;

    @FXML
    private Button Donors;

    @FXML
    private Button Operations;

    @FXML
    private Button Pets;

    @FXML
    private Button PetsForAdoption;

    @FXML
    private Button Vets;

    @FXML
    private ImageView myBackground;

    @FXML
    void onHelloButtonClick(MouseEvent event) {
        try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("Operations.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }
   @FXML
   void Vets(MouseEvent event) {
       try {
           Node node = (Node) event.getSource();
           Stage stage = (Stage) node.getScene().getWindow();
           stage.close();
           Parent root = FXMLLoader.load(getClass().getResource("hello-viewA.fxml"));
           Scene scene = new Scene(root);
           stage.setScene(scene);
           stage.show();
       }
       catch (Exception ex) {
           System.out.println("y" + ex.getMessage());

       }
   }
    @FXML
    void Pets(MouseEvent event) {
        try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("Pets.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }
    @FXML
    void AdoptionPets(MouseEvent event) {
        try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("Adopted.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }

    @FXML
    void DonateMoney(MouseEvent event) {
        try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("TotalMoney.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }



}
