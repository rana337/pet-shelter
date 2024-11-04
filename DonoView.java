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
import model.Admin;
import model.Adoption;
import model.Client;

public class DonoView {
    private static Client client1=new Client();
    private static Admin admin1=new Admin();
    DonateView donateView=new DonateView();

    Choose choose=new Choose();

    @FXML
    private Button button_1;

    @FXML
    private Button button_2;

    @FXML
    private Button buttonback;

    @FXML
    private Label label_1;
    private static int ind;

    public void getclintinfo(int index)
    {
        DonoView.ind=index;
//        Client client1=new Client();
//        Admin admin1=new Admin();
//        admin1.setAdmin();
        DonoView.client1=admin1.clientList.get(index);
    }
    public void donate (Event event){
        try {

//            getclintinfo(ind);
            donateView.clientinfo(client1);

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
    public void Adopt (Event event){

//        getclintinfo();
        choose.setinfo(client1);

        try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("Choose.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }

    }
}

