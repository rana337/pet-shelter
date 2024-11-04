package com.example.donor333;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import model.vet;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import model.*;

public class HelloControllerAH implements Initializable {
    @FXML
    private Label status;
    @FXML
    private Button deletebtn;
    @FXML
    private Button updatebtn;
    @FXML
    private GridPane grid;

    @FXML
    private ScrollPane scroll;

    @FXML
    private TextField vetexp;

    @FXML
    private TextField vetid;

    @FXML
    private TextField vetname;

    @FXML
    private TextField vetpassword;

    private List<vet> vets = new ArrayList<>();
    private Image image;
    private MyListener1 myListener;
    private static List<vet> getData() {
        List<vet> vets = new ArrayList<>();
        vet vet1;
//        for (int i = 0; i < 11; i++) {

//            if(i==10)
            {
                vet1 = new vet();
                vet1.setName("maysoon");
                vet1.setId("2022170"+String.valueOf(1));
                vet1.setPhone("123456789");
                vet1.setYearsOfExperience(3);
                //vet1.setImage_address("/controller/vet1.jpg");
                vets.add(vet1);
            }
//            else if(i==9)
            {
                vet1 = new vet();
                vet1.setName("lamiaa");
                vet1.setId("2022170"+String.valueOf(2));
                vet1.setPhone("123456789");
                vet1.setYearsOfExperience(3);
                //vet1.setImage_address("/controller/vet1.jpg");
                vets.add(vet1);
            }
//            else if(i==7)
            {
                vet1 = new vet();
                vet1.setName("rana");
                vet1.setId("2022170"+String.valueOf(3));
                vet1.setPhone("123456789");
                vet1.setYearsOfExperience(3);
                //vet1.setImage_address("/controller/vet1.jpg");
                vets.add(vet1);
            }
//            else if(i==8)
            {
                vet1 = new vet();
                vet1.setName("Ali");
                vet1.setId("2022170"+String.valueOf(4));
                vet1.setPhone("123456789");
                vet1.setYearsOfExperience(3);
                //vet1.setImage_address("/controller/vet1.jpg");
                vets.add(vet1);
            }

            {
                vet1 = new vet();
                vet1.setName("Ahmed");
                vet1.setId("2022170"+String.valueOf(5));
                vet1.setPhone("123456789");
                vet1.setYearsOfExperience(3);
                //vet1.setImage_address("/controller/vet1.jpg");
                vets.add(vet1);
            }
        {
            vet1 = new vet();
            vet1.setName("mariam");
            vet1.setId("2022170"+String.valueOf(6));
            vet1.setPhone("123456789");
            vet1.setYearsOfExperience(3);
           // vet1.setImage_address("/controller/vet1.jpg");
            vets.add(vet1);
        }
        {
            vet1 = new vet();
            vet1.setName("naira");
            vet1.setId("2022170"+String.valueOf(7));
            vet1.setPhone("123456789");
            vet1.setYearsOfExperience(3);
            //vet1.setImage_address("/controller/vet1.jpg");
            vets.add(vet1);
        }
//        }
        return vets;
    }
    int searchedIndex;
    vet vetProcess=new vet();
    vet vetCheck=new vet();
    private void setChosenVet(vet vet0) {
        vetProcess = vet0;
        vetname.setText(vet0.getName());
        vetid.setText(vet0.getId());
        vetexp.setText(String.valueOf(vet0.getYearsOfExperience())+" years");
        vetpassword.setText(vet0.getPhone());
//        image = new Image(getClass().getResourceAsStream(fruit.getImgSrc()));
//        fruitImg.setImage(image);
//        chosenFruitCard.setStyle("-fx-background-color: #" + fruit.getColor() + ";\n" +
//                "    -fx-background-radius: 30;");
        searchedIndex=vets.indexOf(vet0);
    }

    //delete button
    @FXML
    public void delete(Event event) {
//        vetProcess.setName(vetname.getText());
//        vetProcess.setPhone(vetpassword.getText());
//        vetProcess.setId(vetid.getText());
//        vetProcess.setName(vetname.getText());

        grid.getChildren().clear();
        vets.remove(searchedIndex);

        int column = 1;
        int row = 1;
        try {
            for (int i = 0; i < vets.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("vet.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();



                VetController vetcontroller = fxmlLoader.getController();
                vetcontroller.setData(vets.get(i), myListener);

                if (column == 2) {
                    column = 1;
                    row++;

                }
                grid.add(anchorPane, column++, row); //(child,column,row)
                //set grid width
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);

                //set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_PREF_SIZE);
                System.out.println(vets.size());
                GridPane.setMargin(anchorPane, new Insets(10));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < vets.size(); i++) {
            vet vet10=new vet();
            vet10=vets.get(i);
            System.out.println(vet10.getName());
            System.out.println(vets.indexOf(vet10));
        }

        vetname.setText("");
        vetid.setText("");
        vetexp.setText("");
        vetpassword.setText("");
    }



    //update button
    @FXML
    public void update(Event event) {
        vetProcess.setName(vetname.getText());
        vetProcess.setPhone(vetpassword.getText());
        vetProcess.setId(vetid.getText());
        vetProcess.setName(vetname.getText());

        vets.set(searchedIndex,vetProcess);
        grid.getChildren().clear();

        int column = 1;
        int row = 1;
        try {
            for (int i = 0; i < vets.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("vet.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                VetController vetcontroller = fxmlLoader.getController();
                vetcontroller.setData(vets.get(i),myListener);

                if (column == 2) {
                    column = 1;
                    row++;
                }

                grid.add(anchorPane, column++, row); //(child,column,row)
                //set grid width
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);

                //set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_PREF_SIZE);

                GridPane.setMargin(anchorPane, new Insets(10));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        vetname.setText("");
        vetid.setText("");
        vetexp.setText("");
        vetpassword.setText("");
    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        vets.addAll(getData());
        if (vets.size() > 0) {
//            setChosenVet(vets.get(0));
            myListener = new MyListener1() {

                @Override
                public void onClickListener(vet vet0) {
                    setChosenVet(vet0);
                }
            };
        }
        int column = 1;
        int row = 1;
        try {
            for (int i = 0; i < vets.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("vet.fxml"));
                AnchorPane anchorPane = fxmlLoader.load();

                VetController vetcontroller = fxmlLoader.getController();
                vetcontroller.setData(vets.get(i),myListener);

                if (column == 2) {
                    column = 1;
                    row++;
                }

                grid.add(anchorPane, column++, row); //(child,column,row)
                //set grid width
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_PREF_SIZE);

                //set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_PREF_SIZE);
                System.out.println(vets.size());
                GridPane.setMargin(anchorPane, new Insets(10));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    void Back(MouseEvent event) {
        try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("Start_Page.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }

}