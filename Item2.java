package com.example.donor333;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import model.Pet;

import java.util.Objects;

public class Item2 {
    @FXML
    private Label nameLabel;
    @FXML
    private Label genderLabel;
    @FXML
    private ImageView img;
    @FXML
    private void click (MouseEvent mouseEvent){
        myListener2.onClickListener(dogs);
    }
    private Pet dogs;
    private MyListener2 myListener2;

    public void setData (Pet dogs, MyListener2 myListener2)
    {
        this.dogs = dogs;
        this.myListener2 = myListener2;
        nameLabel.setText(dogs.getName());
        genderLabel.setText(dogs.getGender());
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(dogs.getImgSrc())));
        img.setImage(image);
}
}
