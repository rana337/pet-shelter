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

public class FoodView {
    private static Client client16;
    private static OtherDonation otherDonation1;
    @FXML
    private Button Button_1;

    @FXML
    private Button Button_10;

    @FXML
    private Button Button_11;

    @FXML
    private Button Button_12;

    @FXML
    private Button Button_13;

    @FXML
    private Button Button_14;

    @FXML
    private Button Button_15;

    @FXML
    private Button Button_16;

    @FXML
    private Button Button_17;

    @FXML
    private Button Button_2;

    @FXML
    private Button Button_3;

    @FXML
    private Button Button_4;

    @FXML
    private Button Button_5;

    @FXML
    private Button Button_6;

    @FXML
    private Button Button_7;

    @FXML
    private Button Button_8;

    @FXML
    private Button Button_9;

    @FXML
    private Label Label_1;

    @FXML
    private Label Label_2;

//    public void setAppointments(){
//        ArrayList<String> array = new ArrayList<String>();
//        array.add("10:00am");
//        array.add("10:30am");
//        array.add("11:00am");
//        array.add("11:30am");
//        array.add("12:00pm");
//        array.add("12:30pm");
//        array.add("1:00pm");
//        array.add("1:30pm");
//        array.add("2:00pm");
//        array.add("2:30pm");
//        array.add("3:00pm");
//        array.add("3:30pm");
//        array.add("4:00pm");
//        array.add("4:30pm");
//        array.add("5:00pm");
//        array.add("5:30pm");
//
//        System.out.println("Available appointments");
//
//
//        for(int i = 0; i< array.toArray().length ; i++)
//        {
//            System.out.println(array.get(i) +" ");
//
//        }
//        System.out.println("please choose the appointment");
//
//        Scanner input=new Scanner(System.in);
//        int arraySize,searchedappo;
//        arraySize = input.nextInt();
//
//
//        if (arraySize<=15)
//
//            System.out.println(array.get(arraySize));
//        else
//            System.out.println("The appointment is not found");
//
//    }
    public void setinfo31(Client client3,OtherDonation otherDonation3)
    {
        //client3.setName("Ahmed");
        System.out.println(client3.getName()+" 31");
        System.out.println(otherDonation3.getType()+" 31");
        FoodView.client16=client3;
        FoodView.otherDonation1=otherDonation3;
    }
    public void appoindown (Event event){
        AppointmentViewR A=new AppointmentViewR();
        String App=Button_1.getText();
        System.out.println(App);
        FoodView.otherDonation1.setAppointment(App);
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

    }
}








