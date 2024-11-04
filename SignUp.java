package com.example.donor333;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import model.Admin;
import model.Client;
import model.vet;
import model.person;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SignUp implements Initializable {
    private static person person1=new Client();
    private static person person2=new vet();
    private static Client client1=new Client();
    private static vet vet1=new vet();
    private static Admin admin1=new Admin();
    DonoView donoView=new DonoView();

    @FXML
    private PasswordField confirm;
    @FXML
    private Button log_in;

    @FXML
    private TextField id;

    @FXML
    private PasswordField passwoed;

    @FXML
    private ChoiceBox<String> role;

    @FXML
    private Button sign;

    @FXML
    private TextField username;

    @FXML
    private HBox vet_info;
    public void setInitialData(){
        admin1.setAdmin();
        person1.setName(username.getText());
        person1.setId(id.getText());
        person1.setPassword(passwoed.getText());
        person2.setName(username.getText());
        person2.setId(id.getText());
        person2.setPassword(passwoed.getText());
    }
    private String Role;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        role.getItems().addAll("vet" , "donor");
        role.setOnAction(this::selectRole);
    }
    public void selectRole(ActionEvent event)
    {
        Role=role.getValue();
        if(Role.equals("vet"))
        {
            vet_info.setVisible(true);
        }
        else {
            vet_info.setVisible(false);
        }
    }

    public void sign_in(Event event){

            try {
                Node node = (Node) event.getSource();
                Stage stage = (Stage) node.getScene().getWindow();
                stage.close();
                Parent root = FXMLLoader.load(getClass().getResource("Signin.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (Exception ex) {
                System.out.println("y" + ex.getMessage());

            }
        }
    public void mainlist1(Event event){

        System.out.println("123");
        setInitialData();

        if(Role.equals("donor")) {
            client1=(Client) person1;
            admin1.clientList.add(client1);
            donoView.getclintinfo(admin1.clientList.size()-1);
            try {

                Node node = (Node) event.getSource();
                Stage stage = (Stage) node.getScene().getWindow();
                stage.close();
                Parent root = FXMLLoader.load(getClass().getResource("Dono.View.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (Exception ex) {
                System.out.println("Ahmed" + ex.getMessage());

            }
        }

        else{
            vet1=(vet) person2;
        }

    }
}




