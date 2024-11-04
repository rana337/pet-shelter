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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Adoption;
import model.Client;
import model.Pet;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

public class Cats implements Initializable {
    private static Client client1;
    private static Pet pet1;
    private static Pet.Pet_type type1= Pet.Pet_type.Cat;

    private static Adoption adopt1=new Adoption();
    Appointment appointment=new Appointment();
    @FXML
    private VBox chosenCatCard;
    @FXML
    private Label catNameLabel;
    @FXML
    private Label catGenderLabel;
    @FXML
    private ImageView catImg;
    @FXML
    private ScrollPane scroll;
    @FXML
    private Label desc;
    @FXML
    private GridPane grid;
    @FXML
    private Button Back;
    @FXML
    private Button Adopt;
    @FXML
    private Label id;
     private List<Pet> cats = new ArrayList<>();
     private Image image;
     private MyListener myListener;

     public void setInfo(Client client,Pet pet)
     {
         Cats.client1=client;
         Cats.pet1=pet;
         System.out.println(client1.getName());
         System.out.println(pet1.getType());
     }
     private List<Pet> getData(){
         List<Pet> cats = new ArrayList<>();
         Pet cat5;

         cat5 = new Pet();
         cat5.setName("Grace");
         cat5.setGender("Female");
         cat5.setImgSrc("grace.png");
         cat5.setId(123456789);
         cat5.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
         cats.add(cat5);

         cat5 = new Pet();
         cat5.setName("Oliver");
         cat5.setGender("Male");
         cat5.setImgSrc("oliver.png");
         cat5.setId(123777789);
         cat5.setDescribe("A Naughty Cat,likes to eat \n and likes to eat Fish");
         cats.add(cat5);

         cat5 = new Pet();
         cat5.setName("Frito");
         cat5.setGender("Male");
         cat5.setImgSrc("Frito.png");
         cat5.setId(123456345);
         cat5.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
         cats.add(cat5);

         cat5 = new Pet();
         cat5.setName("Ella");
         cat5.setGender("Female");
         cat5.setImgSrc("Ella.png");
         cat5.setId(123898789);
         cat5.setDescribe("A Naughty Cat,likes to eat \n and likes to eat Fish");
         cats.add(cat5);

         cat5 = new Pet();
         cat5.setName("Kiara");
         cat5.setGender("Female");
         cat5.setImgSrc("Kiara.png");
         cat5.setId(123456000);
         cat5.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
         cats.add(cat5);

         cat5 = new Pet();
         cat5.setName("Sissy");
         cat5.setGender("Female");
         cat5.setImgSrc("Sissy.png");
         cat5.setId(123000789);
         cat5.setDescribe("A Naughty Cat,likes to eat \n and likes to eat Fish");
         cats.add(cat5);

         cat5 = new Pet();
         cat5.setName("Leo");
         cat5.setGender("Male");
         cat5.setImgSrc("Leo.png");
         cat5.setId(123456878);
         cat5.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
         cats.add(cat5);

         cat5 = new Pet();
         cat5.setName("Rambo");
         cat5.setGender("Male");
         cat5.setImgSrc("Rambo.png");
         cat5.setId(123456666);
         cat5.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
         cats.add(cat5);

         cat5 = new Pet();
         cat5.setName("Simon");
         cat5.setGender("Male");
         cat5.setImgSrc("Simon.png");
         cat5.setId(123654789);
         cat5.setDescribe("A Naughty Cat,likes to eat \n and likes to eat Fish");
         cats.add(cat5);

         cat5 = new Pet();
         cat5.setName("Yoko");
         cat5.setGender("Female");
         cat5.setImgSrc("Yoko.png");
         cat5.setId(123456678);
         cat5.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
         cats.add(cat5);

         cat5 = new Pet();
         cat5.setName("Kitty");
         cat5.setGender("Female");
         cat5.setImgSrc("Kitty.png");
         cat5.setId(123101789);
         cat5.setDescribe("A Naughty Cat,likes to eat \n and likes to eat Fish");
         cats.add(cat5);

         cat5 = new Pet();
         cat5.setName("Lola");
         cat5.setGender("Female");
         cat5.setImgSrc("Lola.png");
         cat5.setId(123456833);
         cat5.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
         cats.add(cat5);

         cat5 = new Pet();
         cat5.setName("Bono");
         cat5.setGender("Male");
         cat5.setImgSrc("Bono.png");
         cat5.setId(123444789);
         cat5.setDescribe("A Naughty Cat,likes to eat \n and likes to eat Fish");
         cats.add(cat5);

         cat5 = new Pet();
         cat5.setName("Felix");
         cat5.setGender("Male");
         cat5.setImgSrc("Felix.png");
         cat5.setId(123456101);
         cat5.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
         cats.add(cat5);

         cat5 = new Pet();
         cat5.setName("Frodo");
         cat5.setGender("Male");
         cat5.setImgSrc("Frodo.png");
         cat5.setId(123222789);
         cat5.setDescribe("A Naughty Cat,likes to eat \n and likes to eat Fish");
         cats.add(cat5);

         cat5 = new Pet();
         cat5.setName("Sweetie");
         cat5.setGender("Female");
         cat5.setImgSrc("Sweetie.png");
         cat5.setId(123456099);
         cat5.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
         cats.add(cat5);

         cat5 = new Pet();
         cat5.setName("Sam");
         cat5.setGender("Male");
         cat5.setImgSrc("Sam.png");
         cat5.setId(123323789);
         cat5.setDescribe("A Naughty Cat,likes to eat \n and likes to eat Fish");
         cats.add(cat5);

         cat5 = new Pet();
         cat5.setName("Petunia");
         cat5.setGender("Female");
         cat5.setImgSrc("Petunia.png");
         cat5.setId(123456555);
         cat5.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
         cats.add(cat5);

         cat5 = new Pet();
         cat5.setName("Sophie");
         cat5.setGender("Female");
         cat5.setImgSrc("Sophie.png");
         cat5.setId(123555789);
         cat5.setDescribe("A Naughty Cat,likes to eat \n and likes to eat Fish");
         cats.add(cat5);

         cat5 = new Pet();
         cat5.setName("Dexter");
         cat5.setGender("Male");
         cat5.setImgSrc("Dexter.png");
         cat5.setId(123456444);
         cat5.setDescribe("A Cute Calm Cat,likes to play \n and likes to eat Tuna");
         cats.add(cat5);

         return cats;
     }
     private void setChosenCatCard(Pet cat5){
         cat5.setType(type1);
         catNameLabel.setText(cat5.getName());
         catGenderLabel.setText(cat5.getGender());
         image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(cat5.getImgSrc())));
         catImg.setImage(image);
         id.setText(String.valueOf(cat5.getId()));
         desc.setText(cat5.getDescribe());
         chosenCatCard.setStyle("-fx-background-color:#D3D3D3;\n"+"-fx-background-radius:30;");
         Cats.pet1=cat5;
     }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cats.addAll(getData());
        if (cats.size()>0){
            setChosenCatCard(cats.get(0));
            myListener= new MyListener() {
                @Override
                public void onClickListener(Pet cat) {
                    setChosenCatCard(cat);
                }
            };
        }
        int column = 0;
        int row = 3;
        try {
            for (int i = 0; i < cats.size(); i++) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("item.fxml"));

                AnchorPane anchorPane = fxmlLoader.load();

                Item item = fxmlLoader.getController();
                item.setData(cats.get(i),myListener);
                if (column == 4){
                    column = 0;
                    row++;
                }
                grid.add(anchorPane,column++,row); // (child,column,row)
                //set item grid width
                grid.setMinWidth(Region.USE_COMPUTED_SIZE);
                grid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                grid.setMaxWidth(Region.USE_COMPUTED_SIZE);

                //set grid height
                grid.setMinHeight(Region.USE_COMPUTED_SIZE);
                grid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                grid.setMaxHeight(Region.USE_COMPUTED_SIZE);


                GridPane.setMargin(anchorPane,new Insets(10));
            }
            } catch(IOException e){
                throw new RuntimeException(e);
            }
     }

    public void choose (Event event) {
        try {

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Choose.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }

    public void appointment (Event event) {

        adopt1.adoptedPet=pet1;
        appointment.setinfo(client1,adopt1);
        try {

            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("appointment.fxml")));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

        }
    }
}
