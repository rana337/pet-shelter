package com.example.donor333;

//import com.example.pet_shelter.Display_pets;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import model.*;

public class PetsController implements Initializable {

    @FXML
    private ScrollPane Scroll;

    @FXML
    private GridPane gridpane;

    @FXML
    private Text pets;

    @FXML
    private Button Add;

    @FXML
    private Button Back;


    private ArrayList<Display_pets> petsList;

    public void setRowHeight(int rowIndex, double height, double width) {
        RowConstraints rowConstraints = new RowConstraints();
        rowConstraints.setPrefHeight(0);
        gridpane.getRowConstraints().set(rowIndex, rowConstraints);
    }

    private void handleEditButtonClick(Display_pets pet) {
        // Handle the edit action for the selected pet
        Dialog<Display_pets> dialog = new Dialog<>();
        dialog.setTitle("Edit Pet");
        dialog.setHeaderText("Editing " + pet.getName());

        ButtonType saveButtonType = new ButtonType("Save", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(saveButtonType, ButtonType.CANCEL);

        // Create the content for the dialog
        GridPane editGrid = new GridPane();
        editGrid.setHgap(10);
        editGrid.setVgap(10);
        editGrid.setPadding(new javafx.geometry.Insets(20, 150, 10, 10));

        // Add controls to the dialog content
        TextField nameField = new TextField(pet.getName());
        TextField petIdField = new TextField(pet.getPetId());
        TextField petTypeField = new TextField(pet.getPetType());
        Spinner<Integer> ageSpinner = new Spinner<>(0, Integer.MAX_VALUE, pet.getAge());
        TextField adoptionStatusField = new TextField(pet.getAdoptionStatus());
        TextField readyForAdoptionField = new TextField(pet.getReadyForAdoptionStatus());
        TextField treatmentStatusField = new TextField(pet.getTreatmentStatus());

        editGrid.add(new Label("Name:"), 0, 0);
        editGrid.add(nameField, 1, 0);
        editGrid.add(new Label("Pet ID:"), 0, 1);
        editGrid.add(petIdField, 1, 1);
        editGrid.add(new Label("Pet Type:"), 0, 2);
        editGrid.add(petTypeField, 1, 2);
        editGrid.add(new Label("Age:"), 0, 3);
        editGrid.add(ageSpinner, 1, 3);
        editGrid.add(new Label("Adoption Status:"), 0, 4);
        editGrid.add(adoptionStatusField, 1, 4);
        editGrid.add(new Label("Ready for Adoption:"), 0, 5);
        editGrid.add(readyForAdoptionField, 1, 5);
        editGrid.add(new Label("Treatment Status:"), 0, 6);
        editGrid.add(treatmentStatusField, 1, 6);

        dialog.getDialogPane().setContent(editGrid);

        // Request focus on the name field by default
        Platform.runLater(nameField::requestFocus);

        // Convert the result to a pet when the save button is clicked
        dialog.setResultConverter(dialogButton -> {
            if (dialogButton == saveButtonType) {
                return new Display_pets(
                        nameField.getText(),
                        petIdField.getText(),
                        petTypeField.getText(),
                        ageSpinner.getValue(),
                        adoptionStatusField.getText(),
                        readyForAdoptionField.getText(),
                        treatmentStatusField.getText()
                );
            }
            return null;
        });

        Optional<Display_pets> result = dialog.showAndWait();

        result.ifPresent(editedPet -> {
            // Update the pet in the list
            int index = petsList.indexOf(pet);
            petsList.set(index, editedPet);
            gridpane.getChildren().clear();
            buildPetGrid();
        });
    }

    private void deletePet(Display_pets pet) {
        petsList.remove(pet);
        gridpane.getChildren().clear();
        buildPetGrid();
    }




    private void buildPetGrid() {
        Font.font("Times new Roman", 5);
        gridpane.setAlignment(Pos.CENTER);
        gridpane.setVgap(10);
        gridpane.setHgap(30);

        gridpane.getColumnConstraints().clear();


        // Add column headers
        Font headerFont = Font.font("Times New Roman", FontWeight.BOLD, 18);

        String[] headerTexts = {"Name", "Pet ID", "Pet Type", "Age", "Adoption Status", "Adoption", "Treatment Status", "Edit", "Delete"};

        for (int i = 0; i < headerTexts.length; i++) {
            Label label = new Label(headerTexts[i]);
            label.setFont(headerFont);
            gridpane.add(label, i , 1);
            GridPane.setHalignment(label, HPos.CENTER);
        }
        double columnWidth = 1500.0 / (headerTexts.length + 2);  // +2 for Edit and Delete columns
        for (int i = 0; i < headerTexts.length; i++) {
            ColumnConstraints columnConstraints = new ColumnConstraints(columnWidth);
            gridpane.getColumnConstraints().add(columnConstraints);
        }

        // Add pet data to the grid
        for (int i = 0; i < petsList.size(); i++) {
            Display_pets pet = petsList.get(i);

            Label nameLabel = new Label(pet.getName());
            nameLabel.setFont(Font.font("Times New Roman", 14));
            gridpane.add(nameLabel, 0, i + 2);
            GridPane.setHalignment(nameLabel, HPos.CENTER);
            GridPane.setMargin(nameLabel, new javafx.geometry.Insets(2, 5, 2, 5));

            Label idLabel = new Label(pet.getPetId());
            idLabel.setFont(Font.font("Times New Roman", 14));
            gridpane.add(idLabel, 1, i + 2);
            GridPane.setHalignment(idLabel, HPos.CENTER);
            GridPane.setMargin(idLabel, new javafx.geometry.Insets(2, 5, 2, 5));

            Label typeLabel = new Label(pet.getPetType());
            typeLabel.setFont(Font.font("Times New Roman", 14));
            gridpane.add(typeLabel, 2, i + 2);
            GridPane.setHalignment(typeLabel, HPos.CENTER);
            GridPane.setMargin(typeLabel, new javafx.geometry.Insets(2, 5, 2, 5));

            Label ageLabel = new Label(String.valueOf(pet.getAge()));
            ageLabel.setFont(Font.font("Times New Roman", 14));
            gridpane.add(ageLabel, 3, i + 2);
            GridPane.setHalignment(ageLabel, HPos.CENTER);
            GridPane.setMargin(ageLabel, new javafx.geometry.Insets(2, 5, 2, 5));
            Label adoptionStatusLabel = new Label(pet.getAdoptionStatus());
            adoptionStatusLabel.setFont(Font.font("Times New Roman", 14));
            gridpane.add(adoptionStatusLabel, 4, i + 2);
            GridPane.setHalignment(adoptionStatusLabel, HPos.CENTER);
            GridPane.setMargin(adoptionStatusLabel, new javafx.geometry.Insets(2, 5, 2, 5));

            Label readyForAdoptionLabel = new Label(pet.getReadyForAdoptionStatus());
            readyForAdoptionLabel.setFont(Font.font("Times New Roman", 14));
            gridpane.add(readyForAdoptionLabel, 5, i + 2);
            GridPane.setHalignment(readyForAdoptionLabel, HPos.CENTER);
            GridPane.setMargin(readyForAdoptionLabel, new javafx.geometry.Insets(2, 5, 2, 5));

            Label treatmentStatusLabel = new Label(pet.getTreatmentStatus());
            treatmentStatusLabel.setFont(Font.font("Times New Roman", 14));
            gridpane.add(treatmentStatusLabel, 6, i + 2);
            GridPane.setHalignment(treatmentStatusLabel, HPos.CENTER);
            GridPane.setMargin(treatmentStatusLabel, new javafx.geometry.Insets(2, 10, 2, 5));

            // Create an "Edit" button for each row
            Button editButton = new Button("Edit");
            editButton.setStyle("-fx-font-size: 15");
            editButton.setPrefWidth(100);
            GridPane.setHgrow(editButton, javafx.scene.layout.Priority.ALWAYS);
            GridPane.setHalignment(editButton, HPos.CENTER);
            int currentRow = i + 1;
            editButton.setOnAction(event -> handleEditButtonClick(petsList.get(currentRow - 1)));
            gridpane.add(editButton, 7, i + 2);

            // Create a "Delete" button for each row
            Button deleteButton = new Button("Delete");
            deleteButton.setStyle("-fx-font-size: 15");
            deleteButton.setPrefWidth(100);
            GridPane.setHalignment(deleteButton, HPos.CENTER);
            deleteButton.setUserData(pet);
            deleteButton.setOnAction(event -> {
                Display_pets petToDelete = (Display_pets) deleteButton.getUserData();
                deletePet(petToDelete);
            });

            gridpane.add(deleteButton, 8, i + 2);

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        petsList = new ArrayList<>();

        petsList.add(new Display_pets("Fluffy", "1", "Dog", 3, "Available", "Ready", "Treated"));
        petsList.add(new Display_pets("Whiskers", "2", "Cat", 2, "Adopted", "Not Ready", "Sick"));
        petsList.add(new Display_pets("Mickey", "3", "Dog", 1, "Available", "Ready", "Treated"));
        petsList.add(new Display_pets("Roy", "4", "Cat", 1, "Adopted", "Not Ready", "Treated"));
        petsList.add(new Display_pets("Simba", "5", "Dog", 1, "Available", "Ready", "Treated"));
        petsList.add(new Display_pets("Martin", "6", "Cat", 1, "Adopted", "Not Ready", "Sick"));
        petsList.add(new Display_pets("Moslo", "7", "Dog", 1, "Available", "Ready", "Sick"));
        petsList.add(new Display_pets("lala", "8", "Cat", 1, "Adopted", "Not Ready", "Sick"));
        petsList.add(new Display_pets("Mando", "9", "Dog", 1, "Available", "Ready", "Sick"));
        petsList.add(new Display_pets("Tom", "10", "Cat", 1, "Adopted", "Not Ready", "Sick"));
        petsList.add(new Display_pets("Jerry", "11", "Dog", 1, "Available", "Ready", "Sick"));
        petsList.add(new Display_pets("Timon", "12", "Cat", 1, "Adopted", "Not Ready", "Treated"));
        petsList.add(new Display_pets("Bomba", "13", "Dog", 1, "Available", "Ready", "Treated"));
        petsList.add(new Display_pets("Scar", "14", "Cat", 1, "Adopted", "Not Ready", "Treated"));
        petsList.add(new Display_pets("Poe", "15", "Dog", 1, "Available", "Ready", "Sick"));
        petsList.add(new Display_pets("bahr", "16", "Cat", 1, "Adopted", "Not Ready", "Sick"));
        petsList.add(new Display_pets("Bambi", "17", "Dog", 1, "Available", "Ready", "Sick"));
        petsList.add(new Display_pets("Panda", "18", "Cat", 1, "Adopted", "Not Ready", "Treated"));


        buildPetGrid();
    }

    @FXML
    void Add_Pets(MouseEvent event) {
        try {
            Node node = (Node) event.getSource();
            Stage stage = (Stage) node.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("Add-pet.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception ex) {
            System.out.println("y" + ex.getMessage());

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




