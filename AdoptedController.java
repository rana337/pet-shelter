package com.example.donor333;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Display_pets;

import java.util.List;
import java.util.stream.Collectors;

public class AdoptedController {

    @FXML
    private ScrollPane Scroll;

    @FXML
    private GridPane gridpane;

    @FXML
    private Text petsText;

    @FXML
    private Button Back;

    @FXML
    private void initialize() {
        // Assign the petsList from Display_pets class
        List<Display_pets> petsList = Display_pets.getPetsList();

        // Filter available pets
        List<Display_pets> availablePets = petsList.stream()
                .filter(pet -> "Available".equals(pet.getAdoptionStatus()))
                .collect(Collectors.toList());

        // Display available pets in the GridPane
        displayAvailablePets(availablePets);
    }

    private void createGridPane() {
        gridpane.setAlignment(Pos.CENTER);
        gridpane.setHgap(10);
        gridpane.setVgap(30);
        gridpane.getColumnConstraints().clear();
        gridpane.getRowConstraints().clear();


        RowConstraints headerRowConstraints = new RowConstraints();
        headerRowConstraints.setValignment(VPos.CENTER);
        headerRowConstraints.setMinHeight(30);
        gridpane.getRowConstraints().add(headerRowConstraints);

        RowConstraints dataRowConstraints = new RowConstraints();
        dataRowConstraints.setValignment(VPos.CENTER);
        dataRowConstraints.setMinHeight(25);
        gridpane.getRowConstraints().add(dataRowConstraints);

        for (int i = 0; i < 7; i++) {
            ColumnConstraints columnConstraints = new ColumnConstraints();
            columnConstraints.setHalignment(HPos.CENTER);


            if (i == 0) {
                columnConstraints.setHgrow(Priority.NEVER);
                columnConstraints.setMinWidth(100);
            } else {
                columnConstraints.setHgrow(Priority.ALWAYS);
            }

            gridpane.getColumnConstraints().add(columnConstraints);
        }
    }

    private void displayAvailablePets(List<Display_pets> availablePets) {
        // Add labels for each column
        String[] headerTexts = {"Name", "Pet ID", "Pet Type", "Age", "Adoption Status", "Adoption", "Treatment Status"};
        for (int i = 0; i < headerTexts.length; i++) {
            Label label = new Label(headerTexts[i]);
            label.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
            gridpane.add(label, i, 0);
            GridPane.setHalignment(label, HPos.CENTER);
        }

        // Populate data in the corresponding columns
        for (int i = 0; i < availablePets.size(); i++) {
            Display_pets pet = availablePets.get(i);

            Label nameLabel = new Label(pet.getName());
            nameLabel.setFont(Font.font("Times New Roman", 14));
            gridpane.add(nameLabel, 0, i + 1);

            Label idLabel = new Label(pet.getPetId());
            idLabel.setFont(Font.font("Times New Roman", 14));
            gridpane.add(idLabel, 1, i + 1);

            Label typeLabel = new Label(pet.getPetType());
            typeLabel.setFont(Font.font("Times New Roman", 14));
            gridpane.add(typeLabel, 2, i + 1);

            Label ageLabel = new Label(String.valueOf(pet.getAge()));
            ageLabel.setFont(Font.font("Times New Roman", 14));
            gridpane.add(ageLabel, 3, i + 1);

            Label adoptionStatusLabel = new Label(pet.getAdoptionStatus());
            adoptionStatusLabel.setFont(Font.font("Times New Roman", 14));
            gridpane.add(adoptionStatusLabel, 4, i + 1);

            Label readyForAdoptionLabel = new Label(pet.getReadyForAdoptionStatus());
            readyForAdoptionLabel.setFont(Font.font("Times New Roman", 14));
            gridpane.add(readyForAdoptionLabel, 5, i + 1);

            Label treatmentStatusLabel = new Label(pet.getTreatmentStatus());
            treatmentStatusLabel.setFont(Font.font("Times New Roman", 14));
            gridpane.add(treatmentStatusLabel, 6, i + 1);
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
