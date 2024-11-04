package com.example.donor333;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AddPet implements Initializable {
    @FXML
    private Button add;

    @FXML
    private TextField age;

    @FXML
    private Button back;

    @FXML
    private TextField id;

    @FXML
    private TextField name;

    @FXML
    private ChoiceBox<String> status;

    @FXML
    private ChoiceBox<String> type;


    private static String value1;
    private static String value2;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        status.getItems().addAll("Adopted","Not Adopted");
        type.getItems().addAll("Dog","Cat");

        status.setOnAction(this::chooseStatus);
        type.setOnAction(this::chooseType);
    }

    public void chooseStatus(ActionEvent event)
    {
        value1=status.getValue();
        System.out.println(value1);
    }
    public void chooseType(ActionEvent event)
    {
        value2= type.getValue();
        System.out.println(value2);
    }
    @FXML
    void Back(MouseEvent event) {
        try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("Pets.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }
}
