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
import model.Pet;

import java.util.Objects;

public class Choose {

    private static Client client1;
    private static Pet pet1=new Pet();

    private static Pet.Pet_type type1= Pet.Pet_type.Cat;

    private static Pet.Pet_type type2= Pet.Pet_type.Dog;
    private Cats cat=new Cats();
    private Dogs dog=new Dogs();

    @FXML
    private Button catButton;
    @FXML
    private Button dogButton;

    public void setinfo(Client client)
    {
        Choose.client1=client;
    }
    public void firstCat (Event event) {
        pet1.setType(type1);
        System.out.println(pet1.getType());
        cat.setInfo(client1,pet1);
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

    public void firstDog (Event event) {
        pet1.setType(type2);
        System.out.println(pet1.getType());
        dog.setInfo(client1,pet1);
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
}
