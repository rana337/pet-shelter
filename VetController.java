package com.example.donor333;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import model.vet;

public class VetController {
    @FXML
    private Label vetid;

    @FXML
    private Label vetname;

    @FXML
    private Label vetpassword;

    @FXML
    private Label yearsOfExperience;


    @FXML
    private void click(MouseEvent mouseEvent) {
        myListener.onClickListener(vet2);
    }
    private vet vet2;
    private MyListener1 myListener;

    public void setData(vet vet2, MyListener1 myListener) {
        this.vet2 = vet2;
        this.myListener = myListener;
        vetname.setText(vet2.getName());
        vetid.setText(vet2.getId());
        vetpassword.setText(vet2.getPhone());
        yearsOfExperience.setText(String.valueOf(vet2.getYearsOfExperience())+" years");
//        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/vet1.jpg")));
//        vetimage.setImage(image);



    }

}
