package com.example.donor333;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Admin;
import model.Client;
import model.MoneyDonation;

import java.util.Objects;

public class Card {

    private static MoneyDonation moneyDonation1;
    private static Client client1;
    private static Admin admin;

    @FXML
    private Button Donate;

    @FXML
    private Button cardButton;

    @FXML
    private TextField cardCvv;

    @FXML
    private TextField cardEXPT;

    @FXML
    private TextField cardName;

    @FXML
    private TextField cardNumber;

    @FXML
    private TextField moneyAmount;

    @FXML
    private Button onsiteButton;

    public void setinfo4(Client client, MoneyDonation moneyDonation){
        Card.client1=client;
        Card.moneyDonation1=moneyDonation;
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
    public void Done (Event event) {

        moneyDonation1.setCardNumber(Integer.valueOf(cardNumber.getText()));
        moneyDonation1.setCardName(cardName.getText());
        moneyDonation1.setCVV(Integer.valueOf(cardCvv.getText()));
        moneyDonation1.setExp(cardEXPT.getText());
        moneyDonation1.setCVV(Integer.valueOf(moneyAmount.getText()));
        moneyDonation1.setClientName(client1.getName());
        moneyDonation1.setClientId(client1.getId());


        Card.client1.DonatedMoney.add(Card.moneyDonation1);
//        AppointmentViewR.admin.clientList.set(5,client8);
        Card.admin.check1();


        try {

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Done.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }
}
