package com.example.donor333;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Admin;
import model.Pet;

import java.io.File;
import java.util.Objects;

public class SignIn {

    private static Admin admin1=new Admin();
    DonoView donoView=new DonoView();
    private static String ID;

    private static String pass;

    @FXML
    private TextField id;

    @FXML
    private Button login;

    @FXML
    private PasswordField password;

    @FXML
    private Button sign_up;


    public void sign_up(Event event){

        try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("sign_up.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }

    }

    public void getdata()
    {
        ID= id.getText();
        pass= password.getText();
        admin1.setAdmin();
    }
    public void sign_in(Event event) {
        getdata();
        int check=admin1.checkClient(pass,ID);
        Stage stage;
        if (check != -1) {
            donoView.getclintinfo(check);
            try {
                Node node = (Node) event.getSource();
                stage = (Stage) node.getScene().getWindow();
                stage.close();
                Parent root = FXMLLoader.load(getClass().getResource("Dono.view.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (Exception ex) {
                System.out.println("y" + ex.getMessage());

            }


        }
        else if(ID.equals("2022170629")&&pass.equals("147258369")){
            try {
                //System.out.println(App1);
                Node node = (Node) event.getSource();
                Stage stage1 = (Stage) node.getScene().getWindow();
                stage1.close();
                Parent root = FXMLLoader.load(getClass().getResource("Start_Page.fxml"));
                Scene scene = new Scene(root);
                stage1.setScene(scene);
                stage1.show();
            }
            catch (Exception ex) {
                System.out.println("y" + ex.getMessage());

            }
        }

    }

}
