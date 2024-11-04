package com.example.donor333;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import model.Pet;


import java.util.Objects;

public class Item {
    @FXML
    private Label nameLabel;
    @FXML
    private Label genderLabel;
    @FXML
    private ImageView img;

    @FXML
    private void click (MouseEvent mouseEvent){
        myListener.onClickListener(cats);
    }
    private Pet cats;
    private MyListener myListener;

    public void setData (Pet cats, MyListener myListener)
    {
        this.cats = cats;
        this.myListener = myListener;
        nameLabel.setText(cats.getName());
        genderLabel.setText(cats.getGender());

        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(cats.getImgSrc())));
        img.setImage(image);
    }
}
