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
import model.MoneyDonation;
import model.OtherDonation;

import java.util.Objects;

public class HelloController {

    private static Client client16;
    private static OtherDonation otherDonation1;

    private static MoneyDonation moneyDonation=new MoneyDonation();
    @FXML
    private Button cardButton;
    @FXML
    private Button onsiteButton;

    Onsite onsite=new Onsite();
    Card card=new Card();

    public void setinfo33(Client client3, OtherDonation otherDonation3)
    {
        System.out.println(client3.getName()+" 33");
        System.out.println(otherDonation3.getType()+" 33");
        HelloController.client16=client3;
        HelloController.otherDonation1=otherDonation3;
    }
    public void firstCard (Event event) {

        HelloController.moneyDonation.setType();
        card.setinfo4(client16,moneyDonation);

        try {

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Card.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println("Ahmed " + ex.getMessage());

        }
    }

    public void firstOnsite (Event event) {
        otherDonation1.setType("Money");
        onsite.setinfo333(client16,otherDonation1);
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

}